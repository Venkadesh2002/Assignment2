package com.venkadesh;

public class TimeConvertion {
   public void timeconvertion(long sec)
   {
	   long hour=(sec/3600);
	   long minutes=((sec%3600)/60);
	   long second=(minutes/60);
	   
	   
	   
	   StringBuilder sb=new StringBuilder();
	   
	  
	   
	   if(hour<10)
	   {
		   sb.append(0);
		   sb.append(hour);
		   sb.append(":");
	   }
	   else {
		   sb.append(hour);
		   sb.append(":");
	        }
	   
	   
	   if(minutes<10)
	   {
		   sb.append(0);
		   sb.append(minutes);
		   sb.append(":");
	   }
	   else {
		   sb.append(minutes);
		   sb.append(":");
	        }
	   
	   
	   if(second<10)
	   {
		   sb.append(0);
		   sb.append(second);
	   }
	   else {
		   sb.append(second);
	        }
	
	   	  System.out.print("The time is ");
	      System.out.println(sb);
	   
   }
}