package Piemeri;

import java.util.Scanner;

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
			// Metode ieg
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
		
		public void izvaditInfo() {
			System.out.println("Mašīna: "+this.marka+" "+ this.modelis + 
                    " (" + this.gads + ".gads), ātrums: " 
					+ this.atrums + " km/h");
 

		}
		// Galvenā metode programmas palaišanai 
		public static void main(String[] args) {
			// Veidojam divas mašīnas objektus, izmantojot konstruktoru
			Automasina auto1 = new Automasina("BMW", "X5", 2020);
			Automasina auto2 = new Automasina("Audi", "A4", 2019);
			
			// Izveidojam Scanner objektu, lai varētu nolasīt lietotāja ievadi no tastatūras
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("\nSākotnējā informācija:");
		    auto1.izvaditInfo();
		    auto2.izvaditInfo();
			
		 // Lūdzam lietotājam ievadīt, par cik km/h paātrināt automašīnu
			System.out.print("\nIevadiet, par cik km/h paātrināt BMW: ");
		    double paatrinajums1 = scanner.nextDouble(); // Nolasām paātrinājuma vērtību
		    auto1.paatrinatAt(paatrinajums1);// Izsaucam paātrināšanas metodi ar ievadīto vērtību

		    System.out.print("Ievadiet, par cik km/h paātrināt Audi: ");
		    double paatrinajums2 = scanner.nextDouble();
		    auto2.paatrinatAt(paatrinajums2);

		    // Lietotāja ievade bremzēšanai
		    System.out.print("\nIevadiet, par cik km/h bremzēt BMW: ");
		    double bremzesana1 = scanner.nextDouble();
		    auto1.bremzet(bremzesana1); // Bremzējam ar lietotāja ievadīto vērtību

		    System.out.print("Ievadiet, par cik km/h bremzēt Audi: ");
		    double bremzesana2 = scanner.nextDouble();
		    auto2.bremzet(bremzesana2);

		    // Gala rezultāti
		    System.out.println("\nGala informācija:");
		    auto1.izvaditInfo();
		    auto2.izvaditInfo();

		    scanner.close();
		}
	}

}
