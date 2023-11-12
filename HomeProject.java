import java.awt.*;
import java.applet.*;
import java.awt.Color;

public class HomeProject extends Applet {
    public void paint(Graphics g) {
        // Scenery
        g.setColor(Color.white);
        g.fillRect(0, 0, 900, 500);

        // Sky
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 900, 300);

        // Clouds
        g.setColor(Color.white);
        g.fillOval(100, 50, 100, 50); // first cloud
        g.fillOval(150, 40, 100, 50);
        g.fillOval(200, 50, 100, 50);
        g.fillOval(600, 80, 100, 50); // second cloud
        g.fillOval(650, 70, 100, 50);
        g.fillOval(700, 80, 100, 50);

        // Sun
        g.setColor(Color.yellow);
        g.fillOval(800, 20, 80, 80);

        // Tree
        g.setColor(new Color(128, 64, 0)); // brown
        g.fillRect(400, 150, 20, 150); // trunk
        g.setColor(Color.green);
        g.fillOval(370, 100, 80, 80); // leaves


        // Chimney
        g.setColor(Color.black);
        g.fillRect(34, 4, 50, 74);
        g.setColor(new Color(128, 64, 0));
        g.fillRect(41, 11, 38, 60);

        // Roof
        g.setColor(Color.black);
        int x[] = {0, 112, 225};
        int y[] = {112, 0, 112};
        g.fillPolygon(x, y, 3);

        // Walls
        g.setColor(Color.black);
        g.fillRect(18, 112, 183, 115);
        g.setColor(new Color(153, 0, 0));
        g.fillRect(25, 112, 169, 108);

        // Doors
        g.setColor(Color.black);
        g.fillRect(112, 123, 65, 97);
        g.setColor(Color.gray);
        g.fillRect(119, 131, 51, 88);

        // Window
        g.setColor(Color.black);
        g.fillRect(40, 135, 54, 54);
        g.setColor(Color.white);
        g.fillRect(48, 142, 17, 17);
        g.setColor(Color.white);
        g.fillRect(48, 164, 17, 17);
        g.setColor(Color.white);
        g.fillRect(71, 142, 17, 17);
        g.setColor(Color.white);
        g.fillRect(71, 164, 17, 17);

        // Road
        g.setColor(Color.darkGray);
        g.fillRect(0, 300, 900, 200); // road surface

        // Lane markings
        g.setColor(Color.white);
        for (int i = 0; i < 900; i += 60) { // dashed lines
            g.fillRect(i, 395, 30, 10);
        }
        g.fillRect(0, 350, 900, 10); // solid line
        g.fillRect(0, 440, 900, 10); // solid line

        // Grass
        g.setColor(Color.green);
        g.fillRect(0, 450, 900, 50); // grass area

        // Join road with house
        g.setColor(Color.darkGray);
        g.fillRect(18, 227, 183, 73); // driveway


        // Cover distance between road and house with grass
        g.setColor(Color.green);
        g.fillRect(0, 227, 18, 73); // left grass patch
        g.fillRect(201, 227, 699, 73); // right grass patch
    }
}
