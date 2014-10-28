package goebel;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JPanel{
	private JButton deaktivieren;
	private JButton remove;
	private JButton exit;
	private JLabel status;
	private JLabel status1;
	private JLabel status2;
	
	public View(Control c){
		deaktivieren = new JButton("Deactivate");
		remove = new JButton("Remove");
		exit = new JButton("Exit");
		status = new JLabel("Timerstatus:");
		status1 = new JLabel("Activate");
		status2 = new JLabel("alarmend!");
		deaktivieren.addActionListener(c);
		remove.addActionListener(c);
		exit.addActionListener(c);
		
		this.setLayout(new GridLayout(2,3));
		this.add(status);
		this.add(status1);
		this.add(status2);
		this.add(deaktivieren);
		this.add(remove);
		this.add(exit);
		
	}
}