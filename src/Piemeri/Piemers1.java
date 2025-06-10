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
	}

}
