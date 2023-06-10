// Check the Given Number is Armstrong or Not?  153 

public class Armstrong {

   // public static int cube(int n, int s) {
   // if (n <= 9) {

   // s = n * n * n;
   // return s;
   // }

   // s = s + cube(n % 10, s) + cube(n / 10, s);
   // return s;

   // }

   public static void cube1(int n, int s, int c) {
      if (n <= 0) {

         System.out.println(((c == s) ? "Armstrong no" : "not Armstrong no"));

      } else {

         int d = n % 10;
         s = s + (d * d * d);
         n = n / 10;
         cube1(n, s, c);

      }

   }

   public static void main(String[] args) {
      int n = 153, c = n;
      // int p = cube(n, 0);
      // System.out.println(((c == p) ? "Armstrong no" : "not Armstrong no"));
      cube1(n, 0, c);

   }

}
