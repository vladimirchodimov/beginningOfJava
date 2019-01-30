import com.sun.prism.shader.Solid_ImagePattern_Loader;
import sun.util.locale.provider.SPILocaleProviderAdapter;

public class triangle2 {
    public static void main(String[] args) {

        int h;
        h = 9;

        for (int i = 1; i <= h; i++) {
            for (int j = h - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("\u00A9");

            }
//            System.out.println(" ");

        }

    }
}
