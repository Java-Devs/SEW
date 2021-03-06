package goebel;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Zeichnet Labels und Buttons
 * @author Melanie Goebel
 * @version 2014-10-28
 */
public class View extends JPanel{
	private JButton deactivate;
	private JButton remove;
	private JButton exit;
	private JLabel status;
	private JLabel status1;
	private JLabel status2;
	private boolean removeEnabled = false;
	private boolean deactivateEnabled = true;
	
	/**
	 * Zeichnen der Elemente
	 * @param c das Control (Listener sind dort)
	 */
	public View(GUIStart c){
		deactivate = new JButton("Deactivate");
		remove = new JButton("Remove");
		remove.setEnabled(removeEnabled);
		exit = new JButton("Exit");
		status = new JLabel("Timerstatus:");
		status1 = new JLabel("waiting..");
		status2 = new JLabel("no alarm");
		deactivate.addActionListener(c);
		remove.addActionListener(c);
		exit.addActionListener(c);
		
		this.setLayout(new GridLayout(2,3));
		this.add(status);
		this.add(status1);
		this.add(status2);
		this.add(deactivate);
		this.add(remove);
		this.add(exit);
		
	}
	/**
	 * Setzt den Status des Weckers, ob er aktiviert oder deaktiviert ist
	 * @param den status als Text
	 */
	public void setStatus1(String status){
		status1.setText(status);
	}
	/**
	 * Setzt den Status des Weckers, ob der Alarm an ist.
	 * @param den status als Text
	 */
	public void setStatus2(String status){
		status2.setText(status);
	}
	/**
	 * Getter Methode fuer den Button namens deaktivieren
	 * @return den Button namens deaktivieren
	 */
	public JButton getDeaktivieren() {
		return deactivate;
	}

	/**
	 * Getter Methode fuer den Button namens remove
	 * @return den Button namens remove
	 */
	public JButton getRemove() {
		return remove;
	}

	/**
	 * Getter Methode fuer den Button namens exit
	 * @return den Button exit
	 */
	public JButton getExit() {
		return exit;
	}
	/**
	 * Setzt ob der Remove-Button dr�ckbar ist oder nicht
	 * @param den status als boolean
	 */
	public void setRemoveEnabled(boolean status){
		this.removeEnabled = status;
		remove.setEnabled(removeEnabled);
	}
	public void setDeactivateEnabled(boolean status){
		this.deactivateEnabled = status;
		deactivate.setEnabled(deactivateEnabled);
	}
}