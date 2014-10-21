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
		
		Verbraucher v1 = new Verbraucher(l,400);
		Verbraucher v2 = new Verbraucher(l,300);
		Verbraucher v3 = new Verbraucher(l,600);
		
		e1.start();
		e2.start();
		e3.start();
//		v1.run();
//		v2.run();
//		v3.run();
	}
}