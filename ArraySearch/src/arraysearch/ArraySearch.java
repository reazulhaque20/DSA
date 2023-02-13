/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysearch;

/**
 *
 * @author Reazul-System
 */
public class ArraySearch {

    /**
     * @param args the command line arguments
     */
    static int[] sort(int a[]){
	int len=a.length, temp=0;
	for(int i=0; i<len; i++){
	    for(int j=0; j<len-i-1; j++){
		if(a[j]>a[j+1]){
		    temp = a[j+1];
		    a[j+1] = a[j];
		    a[j] = temp;
		}//end if
	    }//end inner for
	}//end outer for
        for(int d : a){
            System.out.println("Sorted Items: "+d);
        }
	return a;
    }
    static void search(int a[], int x){
	int sortArry[] = sort(a);
	int len = sortArry.length, lo=0, hi=sortArry.length-1;
	while(hi-lo>1){
	    int mid = (hi+lo)/2;
	    if(x>sortArry[mid]){
		lo=mid+1;
	    }else{
		hi=mid;
	    }
	    if(sortArry[lo] == x){
		System.out.println("Found At Index: "+lo);
                break;
	    }else if(sortArry[hi] == x){
		System.out.println("Found At Index: "+hi);
                break;
	    }else{
		System.out.println("Not Found");
	    }
	}
    }
    public static void main(String[] args) {
	// TODO code application logic here
	int a[] = {2,5,3,6,7,1,9,4,8};
	int x = 9;
	search(a, x);
    }
    
}
