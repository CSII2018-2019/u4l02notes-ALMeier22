import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class U4L02Notes extends JFrame {
	
	public static final String FILE_NAME = "/rain2.jpg";
	
	public U4L02Notes(){
		initGUI();
		setTitle("Examples");
		setResizable(true);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void initGUI(){
		//title Panel
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(Color.BLACK);
		JLabel titleLabel = new JLabel("Examples");
		titleLabel.setForeground(Color.WHITE);
		titlePanel.add(titleLabel);
		add(titlePanel, BorderLayout.PAGE_START);
		
		//button Panel
		JPanel buttonPanel = new JPanel ();
		buttonPanel.setBackground(Color.BLACK);
		add(buttonPanel,BorderLayout.PAGE_END);
		
		//Image panel
		
		ImagePanel imgPanel = new ImagePanel(FILE_NAME);
		add(imgPanel, BorderLayout.LINE_START);

		JButton originalButton = new JButton("og"); 
		buttonPanel.add(originalButton);
		originalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImagePanel imgPanel = new ImagePanel(FILE_NAME);
				add(imgPanel, BorderLayout.LINE_START);
				validate();
			}
		});


		JButton grayButton = new JButton("gray"); 
		buttonPanel.add(grayButton);
		grayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImagePanel grayImgPanel = new ImagePanel(FILE_NAME);
				grayImgPanel.convertToGrayScale();
				add(grayImgPanel, BorderLayout.LINE_END);
				validate();

			}
		});

		JButton redButton = new JButton("red"); 
		buttonPanel.add(redButton);
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImagePanel rGBImgPanel = new ImagePanel(FILE_NAME);
				rGBImgPanel.convertToRedEffect();
				add(rGBImgPanel, BorderLayout.LINE_END);
				validate();

			}
		});

		JButton greenButton = new JButton("green"); 
		buttonPanel.add(greenButton);
		greenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImagePanel rGBImgPanel = new ImagePanel(FILE_NAME);
				rGBImgPanel.convertToGreenEffect();
				add(rGBImgPanel, BorderLayout.LINE_END);
				validate();

			}
		});

		JButton blueButton = new JButton("blue"); 
		buttonPanel.add(blueButton);
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImagePanel rGBImgPanel = new ImagePanel(FILE_NAME);
				rGBImgPanel.convertToBlueEffect();
				add(rGBImgPanel, BorderLayout.LINE_END);
				validate();

			}
		});
		
		JButton sepiaButton = new JButton("sepia"); 
		buttonPanel.add(sepiaButton);
		sepiaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImagePanel rGBImgPanel = new ImagePanel(FILE_NAME);
				rGBImgPanel.convertToSepia();
				add(rGBImgPanel, BorderLayout.LINE_END);
				validate();

			}
		});
		
		JButton creativeButton = new JButton("creative"); 
		buttonPanel.add(creativeButton);
		creativeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImagePanel rGBImgPanel = new ImagePanel(FILE_NAME);
				rGBImgPanel.convertToNewEffect();
				add(rGBImgPanel, BorderLayout.LINE_END);
				validate();
			}
		});

	}
	
	
	public static void main(String[] args) {
		try {
			String className = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(className);
		} catch (Exception e){}
		
		SwingUtilities.invokeLater(new Runnable (){
            @Override
            public void run() {
                new U4L02Notes();
            }   
        });

	}

}
