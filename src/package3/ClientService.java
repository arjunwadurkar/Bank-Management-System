package package3;

import package2.AccountDetails;

public class ClientService 
{
	public static void main(String[] args) 
	{
		AccountDetails obj = new AccountDetails();
		int accNo=obj.openAcc();
		System.out.println("Your Acccount open SuccessFully and Accoun No. is : "+accNo);
		
		float updatedBal=obj.addBal(1000, 10000.0f);
		System.out.println("Now Your Account Balance Is : "+updatedBal);
		
	}
	

}
