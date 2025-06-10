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
		
		// Realizē abstrakto metodi laukuma aprēķinam
        @Override
        public double aprekinatLauk() {
            return Math.PI * r * r;
	}
     // Realizē abstrakto metodi perimetra aprēķinam
        @Override
        public double aprekinatP() {
            return 2 * Math.PI * r; 
	}
        public double getRaduiss() {
        	return r;
        }
	}
	
	//Aapkšklase taisnstūris
	static class Taisnsturis extends Forma {
		private double garums;
		private double platums;
		
		//Komstruktors taisnsturim
		public Taisnsturis(String krasa, double garums, double platums) {
			super(krasa);//izsauc vecāku konstruktoru
			this.garums  = garums;
			this.platums = platums;
		}
		
		// Realizē laukuma aprēķinu
        @Override
        public double aprekinatLauk() {
            return garums * platums;  // garums × platums
        }
        
        // Realizē perimetra aprēķinu
        @Override
        public double aprekinatP() {
            return 2 * (garums + platums);  // 2 × (garums + platums)
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
