package ejercicio12;

import java.util.*;

public class JobScheduler {
	private LinkedList<JobDescription> pendientes;
	
	public JobScheduler() 
	{
		this.pendientes = new LinkedList<JobDescription>();
	}
	
	public void schedule(JobDescription job) 
	{
		this.pendientes.add(job);
	}
	public void unschedule(JobDescription job) 
	{
		this.pendientes.removeIf(j -> j.equals(job));
	}
	public LinkedList<JobDescription> getJobs() {
		return pendientes;
	}

	public JobDescription next(IStrategy strategy) 
	{
		if(!this.pendientes.isEmpty())
			return strategy.getJob(this.pendientes);
		
		return null;
	}
	
	
}
