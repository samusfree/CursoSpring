package caballeros;

public class SantoGrialAventura implements Aventura {

	public Object embarcar() throws AventuraFailedException {
		return new SantoGrial();
	}

}
