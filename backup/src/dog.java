import java.util.Spliterator;

public class dog {

    public static void main(String[] args) {

        String dogName = "Bucky";
        String dogFamily = "Tesla";
        byte dogAge = 8;
        String holderName = "Nikola";
        String holderFamily = "Tesla";
        int holderAge = 19;
        String cardNumer = "1233211";
        byte h = (byte) (dogAge * 7);
        System.out.println( "_____________________________________" );
        System.out.println("Certificate № \t "  + cardNumer);
        System.out.println( "_____________________________________" );

        System.out.println("Holder Name \t "  + holderName + "\t" + holderFamily);
        System.out.println("Age of the holder \t "  + holderAge  + "\t Years");
        System.out.println("Dog Name \t "  + dogName + "\t" + dogFamily);
        System.out.println("Age of the Dog\t" + dogAge  +" "+ "(" + h + ")"+ "\t Years");
        System.out.println("Children 12 " );
        System.out.println( "_____________________________________" );



    }
}
