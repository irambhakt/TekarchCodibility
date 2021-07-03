package ProgrammingQuestions;

public class Vehicles 
{
	private int  vNumber;
	private String vModel;
	private int totalDuration;
	
	@Override
	public String toString() 
	{
		return "\n vNumber=" + vNumber + "\n vModel=" + vModel + "\n totalDuration=" + totalDuration + "\n";
	}
	public Vehicles(int vNumber, String vModel, int totalDuration)
	{
		super();
		this.vNumber = vNumber;
		this.vModel = vModel;
		this.totalDuration = totalDuration;
	}
	public int getvNumber() 
	{
		return vNumber;
	}
	public void setvNumber(int vNumber) 
	{
		this.vNumber = vNumber;
	}
	public String getvModel() 
	{
		return vModel;
	}
	public void setvModel(String vModel)
	{
		this.vModel = vModel;
	}
	public int getTotalDuration() 
	{
		return totalDuration;
	}
	public void setTotalDuration(int totalDuration) 
	{
		this.totalDuration = totalDuration;
	}
}
