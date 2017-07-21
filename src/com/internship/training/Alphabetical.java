package com.internship.training;

public class Alphabetical {
	public static void main(String[] args) {
	String s = "prasanthi";
	char temp;
			char[] ch = s.toCharArray();
	        for(int p=2;p<ch.length-2;p++)
	        {
	        	for(int q=2;q<ch.length-2;q++)
	        	{
	        		if(ch[p]>ch[q])
	        		{
	        			temp= ch[p];
	        			ch[p] = ch[q];
	        			ch[q] = temp;
	        		}
	        	}	}
	        for (int q =0;q<ch.length;q++)
	        {
	        	
	        System.out.println(ch[q]);
	        }
	}

}
