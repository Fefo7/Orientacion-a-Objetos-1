package ejercicio12;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class HighestPriority implements IStrategy {

	@Override
	public JobDescription getJob(LinkedList<JobDescription> pendientes) {
	
		JobDescription max =  Collections.max(pendientes, Comparator.comparingInt(p-> p.getPriority()));
		pendientes.remove(max);
		return max; 


	}

}
