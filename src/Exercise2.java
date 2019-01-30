import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        int a=2;
        int b=4;
        swapValues(a, b);


    }
    public static void swapValues(int a , int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);



        Scanner input = new Scanner(System.in);
        System.out.println("Enter name ");
        String nameOne = input.nextLine();
        System.out.println("Enter Family ");
        String nameFamily = input.nextLine();

        System.out.println(enterNameFamily(nameOne, nameFamily));


    }

    public static String enterNameFamily(String nameOne, String nameFamily) {

        return ("Hello " + nameOne + " " + nameFamily);




    }



}






