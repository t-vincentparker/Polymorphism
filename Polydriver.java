/* Polydriver.java 		COMP 1231 		Vincent Parker
 * 
 * A class to demonstrate the features of Task objects represented
 * by Task.java
 * 
 */

import java.util.Arrays;


class Polydriver
{
	
	

	public static void main(String[] args)
	{
		Task[] tasklist = new Task[10];
	
		tasklist[0] = new Task("A1", "Do home work");
		tasklist[1] = new Task("A2", "Get coffee");
		tasklist[2] = new Task("A3","Drink Coffee");
		tasklist[3] = new Task("B3", "Hand in home work");
		tasklist[4] = new Task("B2","Procrastinate");
		tasklist[5] = new Task("B1","Drink Coffee");
		tasklist[6] = new Task("C2", "Research");
		tasklist[7] = new Task("C3", "Drink Coffee");
		tasklist[8] = new Task("C1", "Sleep");
		tasklist[9] = new Task("A4", "Eat");
		
		System.out.println("Task list before sorting.");
		
		for (int j=0; j<tasklist.length; j++)
			System.out.println(tasklist[j].toString());
		
		Arrays.sort(tasklist);
		
		System.out.println("Task list after sorting.");
		
		for (int h=0; h<tasklist.length; h++)
			System.out.println(tasklist[h].toString());
			
		
		
		
		
		
		

	}

}
