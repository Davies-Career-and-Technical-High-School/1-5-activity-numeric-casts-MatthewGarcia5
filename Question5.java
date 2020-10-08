import java.util.Scanner;

class Math {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Input a double");
      double x = scan.nextDouble();
      x *= 100;
      int z = ((int) x);
      String s = String.valueOf(z);
      int y = s.length();
      System.out.print(s.charAt(y - 2) + " " + s.charAt(y - 1));

    }
}
