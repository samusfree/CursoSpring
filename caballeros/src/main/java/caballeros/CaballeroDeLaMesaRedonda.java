package caballeros;

public class CaballeroDeLaMesaRedonda implements Caballero{
	private String nombre;
	private Aventura aventura;

	public CaballeroDeLaMesaRedonda() {

	}

	public CaballeroDeLaMesaRedonda(String nombre) {
		this.nombre = nombre;
	}

	public Object embarcarEnAventura() throws AventuraFailedException {
		return aventura.embarcar();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Aventura getAventura() {
		return aventura;
	}

	public void setAventura(Aventura aventura) {
		this.aventura = aventura;
	}

}
