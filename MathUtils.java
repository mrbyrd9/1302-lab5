/* Decompiler 3ms, total 73ms, lines 21 */
package lab5;

public class MathUtils {
   public static int factorial(int n) throws NegativeArgumentException, TooLargeArgumentException {
      int fac = 1;
      NegativeArgumentException neg = new NegativeArgumentException("Factorial is undefined for negative integers");
      TooLargeArgumentException big = new TooLargeArgumentException("Factorial(" + n + ") is too large - overflow occurs!");
      if (n < 0) {
         throw neg;
      } else if (n > 16) {
         throw big;
      } else {
         for(int i = n; i > 0; --i) {
            fac *= i;
         }

         return fac;
      }
   }
}
