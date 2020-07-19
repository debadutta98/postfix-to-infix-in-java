 //This program is about (to convert the express from postfix to infix).so here it is
 import java.util.*;
 class Infix
 {
	 static Stack<String> ob;
	 static int c;
	 public static void postfix_to_infix(String t)
	 {
		 System.out.println(ob);
		 String arr[]=new String[2];
		 int c1=0;
		 c=2;
		 if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/") || t.equals("^"))
		 {
			 while(!ob.isEmpty()&&c!=c1)
			 {
				 arr[c1]=ob.pop();
				 c1++;
			 }
			 String s1="";
			 for(int i=arr.length-1;i>=0;i--)
			 {
				 if(i==arr.length-1)
				 s1="("+arr[i];
				 else
				 s1=s1+t+arr[i]+")";
			 }
			 ob.push(s1);
		 }
		 else
		 {
			 if(ob==null)
			 {
				 ob=new Stack<String>();
				 ob.push(t);
			 }
			 else
			 {
				 if(ob.isEmpty())
				 {
					 ob.push(t);
				 }
				 else
				 {
					 ob.push(t);
				 }
			 }
		 }
	 }
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number of test case");
		 int n=sc.nextInt();
		 while(n-->0)
		 {
			 System.out.println("Enter the Postfix express");
			 String s=sc.next();
			 for(int i=0;i<s.length();i++)
			 {
				String s1=String.valueOf(s.charAt(i));
				postfix_to_infix(s1);
			}
			System.out.println("this is your ans:-"+" "+ob.pop());
			if(!ob.isEmpty())
			{
				System.out.println("your postfix express is invalid");
			}
		}
	}
}