package goebel;

/**
 * Start-Klasse fuer die Fabrik und benoetigt dazu Parameter.
 * -v sowie -e sind benoetigt mit den Werten: -v <Ganze Zahl> -e <Ganze Zahl, Ganze Zahl, ...>
 * @author Melanie Goebel
 * @version 2014-10-23
 */
public class StartFabrik{
	public static void main (String[] args){
		int vanzahl = 0; // Anzahl der Verbraucher
		int[] etaktzeit = new int[0]; // Taktzeiten der Erzeuger
		try{
			for(int i =0; i < args.length; i++){ // Parameterliste durchgehen
				if(args[i].equals("-v")){// -v fuer Verbaucher
					i++;
					vanzahl= Integer.parseInt(args[i]);

				}else{
					if(args[i].equals("-e")){// -e fuer Erzeuger
						i++;
						String[] temp = (args[i].split(","));//Teilt die Taktzeiten mit Beistrichen
						etaktzeit = new int[temp.length];// Temporaeres Array
						for(int j = 0; j < temp.length; j++){
							etaktzeit[j] = Integer.parseInt(temp[j]);
						}
					}else{
						System.err.println("Fehler bei der Parameterliste");
						System.exit(1);
					}
				}
			}
		}catch(NumberFormatException nfe){
			//Falls keine Zahl eingegeben wurde
			System.err.print("Bitte fuegen Sie nur Zahlen ein bei -v und -e");
		}
		if(vanzahl <= 0 || etaktzeit == null || etaktzeit.length == 0){//Ueberpruefen ob fortgefahren werden darf
			System.err.println("Fehlen von Paramtern");
			System.exit(1);

		}else{
			ErstesLager l = new ErstesLager();
			Thread[] verbr = new Thread[vanzahl];
			for(int i = 0; i < vanzahl; i++){//Erstellen und Starten der Verbraucher
				verbr[i] = new Thread(new Verbraucher(l,(int)(Math.random()*(800-100))+100));
				verbr[i].start();
			}
			Thread[] erz = new Thread[etaktzeit.length];
			Produkt[] prod = new Produkt[]{new NormalTaschentuch(),new SensitiveTaschentuch(),new KompaktTaschentuch()};
			for(int i = 0; i < etaktzeit.length; i++){//Erstellen und Starten der Erzeuger
				erz[i] = new Thread(new Erzeuger(l,etaktzeit[i],prod[(int)(Math.random()*(prod.length))]));
				erz[i].start();
			}
			Thread s1 = new Thread(new Status(l,10000));//10 Sekunden
			s1.start();
		}
	}
}