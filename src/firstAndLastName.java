import java.util.Scanner;

public class firstAndLastName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" please enter number");
        int number = input.nextInt();


evenNumber(number);
    }

    public static void  evenNumber (int number){

        if (number%2 ==0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }

    }

}
