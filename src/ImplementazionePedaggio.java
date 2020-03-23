public class ImplementazionePedaggio implements Pedaggio {
	
	public Casello caselloEntrata;
	public Casello caselloUscita;
	public Veicolo veicolo;
	public double IVA=0.22;


	public ImplementazionePedaggio(Casello caselloEntrata, Casello caselloUscita, Veicolo veicolo) {
		this.caselloEntrata = caselloEntrata;
		this.caselloUscita = caselloUscita;
		this.veicolo = veicolo;
	}

	
		@Override
		public double calcolaPedaggio() {
		
		Autostrada a=caselloEntrata.ID_Autostrada;
		Autostrada b=caselloUscita.ID_Autostrada;
		double y=a.getTariffaKm();
		double aggiunta=0;
		
		char x=veicolo.getClasseveicolo();
		
		switch(x) {
		case 'B':
			aggiunta=0.10;
			break;
		case '3':
			aggiunta=0.30;
			break;
		case '4':
			aggiunta = 0.50;
			break;
		case '5':
			aggiunta=0.70;
			break;
		default :
			aggiunta=0.05;
		}
		
		
		if(a.equals(b)){
				double e=Math.abs(caselloEntrata.getAltezzaKm()-caselloUscita.getAltezzaKm());
				double tot = e*y;
				float aggIVA= (float) (tot*(IVA)) ;
				double arr=(Math.round((tot + aggIVA)*10)/10)+aggiunta;
				return arr;		
				}
		
		return 0;
		
	}
	
	

}
