/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysort;

/**
 *
 * @author Reazul-System
 */
public class ArraySort {

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
	return a;
    }
    public static void main(String[] args) {
	// TODO code application logic here
	int a[] = {2,5,3,6,7,1,9,4,8};
	int sortArray[] = sort(a);
	for(int b : sortArray){
	    System.out.println("Sorted Array: "+b);
	}
    }
    
}
