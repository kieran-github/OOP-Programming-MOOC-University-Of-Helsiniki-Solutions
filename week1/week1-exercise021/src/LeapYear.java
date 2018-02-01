import java.util.Scanner;

public class LeapYear {
	private static Scanner input = new Scanner(System.in);
    private static float year;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type a year: ");
        year = input.nextFloat();
        if (year % 4 == 0) {
            if(year % 100 != 0 ) {
                System.out.println("The year is a leap year.");
            } else {
                if (year % 400 != 0){
                    System.out.println("The year is not a leap year.");
                } else {
                    System.out.println("The year is a leap year.");
                }
            }
        } else {   
            System.out.println("The year is not a leap year.");
        }
    }
}