package starWars;

public class Millenium implements Vaisseau {
	private String _model;
	private Canon _canon;
	
	public Millenium() {
		this._canon = new Canon(5);
	}

	@Override
	public void tirer() {
	this._canon.tirer();		
	}

	@Override
	public String toString() {
		return "Millenium [_model=" + _model + ", _canon=" + _canon + "]";
	}
	

}
