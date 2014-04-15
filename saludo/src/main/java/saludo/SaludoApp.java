package saludo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaludoApp {

	public static void main(String[] args) {
		BeanFactory fabrica = new ClassPathXmlApplicationContext("saludo.xml");
		SaludoService saludoService = fabrica.getBean("saludoService",
				SaludoService.class);
		saludoService.saludar();
	}

}
