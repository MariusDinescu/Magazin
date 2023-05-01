/* Incaltaminte clasa:
ID:String
Tip:String
Marime:double
Numarul de bucati: int
model: String 

*/


public class Incaltaminte {


	private String ID;
	private String tip;
	private double marime;
	private int nrBucati;
	private String model;
	
	
	public int getNrBucati() {
		return nrBucati;
	}




	public void setNrBucati(int nrBucati) {
		this.nrBucati = nrBucati;
	}




	
	
	
	

	public Incaltaminte(String iD, String tip, double marime, int nrBucati, String model) {
		
		
		ID = iD;
		this.tip = tip;
		this.marime = marime;
		this.nrBucati = nrBucati;
		this.model = model;
		
	}




	@Override
	public String toString() {
		return "Incaltaminte [ID=" + ID + ", tip=" + tip + ", marime=" + marime + ", nrBucati=" + nrBucati + ", model="
				+ model + "]";
	}
	
	public int convertIDtoInt()
	{
		return Integer.parseInt(this.ID);
	}




	public double getMarime() {
		return marime;
	}




	public void setMarime(double marime) {
		this.marime = marime;
	}



}
