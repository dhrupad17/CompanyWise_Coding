/*
 * String matching where one string contains wildcard characters
 * g*ks
geeks
Matched
 * */

package com.gfgTcs.String;

import java.util.Scanner;

public class WildCardMatching {
	
	public static boolean isMatch(String s1,String s2) {
		if(s1.length()==0 && s2.length()==0)
			return true;
		//eliminate consequetive * from s1
		if(s1.length()>1 && s1.charAt(0)=='*')
		{
			int i=0;
			while(i+1<s1.length() && s1.charAt(i+1)=='*')
			{
				i++;
			}
			s1=s1.substring(i);
		}
		if(s1.length()>1 && s1.charAt(0)=='*' && s2.length()==0) {
			return false;
		}
		if ((s1.length() > 1 && s1.charAt(0) == '?') || (s1.length() != 0 && s2.length() != 0 && s1.charAt(0) == s2.charAt(0)))
		        return isMatch(s1.substring(1),s2.substring(1));
		if (s1.length() > 0 && s1.charAt(0) == '*')
	        return isMatch(s1.substring(1), s2) || isMatch(s1, s2.substring(1));
	    return false;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean flag=isMatch(s1,s2);
		if(flag)
			System.out.println("Matched");
		else
			System.out.println("Not Matched");
	}

}
