package ejercicio12;

import java.util.LinkedList;


public class Fifo implements IStrategy {

	
	@Override
	public JobDescription getJob(LinkedList<JobDescription> pendientes) {
		return  pendientes.removeFirst();
	}

}
