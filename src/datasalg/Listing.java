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
//this is assignment 1, problems 41 & 42
import java.util.Scanner;
public class Listing {
    private String name;
    private int age;
  
    
public Listing ()
  {     
      name = "";
      age= 0;
        
  }

public Listing (String n, int x)
{   
    name = n;
    age = x;
  
}

public String toString()
{
    
     return (this.name + ", " + this.age + " year's old");
    
}
    
public void input()
{
     Scanner keyboard = new Scanner(System.in);//not sure if i need this within the method
     System.out.println("OK, let's enter a new person.  What is this person's name?");
             this.name= keyboard.nextLine();
     System.out.println("How old is this person?");
            this.age = keyboard.nextInt();
}

public void setName(String n )
{
    this.name = n;
}
 
public String getName()
{ 
    return this.name;
}

public void setAge(int a)
{
    this.age = a; 
}

public int getAge()
{
    return this.age;
}

}
       
        
