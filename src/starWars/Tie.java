package starWars;

public class Tie implements Vaisseau {
	String _model;
	Canon _canon;

	public Tie() {
		this._model = "Tie";
		this._canon = new Canon(3);
	}
	@Override
	public void tirer() {
		this._canon.tirer();
		
	}
	@Override
	public String toString() {
		return "Tie [_model=" + _model + ", _canon=" + _canon + "]";
	}
	

}
