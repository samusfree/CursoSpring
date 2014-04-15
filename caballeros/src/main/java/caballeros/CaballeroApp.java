package caballeros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CaballeroApp {

	public static void main(String[] args) throws AventuraFailedException {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"caballero.xml");

		Caballero caballero = context.getBean("caballero", Caballero.class);
		caballero.embarcarEnAventura();
	}

}
