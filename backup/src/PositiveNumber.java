import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive or negative number ");
        int number = input.nextInt();
        System.out.println("You have entered "+ number);

        if (number > 0) {
            number *=1;
        } else number *=-1;

        System.out.println("positive number is " +number);




    }
}
