package ejercicio12;

public class JobDescription {
	
	private double effor;
	private int priority;
	private String description;
	
	public JobDescription(double effor,int priority,String description) 
	{
		this.effor = effor;
		this.priority = priority;
		this.description = description;
		
	}

	public double getEffor() {
		return effor;
	}

	public void setEffor(double effor) {
		this.effor = effor;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
