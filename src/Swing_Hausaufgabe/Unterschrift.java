package Swing_Hausaufgabe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Unterschrift {
	public static void main(String[] args) {
		new Unterschrift().initialize();

	}
	
	public void initialize() {
		JFrame frame = new JFrame("Swing Paint");
		frame.setTitle("Unterschrift");
		Container content = frame.getContentPane();
		content.setLayout(new BorderLayout());
		final DrawArea area = new DrawArea();
		content.add(area, BorderLayout.CENTER);
		frame.setBounds(460, 250, 370, 220);
		ImageIcon image = new ImageIcon("Apfel.jpg");
		frame.setIconImage(image.getImage());
		frame.setResizable(false);
		
		JPanel control = new JPanel();
		
		JButton clear = new JButton("Löschen");
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				area.clear();
			}
			
		});
		
		
		JButton weiter = new JButton("Weiter");
		weiter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new AbschlussFenster();
			}
			
		});
		
		JButton abbrechen = new JButton("Bestellung verwerfen und beeenden");
		abbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		control.add(abbrechen);
		control.add(clear);
		control.add(weiter);
		
		content.add(control, BorderLayout.SOUTH );
		
		frame.setSize(600, 400);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
	}
}
