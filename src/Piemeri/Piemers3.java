package Piemeri;
// Piemērs 3: Polimorfisms un abstrakcija

public class Piemers3 {
	
	//Abstrakta bāzes klase nevar izveidot tās objektus tieši
	static abstract class Forma{
		private String krasa;
		
		// Konstruktors abstraktai klasei
		public Forma(String krasa) {
			this.krasa = krasa;
		}
		
		//Abstrakta metode. Jārealize visām apakšklasēm
		public abstract double aprekinatLauk();
		// Abstrakta metode perimetra aprēķinam
        public abstract double aprekinatP();
        
        // Konkrēta metode - var izmantot visas apakšklases
        public void paraditInfo() {
        	System.out.println("Forma: " + this.getClass().getSimpleName() + ", Krāsa: " + krasa);
            System.out.println("Laukums: " + String.format("%.2f", aprekinatLauk()));
            System.out.println("Perimetrs: " + String.format("%.2f", aprekinatP()));
        }
        
        public String getKrasa() {
        	return krasa;
        }
	}
	
	//Apakšklase Aplis
	static class Aplis extends Forma {
		private double r; //radiuss
		
		//Konstruktors aplim
		public Aplis(String krasa, double r) {
			super(krasa);//izsauc vecāku konstruktors
			this.r = r;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
