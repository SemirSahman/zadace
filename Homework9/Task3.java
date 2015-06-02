import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task3 {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		g.setColor(Color.BLACK);
		g.setFont(new Font("Cambria", Font.BOLD, 17));

		g.drawString("An array of numbers", 200, 30);
		g.drawString("Type: int", 230, 130);

		g.drawLine(50, 50, 550, 50);
		g.drawLine(50, 100, 550, 100);

		int x = 50;
		int y1 = 50;
		int y2 = 100;
		g.drawLine(x, y1, x, y2);
		Integer num = 0;

		for (int i = 0; i < 10; i++) {
			x += 50;
			g.drawLine(x, y1, x, y2);
			num = (int) (Math.random() * 10);
			g.drawString(num.toString(), x - 28, 80);
		}

		// *******************
		w.setImage(img);
	}
}