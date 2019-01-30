import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {

//        int f =100;
//        double c =(f-32) / 1.8;
//                System.out.println("c is " + c);


//        int a = 386;
//        System.out.println(a%10);
//        System.out.println((a%100)/10);

//        boolean a = true;
//        byte b =56;
//        boolean grad = a || b>60;
//        System.out.println(grad);

//        int a=19;
//        boolean chetno = (a % 2 == 0);
//        System.out.println(chetno);

//        int a=35;
//        boolean kratno = (a % 5 == 0) && (a % 5 == 0);
//        System.out.println(kratno);

//        double sallary = 1000;
//        byte bonus = 50;
//        byte sale = 101;
//
//        if (sale >= 100) {
//            sallary = sallary + bonus;
//            System.out.println(sallary);
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Vyvedi mesec");
//        int month = input.nextInt();
//        String season = "";
//        if (month > 0 && month <= 3 || month == 12) {
//            season = "zima";
//        }
//
//        if (month > 3 && month <= 6) {
//            season = "prolet";
//        } else System.out.println("vyvedete mesec nad 0");
//
//        System.out.println(season);


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Vyvedi chislo");
//
//        int number = input.nextInt();
//
//
//        if (number % 2 == 0) {
//
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Vyvedi ocenka");
//
//        int number = input.nextInt();
//
//        if (number <= 2 && number <= 6) {
//
//
//            if (number == 2) {
//
//                System.out.println("slab");
//
//            } else if (number == 3) {
//                System.out.println("sreden");
//            } else if (number == 4) {
//                System.out.println("dobyr");
//
//            } else if (number == 5) {
//                System.out.println(" mn dobyr");
//            } else if (number == 6) System.out.println(" otl");
//        } else System.out.println("vyvedi ot 2 do 6");
//
//
//    }
//}
//
//}

//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter pPalindrom number ");
//        int number = input.nextInt();
//        System.out.println("You have entered " + number);
//
//        int a = (number / 1000);
//        int b = (number % 1000 / 100);
//        int c = (number % 100 / 10);
//        int d = (number % 10);
//
//
//        System.out.println("a is: " + a);
//        System.out.println("b is: " + b);
//        System.out.println("c is: " + c);
//        System.out.println("d is: " + d);
//
//        if (a+b == c+d) {
//            System.out.println("is palindrom");
//        }else{ System.out.println("is not palindrom");
//        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter valute ");
        int value = input.nextInt();

        System.out.println("molq izberet valuta usd eur gbp ");
        String currency = input.next();

        if (currency.equals(("usd"))) {
            System.out.println(value * 1.7408 + "BGN");
        } else if (currency.equals(("eur"))) {
            System.out.println(value * 1.9508 + "BGN");
        }


        int a = 5;
        a += 10; // същото като a = a + 10;
        a -= 7; // същото като a = a - 7;
        a *= 4; // същото като a = a * 4;
        a /= 2; // същото като a = a / 2;
        a %= 3; // същото като a = a % 3;
        System.out.println("a = " + a);

    }

}