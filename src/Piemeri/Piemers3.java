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
        
        public double getGarums() {
        	return garums;
        }
        public double getPlatums() {
        	return platums;
        }
	}
	
	// Apakšklase Trīsstūris
    static class Trīsstūris extends Forma {
        private double mala1, mala2, mala3;// trīs malas
        
        // Konstruktors trīsstūrim
        public Trīsstūris(String krāsa, double mala1,
        		double mala2, double mala3) {
            super(krāsa); // vecāku konstruktors
            this.mala1 = mala1;     
            this.mala2 = mala2;
            this.mala3 = mala3;  
        }
        
        // Laukuma aprēķins izmantojot Herona formulu
        @Override
        public double aprekinatLauk() {
            double s = (mala1 + mala2 + mala3) / 2;  // pus-perimetrs
            return Math.sqrt(s * (s - mala1) * (s - mala2) * (s - mala3));  // Herona formula
        }
        
        // Perimetra aprēķins
        @Override
        public double aprekinatP() {
            return mala1 + mala2 + mala3;  // visu malu summa
        }
       
        public double getMala1() { 
        	return mala1; 
        }
        public double getMala2() {
        	return mala2; 
        }
        public double getMala3() {
        	return mala3;
        }
    }

    public static void main(String[] args) {
        // Izveidojam dažādas formas polimorfisms darbībā
        Forma[] formas = {
            new Aplis("Sarkans", 5.0),
            new Taisnsturis("Zils", 4.0, 6.0),
            new Trīsstūris("Zaļš", 3.0, 4.0, 5.0)
        };

        // Polimorfisms viena un tā pati metode darbojas dažādi
        for (int i = 0; i < formas.length; i++) {
            System.out.println("=== Forma " + (i + 1) + " ===");
            formas[i].paraditInfo();
            System.out.println();
        }

        // Demonstrējam polimorfismu ar metožu izsaukšanu
        System.out.println("=== Polimorfisma demonstrācija ===");
        for (Forma forma : formas) {
            System.out.println(forma.getClass().getSimpleName() +
                             " laukums: " + String.format("%.2f", forma.aprekinatLauk()));
        }

        // Demonstrējam
        System.out.println("\n=== Piemērs ===");
        for (Forma forma : formas) {
            if (forma instanceof Aplis) {
                Aplis aplis = (Aplis) forma;
                System.out.println("Apļa rādiuss: " + aplis.getRaduiss());
            } else if (forma instanceof Taisnsturis) {
                Taisnsturis taisnstūris = (Taisnsturis) forma;
                System.out.println("Taisnstūra izmēri: " + taisnstūris.getGarums() + " × " + taisnstūris.getPlatums());
            } else if (forma instanceof Trīsstūris) {
                Trīsstūris trīsstūris = (Trīsstūris) forma;
                System.out.println("Trīsstūra malas: " + trīsstūris.getMala1() + ", " +
                                 trīsstūris.getMala2() + ", " + trīsstūris.getMala3());
            }
        }
    }


}
