import java.util.Scanner;

class Math {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Put in a number");
        double x = scan.nextDouble();
        System.out.println("Put in another number");
        double y = scan.nextDouble();
        System.out.println((x + y) / 2);
    }
}
