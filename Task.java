
/* Task.java  	COMP 1231         Vincent Parker
 * 
 * Class to represent a task object and define priority on task.
 * 
*/

public class Task implements Priority
{
	
	private String taskmessage;
	private int prioritylevel;
	
	
	// Constructor: Stores task message and initial priority level
	public Task(int plevel, String tmessage)
	{
		
		prioritylevel = plevel;
		taskmessage = tmessage;
		
	}
	
	public void setPriority(int x)
	{
		prioritylevel = x;
		
	}
	
	public int getPriority()
	{
		return prioritylevel;
	}
	
	public int compareTo()
	{
		if (plevel.comareTo(comptask.getPriority()) > 0)
			
	}
	
	{
		

	}

}
