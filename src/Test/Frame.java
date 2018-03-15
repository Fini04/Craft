package Test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;
import java.util.Random;

import javax.accessibility.AccessibleKeyBinding;
import javax.swing.*;

public class Frame {
	
	JFrame f = new JFrame("");
	Random random = new Random();
	JButton close;
	JButton reale;
	
	public Frame() {
		
			

		int fb = 800;
		int fh = 800;
		f.setSize(fh, fb);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setUndecorated(false);
		f.getContentPane().setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
		f.setVisible(true);
		
		JButton colclose = new JButton("Close");

/////////////Designes////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton blue= new JButton("Blue");
		f.add(blue);
		blue.setBounds(170, 220, 100, 100);
		blue.setVisible(false);
		
		JButton green= new JButton("Green");
		f.add(green);
		green.setBounds(270, 220, 100, 100);
		green.setVisible(false);

		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel opt = new JLabel("");
		opt.setOpaque(true);
		opt.setBounds(150, 150, 500, 500);
		opt.setBackground(Color.LIGHT_GRAY );
		opt.setVisible(false);
		
		JButton colstop = new JButton("Stop Colours");
		f.add(colstop);
		colstop.setBounds(170, 170, 200, 40);
		colstop.setVisible(false);
		
		JButton colstart = new JButton("start Colours");
		f.add(colstart);
		colstart.setBounds(170, 170, 200, 40);
		colstart.setVisible(false);
		
		JButton noe = new JButton("NO");
		f.add(noe);
		noe.setBounds(170, 590, 70, 40);
		noe.setVisible(false);
		noe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				noe.setVisible(false);
				reale.setVisible(false);
				close.setVisible(true);
			}
		});
		
		reale = new JButton("really Exit ?");
		f.add(reale);
		reale.setBounds(240, 590, 390, 40);
		reale.setVisible(false);
		reale.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			f.setVisible(false);	
			
			}
		});
		
		
		
			close = new JButton("Exit");
			f.add(close);
			close.setBounds(170,590, 460, 40);
			close.setVisible(false);
			close.addActionListener(new ActionListener() {

				
				@Override
				public void actionPerformed(ActionEvent e) {
				noe.setVisible(true);	
				reale.setVisible(true);
				close.setVisible(false);
					
				}
				
			});
		
		JButton col = new JButton("Optionen");
		f.add(col);
		col.setBounds(690, 720, 100, 40);
		col.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
		
				opt.setVisible(true);
				colclose.setVisible(true);
				close.setVisible(true);
				colstop.setVisible(true);
				colstart.setVisible(true);
				col.setVisible(false);
				

				
				
			}
			
		});
		

		
		f.add(colclose);
		colclose.setBounds(690, 720, 100, 40);
		colclose.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
		
				colclose.setVisible(false);
				opt.setVisible(false);
				close.setVisible(false);
				colstop.setVisible(false);
				colstart.setVisible(false);
				blue.setVisible(false);
				green.setVisible(false);
				noe.setVisible(false);
				reale.setVisible(false);
				col.setVisible(true);
				
			}
		});
		
		f.add(opt);
		
		JLabel Col = new JLabel("Colour");
		f.add(Col);
		int Colx = 175;
		int Coly = 0;
		int Colb = 500;
		int Colh = 300;
		Col.setBounds(Colx, Coly, Colb, Colh);
		Font font = Col.getFont();
		Col.setFont(new Font(font.getName(), Font.PLAIN, 150));
		//Col.setForeground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));

		
		Col.setVisible(true);
		
		final Timer timer = new Timer(1500, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent colswitsch) {
				f.getContentPane().setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
				
				Col.setForeground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));

			}
			
		});
		
		colstop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				timer.stop();
				colstop.setVisible(false);
				blue.setVisible(true);
				green.setVisible(true);
				
				f.getContentPane().setBackground(Color.WHITE);
				Col.setForeground(Color.BLACK);

				
			}
		});
		
		colstart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				blue.setVisible(false);
				green.setVisible(false);
				timer.start();
				colstop.setVisible(true);
				
			}
		});
		
		blue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.getContentPane().setBackground(Color.BLUE);
				Col.setForeground(Color.BLACK);
			}
		});
		
		green.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.getContentPane().setBackground(Color.GREEN);
				Col.setForeground(Color.BLACK);
			}
		});

		
		timer.start();
		
		colclose.setVisible(false);



	}

}

//f.getContentPane().setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));

