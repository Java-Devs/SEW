package goebel;

/**
 * Start-Klasse fuer die Fabrik
 * @author Bleedinghina
 *
 */
public class StartFabrik{
	public static void main (String[] args){
		Lager l = new Lager();
		Erzeuger e1 = new Erzeuger(l,400,new SensitiveTaschentuch());
		Erzeuger e2 = new Erzeuger(l,300,new NormalTaschentuch());
		Erzeuger e3 = new Erzeuger(l,500,new KompaktTaschentuch());
		Erzeuger e4 = new Erzeuger(l,500,new KompaktTaschentuch());
		
		Verbraucher v1 = new Verbraucher();
		Verbraucher v2 = new Verbraucher();
		Verbraucher v3 = new Verbraucher();
		
		e1.run();
		e2.run();
		e3.run();
		v1.run();
		v2.run();
		v3.run();
	}
}