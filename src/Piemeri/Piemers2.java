package Piemeri;
// Piemērs 2: Mantošana

public class Piemers2 {
	
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
	}

}
