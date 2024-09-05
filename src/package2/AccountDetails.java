package package2;

import package1.Account;

public class AccountDetails {
	
	Account acc;
	
	public int openAcc() 
	{
		acc=new Account("Saving",50000.0f);
		return acc.getAccNo();
		
	}
	public float addBal(int accNo,float amt)
	{
		float updateBal=0.0f;
		if(acc.getAccNo()==accNo)
		{
		    updateBal=acc.getAccBal() + amt;	
		}
		return updateBal;
	}

}
