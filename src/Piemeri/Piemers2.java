package Piemeri;
// Piemērs 2: Mantošana

public class Piemers2 {
	//Bāzes klase(vecāku klase)
	static class Dzivnieks {
		private String vards;
		private int vecums;
		
		// Konstruktors bāzes klasei
		public Dzivnieks(String vards, int vecums) {
			this.vards = vards;
			this.vecums = vecums;
		}
		
		// Publiska metode info parādīšanai
		public void paraditInfo() {
			System.out.println("Dzīvnieks: "+vards+
					", Vecums: "+vecums+" gadi");
		}
		
		// Publiska metodes, lai apakšklases varētu piekļūt
		 public String getVards() {
			 return vards;
		 }
		 public int getVecums() {
			 return vecums;
		 }
		 
		 // Publiska metode ēšanai un gulēšanai
		 public void est() {
	            System.out.println(vards + " ēd.");
	        }
	        
	        
	        public void gulet() {
	            System.out.println(vards + " guļ.");
	        }
	        
	        //Apakšklase(bērnu klase)
	        // Suns manto no Dzivnieks
	        static class Suns extends Dzivnieks{
	        	private String skirne; //papildu īpašība, kas ir tikai suņiem
	        	
	        	//Konstruktors apakšklase
	        	public Suns(String vards, int vecums, String skirne) {
	        		super(vards, vecums); // super izsauc vecaku klases konstruktors
	        		this.skirne = skirne;
	        	}
	        	
	        	//specifiska metode tikai suņiem
	        	public void riet() {
	        		System.out.println(getVards() + " rej: Gaf-gaf!! >:O");
	        	}
	        }
	}

}
