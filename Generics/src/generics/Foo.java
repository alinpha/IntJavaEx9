/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author pha
 */
public class Foo {
    
    private String name;
    private String rank;
    
    public Foo(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getRank() {
        return rank;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public void fireWeapon() {
        System.out.println("bang");
    }
    
    /**
     * Overriding the bas class toString
     * @return 
     */
    public String toString() {
        return "I am " + this.name + " " + (this.rank == null ? "" : this.rank);
    }
}
