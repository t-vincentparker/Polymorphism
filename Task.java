
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
	public Task(String plevel, String tmessage, boolean stat )
	{
		
		this.plevel = plevel;
		this.tmessage = tmessage;
		

	}
	
	public String setPriority()
	{

		
		return plevel;
		
	}
	
	public String getPriority()
	{
		return plevel;
	}
	
	public String getTaskmessage()
	{
		return tmessage;
	}
	
	public String setTaskmessage(String t)
	{
		tmessage = t;
		return tmessage;
	}
	
	public int compareTo(Task other)
	{
		return plevel.compareTo( other.plevel);
   }

	
	public void edittaskmessage(String msg)
	{
		taskmessage = msg;
	}
	
	public String  getTaskmessage()
	{
		return taskmessage;
	}
	
	
	
		


	

	
	

}
