public class Main {

	public static void main(String[] args) {
	     Veicolo v1 = new Veicolo("FIAT 500X","FIAT", 2015,"EY123TR", 1000 , (float) 1.60, 2, 'A');
	     Veicolo v2 = new Veicolo("FORD FIESTA","FORD", 2013,"DZ456LD", 930 , (float) 1.45, 2, '3');
	     Veicolo v3 = new Veicolo("MERCEDES GLC","MERCEDES", 2019,"FZ967ML", 110 , (float) 1.65, 2, 'A');
	     
	     
	     
	     Autostrada a1 = new Autostrada((float) 800, 0.15,"A14","Bologna","Taranto", null);
	     Autostrada a2 = new Autostrada((float) 200,(float)0.20,"A24","Roma","Teramo", null);
	     Autostrada a3= new Autostrada((float) 150,0.25 ,"A13","Bologna","Padova",null );
	    
	     a1.addCasello(a1, "Cesena",(float)99.7); 
	     a1.addCasello(a1, "Bari-nord", (float)672.2);
	     
	     
	     Casello c4 = new Casello(a3,"Occhiobello",(float)49.1);
	     a2.addCasello(c4);
	     Casello c3 = new Casello(a3,"Monselice	",(float)88.6);
	     a2.addCasello(c3);
	     Casello c5 = new Casello(a2,"Assergi",(float)116.8);
	     a1.addCasello(c5);
	     Casello c6 = new Casello(a2,"Carsoli Oricola",(float)50.5);
	     a1.addCasello(c6); 
	     Casello c7 = new Casello(a1,"Grottammare",(float)301.8);
	     a1.addCasello(c7);
	     Casello c8 = new Casello(a1,"Bologna San Lazzaro",(float)22.2);
	     a1.addCasello(c8);
	     
	     
		 Pedaggio p1 = new ImplementazionePedaggio(c4,c3,v3);
	     Pedaggio p2 = new ImplementazionePedaggio(c6,c5,v1);
	     Pedaggio p3 = new ImplementazionePedaggio(c7,c8,v2);
	     
	     
	     System.out.println(p1.calcolaPedaggio() + " € calcolo primo pedaggio");
	     System.out.println(p2.calcolaPedaggio() + " € calcolo secondo pedaggio");
	     System.out.println(p3.calcolaPedaggio() + " € calcolo terzo pedaggio");
	}

}