package Piemeri;
// Piemērs 1: Klases un objekti

public class Piemers1 {
	
	static class Automasina{ //Definējam klasi
		private String marka;  //Privāts mainīgais automašīnas marka
		private String modelis; //privāts mainīgais automašinas modelim
		private int gads;  //privāts mainīgais automašīnas gadam
		private double atrums; //privāts mainīgais automašīnas ātrumam
		
		//Konstruktors, veidojot jaunu objektu
		public Automasina(String marka, String modelis, int gads) {
			//this atsaucas un pašreizējo objektu
			// Piešķiram parametra vērtību objekta laukam un 
			// saglabājam ražošanas gads
			this.marka = marka;
			this.modelis = modelis; 
			this.gads = gads;
			this.atrums = 0.0; //sākumā automašīna nestāv
		}
		
		// Metode ātruma palielināšanai
		public void paatrinatAt(double paliel) {
			this.atrums = paliel; // palielinām pašreizējo ātrumu
			
		System.out.println("Automašīna paātrina. Ātrums "+this.atrums+
				" km/h");
		}
		
		// Metode bremzēšanai
		public void bremzet(double samaz) {
			// Samazinām ātrums. Pārbaudām, vai ātrums nav negatīvs
			// Ja ir, tad iestatam uz 0
			this.atrums -= samaz;
			if(this.atrums < 0) {
				this.atrums = 0;
			}
			
			System.out.println("Mašīna bremzē. Ātrums: "+this.atrums+
					" km/h");
		}
			// Metode iegušanai
			public String getMarka() {
			      return this.marka;  // Atgriežam privāto lauku vērtību
			    }

			    public String getModelis() {
			      return this.modelis;
			    }

			    public int getGads() {
			      return this.gads;
			    }

			    public double getAtrums() {
			      return this.atrums;
			    }
		
	}

}
