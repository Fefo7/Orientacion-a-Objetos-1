package ejercicio12;

import java.util.LinkedList;


public interface IStrategy {
	
	public JobDescription getJob(LinkedList<JobDescription> pendientes); 
}
