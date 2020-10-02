/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysex;

import java.util.Arrays;

/**
 *
 * @author Aline Vetrov
 * @exersize Arrays
 * @date Oct 2, 2020
 */
public class ArraysEx {

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
        
        int[] exArr5 = new int[5];
        Arrays.fill(exArr5, 1);
        for (int i : exArr5) {
            print(i);
        }
        
        Arrays.fill(exArr5, 0, 2, 100);
        for (int i : exArr5) {
            print(i);
        }
        
        //sorting
        int[] sortArr = {3,2,1,4,5,6,10,9,8,7};
        Arrays.sort(sortArr);
        print(Arrays.toString(sortArr));
        
        String[] products = {"mysql","jsp","java","apache"};
        print(Arrays.toString(products));
        Arrays.sort(products);
        print(Arrays.toString(products));
        
        //binary search we must always sort array before sach is executed
        int index = Arrays.binarySearch(products, "java");
        print("java found in products at: " + index);
        index = Arrays.binarySearch(products, "mysql");
        print("mysql found in products at: " + index);
        
        //negative value means not found, the value after the minus would be 
        //the position of the searched value if exist
        index = Arrays.binarySearch(products, "other");
        print("other found in products at: " + index);
        
        
        //comparing arrays
        
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {5,4,3,2,1};
        
        
        //false
        print("compare arr1 and arr2: " + (arr1 == arr2));
        
        //true
        print("compare arr1 and arr2: " + Arrays.equals(arr1, arr2));
        //false
        print("compare arr1 and arr2: " + Arrays.equals(arr1, arr3));
        
        //false - extension check memory pointer location equality
        print("compare arr1 and arr2 using extension: " + arr1.equals(arr2));
        
        
        int[] copyArr;
        copyArr = Arrays.copyOf(arr3, arr3.length);
        print("copy of arr3: " + Arrays.toString(copyArr));
        
        //sort is not affecting the copy
        Arrays.sort(arr3);
        print("arr3: " + Arrays.toString(arr3));
        print("copy of arr3: " + Arrays.toString(copyArr));
        
        
        
    }
    
    static void print(Object obj) {
        System.out.println(obj);
    }
}
