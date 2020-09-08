import java.util.*;
public class MyClass {
	public static class client{
		String name ;
		long saving=10000;
		long checking=10000;
		HashMap<String,Integer> map1 = new HashMap<>();
		HashMap<String,Integer> map2 = new HashMap<>();
		
		
		client(String name,int saving,int checking)
		{
			this.name = name;
			this.saving=saving;
			this.checking=checking;
		}
		void show_balance()
		{
			System.out.println(saving);
			System.out.println(checking);
			
		}
		
	}
	public static class date{
		int dd = 1;
		int mm = 1;
		int yy = 2020;
		date(int dd,int mm,int yy)
		{
			this.dd=dd;
			this.mm=mm;
			this.yy=yy;
			
		}
		
	}
	public static String showd(date d)
	{
		String st = d.dd+"-"+d.mm+"-"+d.yy;
		return st;
	}
	public static void cl(int type,int account,client c,String date)
	{
		Scanner sc = new Scanner(System.in);
		c.show_balance();
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		if(amount%500==0)
		{
		if(account==1)
		{
			if(type==1)
			{
				if(amount>c.saving)
				{
					System.out.println("Not Enough Balance");
				}
				else
				{
					c.saving-=amount;
				c.map1.put(date+" "+"Credit",amount);
				}
				
			}
			else if(type==2)
			{
				c.saving+=amount;
				c.map1.put(date+" "+"Debit",amount);
			}
			
				
				
			
			System.out.println("Saving Account Transactions");
			System.out.println(c.map1);
			System.out.println("Final Balance = "+c.saving);
			System.out.println("Checking Account Transactions");
			System.out.println(c.map2);
			System.out.println("Final Balance = "+c.checking);
		}
		else if(account==2)
		{
			if(type==1)
			{
				if(amount>c.checking)
				{
					System.out.println("Not Enough Balance");
				}
				else
				{
					c.checking-=amount;
					c.map2.put(date+" "+"Credit",amount);
				}
				
			}
			else if(type==2)
			{
				c.checking+=amount;
				c.map2.put(date+" "+"Debit",amount);
			}
			
			System.out.println("Saving Account Transactions");
			System.out.println(c.map1);
			System.out.println("Final Balance = "+c.saving);
			System.out.println("Checking Account Transactions");
			System.out.println(c.map2);
			System.out.println("Final Balance = "+c.checking);
		}
		}
		else{
			System.out.println("Not a multiple of 500");
			return;
		}
	}
    public static void main(String args[]) {
		
		client c = new client("Amit",10000,10000);
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		date d1 = new date(7,8,2020);
		System.out.println("Select the Account type \n 1- Saving \n 2-Checking  ");
		int ac = sc.nextInt();
		System.out.println("Select \n 1-Debit \n 2- Credeit ");
		int t = sc.nextInt();
		cl(t,ac,c,showd(d1));
		}
		
		
    }
}