/* Decompiler 4ms, total 220ms, lines 26 */
package lab5;

import java.util.Scanner;

public class Factorials {
   public static void main(String[] args) {
      String keepGoing = "y";
      Scanner scan = new Scanner(System.in);

      while(keepGoing.equalsIgnoreCase("y")) {
         System.out.print("Enter an integer: ");
         int val = scan.nextInt();

         try {
            System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
         } catch (TooLargeArgumentException | NegativeArgumentException var8) {
            System.out.println(var8);
         } finally {
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
         }
      }

   }
}
