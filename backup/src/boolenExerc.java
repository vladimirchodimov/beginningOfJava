import java.util.Scanner;

public class boolenExerc {
    public static void main(String[] args) {
        double NumberA;
        double NumberB;


        Scanner input =new Scanner(System.in);
        System.out.print("Enter number");
        Long numberA = Long.valueOf(input.nextLine());
        System.out.println("You have entered "+numberA);

        Scanner inputB =new Scanner(System.in);
        System.out.print("Enter number");
        Long numberB = Long.valueOf(input.nextLine());
        System.out.println("You have entered "+numberB);


        boolean correct =(numberA <= 3) && (numberB <= 4);
        System.out.println("Int the quadange: "+ correct);



    }


}
