package package1;

public class Account {
	
	private int accNo;
	private String accType;
	private float accBal;
	private static int series=1000;
	
	public Account(String accType,float accBal)
	{
		this.accNo = series;
		series++;
		this.accType = accType;
		this.accBal = accBal;
		
	}
	
	/*
	 * public void setAccNo(int accNo) { this.accNo = accNo; }
	 */
	public void setAccType(String accType)
	{
		this.accType = accType;
	}
	public void setAccBal(float accBal)
	{
		this.accBal=accBal;
	}
	
	// getter method or successer method
	public int getAccNo()
	{
		return accNo;
	}
	
	public String getAccType()
	{
		return accType;
	}
	public float getAccBal()
	{
		return accBal;
	}
	

}
