import java.util.Scanner;

public class RotateNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive or negative number ");
        int number = input.nextInt();
        System.out.println("You have entered "+ number);

        int a =(number %1000/100 );
        int b =(number %100 / 10);
        int c =(number %10);

        System.out.println("a is: " +a);
        System.out.println("b is: " +b);
        System.out.println("c is: " +c);
        int d = a+b+c;

        System.out.println("Сборът им е:" + d);
        System.out.println("Rotate CAB " +c+a+b );
        System.out.println("Rotate CBA " +c+b+a );
    }

}
