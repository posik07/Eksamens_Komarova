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
	        	
	        	// Metodes pārrakstišana override, maina vecāku klase uzvedību
	        	@Override
	        	public void paraditInfo() {
	        		System.out.println("Suns: " + getVards() +
	        				", Vecums: " + getVecums() +
	        				" gadi, Šķirne: " + skirne);
	        	}
	        }
	        
	        //vēl viena apakšklase Kakis
	        static class Kakis extends Dzivnieks {
	        	private boolean irMaja; 
	        	
	        	public Kakis(String vards, int vecums, boolean irMaja) {
	        		super(vards, vecums); // izsauc vecaku konstruktoru
	        		this.irMaja = irMaja;
	        	}
	        	
	        	//Specifiska metode kaķiem
	        	public void maukat() {
	        		System.out.println(getVards() + " maukā: Ņjau! Ņjau! <3");
	            }
	        	
	        	// Pārraksta vecāku metodi
	            @Override
	            public void paraditInfo() {
	                String tips = irMaja ? "mājkaķis" : "savvaļas kaķis";
	                
	                System.out.println("Kaķis: " + getVards() + 
	                		", Vecums: " + getVecums() + " gadi,"
	                				+ " Tips: " + tips);
	        }
	            
	         // Pārraksta ēšanas metodi
	            @Override
	            public void est() {
	                System.out.println(getVards() + " ēd zivi.");
	            }
	        }
	        
	        
	        public static void main(String[] args) {
	            // Izveidojam dažādus dzīvniekus
	            Dzivnieks dzīvnieks = new Dzivnieks("Nezināms dzīvnieks", 5);// bāzes klases objekts
	            Suns suns = new Suns("Reksis", 3, "Vācijas aitu suns");// apakšklases objekts
	            Kakis kaķis = new Kakis("Muris", 2, true); // vēl vienas apakšklases objekts

	            // Parādām informāciju par katru dzīvnieku
	            dzīvnieks.paraditInfo();// izsauc bāzes klases metodi
	            dzīvnieks.est(); // vispārīga ēšanas metode
	            dzīvnieks.gulet();// vispārīga gulēšanas metode

	            System.out.println(); // tukša rindiņa

	            suns.paraditInfo(); // izsauc pārrakstīto metodi
	            suns.est();// mantotā metode no bāzes klases
	            suns.riet();// specifiska suņa metode
	            suns.gulet();// mantotā metode

	            System.out.println(); 
	            kaķis.paraditInfo();// pārrakstītā metode
	            kaķis.est();// pārrakstītā ēšanas metode
	            kaķis.maukat();// specifiska kaķa metode
	            kaķis.gulet();// mantotā metode
	        }


}
}
