import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GUI {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		for (int i = 0; i < 3; i++) {

			g.setColor(Color.BLUE);
			g.setFont(new Font("Cambria", Font.BOLD, 20));
			g.drawString("java", 10, 25);
			g.drawString("lang", 65, 50);
			g.drawString("awt", 245, 50);
			g.drawString("util", 425, 50);

			g.setColor(Color.BLACK);
			g.drawRect(5 + i, 5, 550, 300); 

			g.drawRect(60 + i, 30, 140, 260);
			g.drawRect(240 + i, 30, 140, 260); 
			g.drawRect(420 + i, 30, 90, 260);

			g.drawRect(90 + i, 65, 100, 105);
			g.drawRect(270 + i, 65, 100, 105); 

			g.drawRect(105 + i, 100, 80, 28);
			g.drawRect(105 + i, 135, 80, 28);
			g.drawRect(285 + i, 100, 80, 28); 
			g.drawRect(285 + i, 135, 80, 28);

			g.drawRect(90 + i, 190, 100, 35);
			g.drawRect(90 + i, 235, 100, 35); 
												
			g.drawRect(270 + i, 190, 100, 35);
			g.drawRect(270 + i, 235, 100, 35);

			g.setColor(Color.GREEN);
			g.setFont(new Font("Cambria", Font.BOLD, 15));
			g.drawString("Math", 95, 85);
			g.drawString("Graphics", 275, 85);

			g.drawString("String", 95, 212);
			g.drawString("Integer", 95, 257);
			g.drawString("Color", 275, 212);
			g.drawString("Font", 275, 257);

			g.setColor(Color.RED);
			g.setFont(new Font("Cambria", Font.BOLD, 15));
			g.drawString("sqrt()", 125, 120);
			g.drawString("random()", 113, 155);
			g.drawString("drawRect()", 287, 120);
			g.drawString("setColor()", 292, 155);

		}

		// *******************
		w.setImage(img);
	}

}