/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author pha
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] exampleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] exArr2 = new int[2];
        
        int[][] exArr3 = new int[3][3];
        
        int[][] exArr4 = {{1,2,3},{4,5},{7,8,9}};
        
        print("arr size of exAr1: " + exampleArray.length);
        print("arr size of exAr2: " + exArr2.length);
        print("arr size of exAr3: " + exArr3.length);
        print("arr size of exAr4: " + exArr4.length);
        
        for (int i=0; i<exampleArray.length; i++) {
            print(exampleArray[i]);
        }
        
        //enhanced for loop
        for (int elm : exampleArray) {
            print(elm);
        }
        
        //enhance for on multidim 
        for(int[] arr : exArr4) {
            for(int elm : arr) {
                print("md elm:\t" + elm);
            }
        }
    }
    
    static void print(Object obj) {
        System.out.println(obj);
    }
    
}
