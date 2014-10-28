package goebel;

import javax.swing.JFrame;

public class Model extends JFrame{
	public Model(View layoutPanel, String titel){
		super(titel);
		this.add(layoutPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(0, 0, 600, 600);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}