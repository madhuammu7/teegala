package multhithreadings;

public class prioritydemo extends Thread {
	public void run()
	{
		System.out.println("The running thread is :" +Thread.currentThread().getName());
		System.out.println("The running thread priority is :" +Thread.currentThread().getPriority());
		
	}
}