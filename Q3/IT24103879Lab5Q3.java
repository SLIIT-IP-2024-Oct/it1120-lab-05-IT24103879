import java.util.Scanner;

public class IT24103879Lab5Q3 {

    private static final double ROOM_CHARGE_PER_DAY = 48000.00;
	private static final int DISCOUNT_3_4_DAYS = 10;
	private static final int DISCOUT_5_OR_MORE_DAYS = 20;
	
	public static void main(String[] args) {
	
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("Enter Start Date (1-31): ");
	   int startDate = input.nextInt();
	   System.out.println("Enter End Date (1-31): ");
	   int endDate = input.nextInt();
	   
	   if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
	       System.out.println("Error: Days must be between 1 and 31.");
		   return; // Exit Program
	   }
	   
	   if (startDate >= endDate) {
	       System.out.println("Error: Start Date must be less that End Date.");
		   return; // Exit Program
	   }
	   
	   
	   int daysReserved = endDate - startDate;
	   
	   double totalCharge = daysReserved * ROOM_CHARGE_PER_DAY;
	   
	   int discountRate = 10;
	   if (daysReserved > 3 && daysReserved < 4) {
	       discountRate = DISCOUNT_3_4_DAYS;
	   } else if (daysReserved >= 5) {
	       discountRate = DISCOUT_5_OR_MORE_DAYS;
	   }
	   
	   double discountAmount = (totalCharge * discountRate)/100;
	   double finalAmount = totalCharge - discountAmount;
	   
	   
	   System.out.println("Room Charge Per Day: " + ROOM_CHARGE_PER_DAY);
	   System.out.println("Number of Days Reserved: " + daysReserved);
	   System.out.println("Total Amount to be Paid: " + finalAmount);
	   
	}
}