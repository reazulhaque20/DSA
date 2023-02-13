/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrightrotate;

/**
 *
 * @author reazulhaque
 */
public class ArrayRightRotate {

    /**
     * @param args the command line arguments
     */
    static int[] rightRotate(int a[], int rotation){
        int len=a.length, k=0;
        int temp[] = new int[len];
        for(int i=rotation; i<len-1;i++){
            temp[k]=a[i+1];
            k++;
        }
        for(int i=0; i<=rotation;i++){
            temp[k]=a[i];
            k++;
        }
        return temp;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {1,2,3,4,5};
        int rotation = 2;
        System.out.print("Given Array: ");
        for(int i : a){
            System.out.print(i);
        }
        int rightRotateArray[] = rightRotate(a, rotation);
        System.out.println("");
        System.out.print("Right Rotated Array: ");
        for(int i : rightRotateArray){
            System.out.print(i);
        }
    }
    
}
