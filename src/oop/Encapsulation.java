package oop;
/*
 * ENCAPSULATION: data hiding.  prevents your data from being assessed by code outside your "shield" your data can be "hidden"
 * with the use of access modifiers (example: private, protected, default (not public)), and the use of getters/setters
 */

//Note how this class is "public"?  
public class Encapsulation {
//note how this instance variable is "public"	
	public String name;
//	When you create an object of encapsulation it requires a String	for the constructor
	Encapsulation (String name) {
		this.name = name;
	}
	
}	
//If you don't "encapsulate" your Encapsulation class and variables to private, a user can just change the data willy nilly with "public" modifier 
//from another class like this:
             //Encapsulation encapsulation = new Encapsulation ("Example");
            //encapsulation.name = "Another example";
//if you change your class variable "name" to "private" instead of public, would you be able to do "encapsulation.name = "Another example";"?
//No. however, you can allow your user to set it if you wanted, with a "setter".  if you don't have a setter though, "name" can't
//be manipulated at all from another class (see getters and setters_encapsulation) java project for more examples		
		
	
	
	
	



	

