package ejercicio12;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MostEffort implements IStrategy {

	@Override
	public JobDescription getJob(LinkedList<JobDescription> pendientes) {
		JobDescription max = Collections.max(pendientes, Comparator.comparingDouble(p-> p.getEffor()));
		pendientes.remove(max);
		
		
		return max; 
	}

}
