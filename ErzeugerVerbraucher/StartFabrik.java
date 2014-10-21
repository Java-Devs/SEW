package goebel;

/**
 * Start-Klasse fuer die Fabrik
 * @author Bleedinghina
 *
 */
public class StartFabrik{
	public static void main (String[] args){
		Lager l = new Lager();
		Thread e1 = new Thread(new Erzeuger(l,100,new SensitiveTaschentuch()));
		Thread e2 = new Thread(new Erzeuger(l,20,new NormalTaschentuch()));
		Thread e3 = new Thread(new Erzeuger(l,80,new KompaktTaschentuch()));
		Thread e4 = new Thread(new Erzeuger(l,800,new KompaktTaschentuch()));
		Thread s1 = new Thread(new Status(l,10000));
		
		Thread v1 = new Thread(new Verbraucher(l,400));
		Thread v2 = new Thread(new Verbraucher(l,300));
		Thread v3 = new Thread(new Verbraucher(l,200));
		
		e1.start();
		e2.start();
		e3.start();
		v1.start();
		v2.start();
		v3.start();
		s1.start();
	}
}