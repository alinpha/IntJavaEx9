/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aline Vetrov
 * @exersize Generic lists
 * @date Oct 2, 2020
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> strings = new ArrayList();
        ArrayList<Integer> integers = new ArrayList();
        ArrayList<Foo> foos = new ArrayList();
        
        //List<Foo> moreFoos = new List<Foo>(); -- C#
        List<Foo> moreFoos = new ArrayList();
        
        generateFoosArray(foos);
        generateIntArrayList(integers);
        generateStringArrayList(strings);
        
        displayArrayList(foos);
        displayArrayList(integers);
        displayArrayList(strings);
        
        displayGenericList(foos);
        displayGenericList(integers);
        displayGenericList(strings);
        
        print("integers cleared");
        displayGenericList(integers);
        
        generateIntArrayList(integers);
        print("remove from integers by index");
        integers.remove(1);
        displayGenericList(integers);
        
        print("add the second item back in");
        integers.add(1, 2);
        displayGenericList(integers);
        
        integers.add(4);
        displayGenericList(integers);
        
        print("does the foo list contain jim");
        
        boolean a = foos.contains(new Foo("Jim"));
        
        if (a) {
            print("yes");
        } else {
            print("no");
        }
        
        Foo forthFoo = new Foo("Uhura");
        
        print("does the foo list contain uhura");
        
        boolean b = foos.contains(forthFoo);
        
        if (a) {
            print("yes");
        } else {
            print("no");
        }
        
        integers.clear();
        
        if (integers.isEmpty()) {
            print("the integers are empty");
        }
        
        generateIntArrayList(integers);
        
        if (integers.isEmpty()) {
            print("the integers are empty");
        } else {
            print("the integers are in place");
        }
        
        foos.remove(forthFoo);
        
        foos.add(1, new Foo("boom"));
        
        displayGenericList(foos);
    }
    
    static <T> void displayGenericList(List<T> list) {
        
        if (list.size() == 0) {
            print("no items in collection");
            return;
        }
        
        for (T elm : list) {
            print(elm.toString());
        }
    }
    
    static void generateFoosArray(ArrayList<Foo> foos) {
        foos.add(new Foo("Jim"));
        foos.add(new Foo("Spock"));
        foos.add(new Foo("McCoy"));
    }
    
    static void generateIntArrayList(ArrayList<Integer> intArrList) {
        intArrList.add(1);
        intArrList.add(2);
        intArrList.add(3);
    }
    
    static void generateStringArrayList(ArrayList<String> strArrList) {
        strArrList.add("String 1");
        strArrList.add("String 2");
        strArrList.add("String 3");
    }
    
    static void displayArrayList(ArrayList al) {
        if (al.size() == 0) {
            print("no elements");
            return;
        }
        
        print("using standard for loop");
        
        for (int i=0; i<al.size(); i++) {
            print(al.get(i).toString());
        }
    }
    
    static void print(Object obj) {
        System.out.println(obj);
    }
    
}
