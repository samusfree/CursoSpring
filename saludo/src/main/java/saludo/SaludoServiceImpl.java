package saludo;

public class SaludoServiceImpl implements SaludoService {
	private String saludo;
	
	public void saludar() {
		System.out.println(saludo);

	}

	public SaludoServiceImpl(String saludo) {
		super();
		this.saludo = saludo;
	}

	public SaludoServiceImpl() {

	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
