import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	
	private int width;
	private int height;
	
	BufferedImage image = null;
	
	public ImagePanel(String fn){
		image = readImageFile(this, fn);
		width = image.getWidth ();
		height = image.getHeight ();
		
		 
	}
	
	public static BufferedImage readImageFile(Object requestor, String fileName){
		BufferedImage image = null;
		try {
			InputStream input = requestor.getClass().getResourceAsStream(fileName);
			image = ImageIO.read(input);
		} catch (IOException e){
			String message = "The image file " + fileName + " could not be opened.";
			JOptionPane.showMessageDialog(null, message);
		}
		return image;
			
	}
	 public void paintComponent(Graphics g) {
		 g.drawImage(image, 0, 0,null);
		 g.setColor(Color.WHITE);
		 g.setFont(new Font("Courier", Font.PLAIN, 36)); 
		 g.drawString("When wake up at 6:30", 100, 50);
		 g.drawString("on Spring Break", 155, 320 );
	}
	public Dimension getPreferredSize() {
		Dimension size = new Dimension(width,height);
		return size;
	}
}
