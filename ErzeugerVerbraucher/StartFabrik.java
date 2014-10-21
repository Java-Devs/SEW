package goebel;

/**
 * Start-Klasse fuer die Fabrik
 * @author Bleedinghina
 *
 */
public class StartFabrik{
	public static void main (String[] args){
		Lager l = new Lager();
		Thread e1 = new Thread(new Erzeuger(l,1000,new SensitiveTaschentuch()));
		Thread e2 = new Thread(new Erzeuger(l,2000,new NormalTaschentuch()));
		Thread e3 = new Thread(new Erzeuger(l,800,new KompaktTaschentuch()));
		Thread e4 = new Thread(new Erzeuger(l,800,new KompaktTaschentuch()));
		
		Thread v1 = new Thread(new Verbraucher(l,400));
		Thread v2 = new Thread(new Verbraucher(l,300));
		Thread v3 = new Thread(new Verbraucher(l,600));
		
		e1.start();
		e2.start();
		e3.start();
		v1.start();
		v2.start();
		v3.start();
	}
}