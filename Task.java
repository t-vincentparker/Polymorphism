
/* Task.java  	COMP 1231         Vincent Parker
 * 
 * Class to represent a task object and define priority on task.
 * 
*/

public class Task implements Priority, Comparable<Task>
{
	
	private String taskmessage;
	private String prioritylevel;
	
	
	// Constructor: Stores task message and initial priority level
	public Task(String plevel, String tmessage)
	{
		
		prioritylevel = plevel;
		taskmessage = tmessage;
		
	}
	
	public String setPriority(String x)
	{
		prioritylevel = x;
		return prioritylevel;
		
	}
	
	public String getPriority()
	{
		return prioritylevel;
	}
	
	public int compareTo(Task other)
	{
		if (prioritylevel.equals(other.getPriority()))
			 System.out.println("Tasks are equal priority.");
		if (prioritylevel.compareTo(other.getPriority()) < 0 )
			 System.out.println("Task priority is less than the compared task.");
		if (prioritylevel.compareTo(other.getPriority()) > 0)
			 System.out.println("Task priority is greater than the compared task.");
		return 0;
	
	}
	
	
		


	

	
	

}
