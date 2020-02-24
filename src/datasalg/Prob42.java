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
public class Prob42 {
    public static void main(String[] args) {
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
