import java.sql.Time;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;

public class mathAB {
    public static void main(String[] args) {
        double a= 5;
        double b= 11;
        double answer;
        byte pesho;
        Scanner input =new Scanner(System.in);

int x =7;


        Time vreme =new Time(10);
Timer hronos=new Timer();
int start=0;
vreme.getTime();
hronos.purge();


        do {
            System.out.println("Time= " + vreme);
            System.out.println("Hronos= " + hronos );
        } while (input.nextInt()!=2);

    }

}
