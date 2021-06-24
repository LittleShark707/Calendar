package prog2;

import java.util.Scanner;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int month = 0;
	    int year = 0;

		System.out.print("enter a month (1 - 12): "); //month user input
		month = in.nextInt();
		
		System.out.print("enter a year: "); //year user input
		year = in.nextInt();

		 
		System.out.println();
		String monthh = "unknown";
		
	    int days = 0; //days in a month
	    switch (month) 
	    {
	     		case 1:
	     			monthh = "January";
	     			days = 31;
	     			break;
	            case 2:
	            	monthh = "February";
	                if (year / 4 == 0 && (year / 100 != 0 || year / 400 == 0)) //if leap year
	                {
	                	days = 29;
	                } 
	                else 
	                {
	                	days = 28; //if not leap year
	                }
	                break;
	            case 3:
	            	monthh = "March";
	            	days = 31;
	                break;
	            case 4:
	            	monthh = "April";
	            	days = 30;
	                break;
	            case 5:
	            	monthh = "May";
	            	days = 31;
	                break;
	            case 6:
	            	monthh = "June";
	            	days = 30;
	                break;
	            case 7:
	            	monthh = "July";
	            	days = 31;
	                break;
	            case 8:
	            	monthh = "August";
	            	days = 31;
	                break;
	            case 9:
	            	monthh = "September";
	            	days = 30;
	                break;
	            case 10:
	            	monthh = "October";
	            	days = 31;
	                break;
	            case 11:
	            	monthh = "November";
	            	days = 30;
	                break;
	            case 12:
	            	monthh = "December";
	            	days = 31;
	                break;
	     }

	     int day = 1;
	     int y = year;
	     int m = month;
	     int d = day;

	     if (month == 1 || month == 2) 
	     {
	    	 m = month + 12;
	    	 y = year - 1;
	     }
	     
	     int h = (d + (int) ((26 * (m + 1)) / 10) + y + (int) (y / 4)
	    		 + 6 * (int) (y / 100) + (int) (y / 400)) % 7;  //formula
	       
	     switch (h) 
	     {
	     	case 0:
	     	h += 7;
	     }
	     
        System.out.println("            " + monthh + " " + year); //displays month and year
	     
	     System.out.println("______________________________________");
	     System.out.println("Sun  Mon   Tue   Wed   Thu   Fri   Sat"); //displays days in a week

	     int dayy = 2 - h;
	     boolean done = false;
	        
	     while (!done) 
	     {
	    	 for (int col = 1; col <= 7 && !done; ++col) 
	    	 {
	    		 if (dayy > 0) 
	    		 {
	    			 System.out.printf("%2d ", dayy);
	    			 System.out.print("   ");
	    		 }
	    		 else 
	    		 {
	    			 System.out.print("      ");
	    		 }
	    		 if (dayy >= days)
	    		 {
	    			 done = true;
	    		 }
	                dayy++;
	    	 }
	    	 System.out.println();
	     }


	}

}
