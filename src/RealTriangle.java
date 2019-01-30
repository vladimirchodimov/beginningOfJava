import java.util.Scanner;

public class RealTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter A ");
        int A = input.nextInt();
        System.out.println("Enter B ");
        int B = input.nextInt();
        System.out.println("Enter C ");
        int C = input.nextInt();

        if (A > 0 && B > 0 && C > 0) {
            if (A < (B + C) && B < (A + C) && C < (A + B)) {
                System.out.println("The triangle exists");
            } else {
                System.out.println("The triangle doesen't exist");
            }


        } else {
            System.out.println("Enter positive number ");
        }

    }
}
