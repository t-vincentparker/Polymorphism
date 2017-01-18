
/* Task.java  	COMP 1231         Vincent Parker
 * 
 * Class to represent a task object and define priority on task.
 * 
*/

public class Task implements Priority, Comparable<Task>
{

	private String tmessage;
	private String plevel;

	
	
	// Constructor: Stores task message and initial priority level
	public Task(String plevel, String tmessage )
	{
		this.plevel = plevel;
		this.tmessage = tmessage;
	}
	
	
	// Method to set priority level
	public String setPriority()
	{
				return plevel;
	}
	
	
	//Method to return priority level
	public String getPriority()
	{
		return plevel;
	}
	
	
	//Method to return Task message
	public String getTaskmessage()
	{
		return tmessage;
	}
	
	
	//Method to set Task message
	public String setTaskmessage(String t)
	{
		tmessage = t;
		return tmessage;
	}
	
	
	//Compare to method which compares priority levels of tasks
	public int compareTo(Task other)
	{
		return plevel.compareTo( other.plevel);
   }

	
	
	
	
	
		


	

	
	

}
