package starWars;

public class Canon {
	private int nbMissile;
	
	public Canon( int nb) {
		nbMissile = nb;
	}
	public void tirer() {
		this.nbMissile --;
		if(nbMissile>0) System.out.println("PAN");
		else {
				System.out.println("POUF");
		}
	}
}
