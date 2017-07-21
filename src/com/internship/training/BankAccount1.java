package com.internship.training;

import java.util.Scanner;

public class BankAccount1 {
	static	double account;
	static	String name;
	static double balance;
	static	int amt;
	static	int amt2;
	static	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	System.out.println("what is your account number?");
       // Scanner sc = new Scanner(System.in);
	    account = sc.nextInt();
	    System.out.println("what is your name?");
	     name = sc.next();
	    System.out.println("how much balance do you have?");
	    balance = sc.nextDouble();
	    System.out.println("press 1 for deposit,2 for withdrawal,3 to check balance");
		   int requiredNumber = sc.nextInt();
	    switch(requiredNumber)
		   {
		   case 1:
			   deposit();
			
			  break;
		   case 2:
			   withdraw();
			   break;
		   case 3 :
			   checkBalance();
		   }
	}
	    public static void deposit ()
	    {
	    	System.out.println("how much do u wanna deposit?");
	    	 amt = sc.nextInt();
	    	balance = amt + balance;
	    	
	    }
       public static void withdraw()
       {
    	   System.out.println("how much do u wanna withdraw?");
    	   double amt2 = sc.nextDouble();
    			   if(amt2>balance)
    			   {
    				   System.out.println("insuffcient balance");
    				  
                    }
    			   else
    			   {
    			   balance = balance- amt2;
    			   System.out.println("you have successfully withdrew"+amt2+"and your current balance is "+balance);}
       }
       public static void checkBalance()
       {
    	   System.out.println("your current balance is "+balance);
       }
	
}