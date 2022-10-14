package oop;

/*
 * Abstraction: Like "code hiding". Only the essential things are shown to a user.  The internal
 * code is hidden.  For example, if you have a single method that houses a bunch of other methods
 * created, hiding their functionality  
 */
public class Abstraction {

//For example, here is one method that adds a ! to a String if it ends with a "."	
	public static String exclamate(String noun) {
		if (noun.endsWith(".")) {
			return noun.replace('.', '!');
		} else {
			return noun;
		}
	}
//And here is another method that adds a ? to a String
	public static String questionIt(String noun) {
		return noun + "?";
	}

//This method exclamateAndQuestion contains the methods exclamate and questionIt inside of it, hiding the
//code belonging to those methods inside a new method (aka making it abstract). This method hides the details of exclamate and questionIt.	
	public static String exclamateAndQuestionIt(String word) {
		return questionIt(exclamate(word));
	}

	public static void main(String[] args) {
		System.out.println(exclamateAndQuestionIt("Good morning."));
	}

}
