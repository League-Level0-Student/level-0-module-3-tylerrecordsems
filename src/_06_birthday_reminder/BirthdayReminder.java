
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "Febuary 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "July 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String A = JOptionPane.showInputDialog("What birthday do you want to know (Mom,Dad, and Me)");
		// 3. Print out what the user typed
		System.out.println(A);
		
		// 4. if user asked for "mom"
			//print mom's birthday
	if(A.equalsIgnoreCase("Mom")){
		 JOptionPane.showMessageDialog(null,momsBirthday);
	}
		// 5. if user asked for "dad"
			// print dad's birthday
	if(A.equalsIgnoreCase("Dad")){
		 JOptionPane.showMessageDialog(null,dadsBirthday);
	}
		// 6. if user asked for your name
			// print myBirthday
	if(A.equalsIgnoreCase("Me")){
		 JOptionPane.showMessageDialog(null,myBirthday);
	}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
