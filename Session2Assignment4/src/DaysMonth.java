import java.util.Scanner;
public class DaysMonth {
public static void main(String args[])
{
	System.out.println("enter the number of month to which the number of days has to be found");
Scanner scn=new Scanner(System.in);
int month =scn.nextInt();

	switch(month)
	{
	case 1:System.out.println("The Number of days in the month is 31");
	break;
	case 2:System.out.println("The Number of days in the month is 28");
	break;
	case 3:System.out.println("The Number of days in the month is 31");
	break;
	case 4:System.out.println("The Number of days in the month is 30");
	break;
	case 5:System.out.println("The Number of days in the month is 31");
	break;
	case 6:System.out.println("The Number of days in the month is 30");
	break;
	case 7:System.out.println("The Number of days in the month is 31");
	break;
	case 8:System.out.println("The Number of days in the month is 31");
	break;
	case 9:System.out.println("The Number of days in the month is 30");
	break;
	case 10:System.out.println("The Number of days in the month is 31");
	break;
	case 11:System.out.println("The Number of days in the month is 30");
	break;
	case 12:System.out.println("The Number of days in the month is 31");
	break;
	default:
		break;
		}
	
}
}
