import java.util.Scanner;

class Math {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Input a double");
      double x = scan.nextDouble();
      System.out.println((int) (x + 0.5));
    }
}
