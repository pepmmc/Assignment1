/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasalg;

/**
 *
 * @author oeoobee
 */
//this is assignment 41

import java.util.Scanner;
public class DataSalg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /* Listing PersonOne = new Listing();
    Listing PersonTwo = new Listing("Ed", 62);
    Listing PersonThree = new Listing ("Rembrandt",62 );
    Listing PersonFour = new Listing ("Caravaggio", 53);
    Listing PersonFive = new Listing ("Hokusai", 88);
    PersonOne.input();
    System.out.println();
    System.out.println(PersonOne.toString());
    System.out.println(PersonTwo.toString());
    System.out.println(PersonThree.toString());
    System.out.println(PersonFour.toString());
    System.out.println(PersonFive.toString());
    
    
    PersonTwo.setName("Edward");
    PersonOne.setAge(55);
    PersonThree.setName("Rembrand van Rijn");
    PersonFour.setName("Michaelangelo Merisi Caravaggio");
    
    System.out.println();
    System.out.println(PersonOne.toString());
    System.out.println(PersonTwo.toString());
    System.out.println(PersonThree.toString());
    System.out.println(PersonFour.toString());
    System.out.println(PersonFive.toString());
    */
    
   
        Listing[] Problem42 = new Listing[3];
        int i=0;
        while (i<3)
        {
            Problem42[i] = new Listing();
            Problem42[i].input();
            i++;
            
            
        }
    
      int z =2;
        while (z>= 0)
       {
            System.out.println(Problem42[z].toString());
            z--;
        }
        
    
  
    }
    
}
