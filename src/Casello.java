public class Casello implements Comparable{

	public Autostrada ID_Autostrada;
	public String nome;
	public double altezza;
	
	
	
	public Autostrada getCodiceAutostrada() {return ID_Autostrada;}
	public void setCodiceAutostrada(Autostrada idAutostrada) {this.ID_Autostrada = idAutostrada;}
	
	public String getNomeCasello() {return nome;}
	public void setNomeCasello(String nome) {this.nome = nome;}
	
	public double getAltezzaKm() {return altezza;}
	public void setAltezzaKm(float km) {this.altezza = km;}
	
	
	
	public Casello(Autostrada idAutostrada, String nome, float km) {
		
		this.ID_Autostrada = idAutostrada;
		this.nome = nome;
		this.altezza = km;
	}
	
	
    
    @Override
	public String toString() {
		return "Casello [codiceAutostrada=" + ID_Autostrada + ",  nome=" + nome + ", km="
				+ altezza + "]";
	}
    
    
    
	public boolean equals(Object o){
        if (o instanceof Casello){
            return (((Casello)o).ID_Autostrada == ID_Autostrada);
        }
        else {
             return false;
             }
        
    }
	
	
	
	@Override
	public int compareTo(Object o) {
		
		if (this.altezza<(((Casello) o).getAltezzaKm())) return 1;
			
		return 0;

	}



	
	
}