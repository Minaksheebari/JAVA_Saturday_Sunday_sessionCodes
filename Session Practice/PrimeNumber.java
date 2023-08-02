public class PrimeNumber {
        public static void main(String[] args) {
        
          int n = 12;
          int count = 0;
    
          if (n <= 1) {
            System.out.println("The number is not prime");
            return;
          }
          for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
              count++;
            }
          }
          if (count > 1) {
              System.out.println(n + " is NOT prime");
          }
          else {
            System.out.println(n + " is prime");
          }
     }
}     
