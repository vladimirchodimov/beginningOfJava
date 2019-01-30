import java.applet.Applet;
import java.awt.*;

public class EquilateralTriangle extends Applet
{

    int x [] = {480, 120, 480};
    int y [] = {120, 300, 480};


    public void paint (Graphics g) {
            g.fillPolygon(x,y,3);

        }

    }

