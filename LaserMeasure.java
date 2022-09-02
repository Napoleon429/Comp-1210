import java.util.Scanner;
/**
 * This code translates inches to a mix of imperial distance measurements.
 *@author Nathan Plourde
 *@version Sept. 01, 2022
 */


public class LaserMeasure {
    /**
    * Takes user input of inches and outputs the results.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int inches = 0;
      int inchesA = 0;
      int rMiles = 0;
      int rYard = 0;
      int rFeet = 0;
      int rInch = 0;
      System.out.print("Enter the raw distance measurement in inches: ");
      inches = userInput.nextInt();
      inchesA = inches;
      if (inches < 0)   {
         System.out.println("Measurement must be non-negative!");
      }
      else  {
         rMiles = inches / 63360;   //get miles
         System.out.println("Measurement by combined miles, "
            + "yards, feet, an inches");
         System.out.println("\tmiles: " + rMiles);
         inches = inches % 63360;   //find remainder inches from miles calc
         rYard = inches / 36;   //get yards
         System.out.println("\tyards: " + rYard);
         inches = inches % 36;   //find remainder inches from yards calc
         rFeet = inches / 12;
         System.out.println("\tfeet: " + rFeet);
         rInch = inches % 12;
         System.out.println("\tinches: " + rInch); 
         System.out.print(+inchesA);
         System.out.print(" in = " + rMiles + " mi, " + rYard + " yd, "); 
         System.out.print(+rFeet + " ft, " + rInch + " in");
      }
      
   }
}