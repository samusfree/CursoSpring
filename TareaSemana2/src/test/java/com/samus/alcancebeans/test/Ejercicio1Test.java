package com.samus.alcancebeans.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.samussoft.alcancebeans.MostrarFechayHoraServidor;
import com.samussoft.alcancebeans.MostrarHoraServidor;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:system-test-config.xml" })
public class Ejercicio1Test {

	@Autowired
	@Qualifier("mostrarFechaHora")
	private MostrarFechayHoraServidor mostrarFechaHora;

	@Autowired
	@Qualifier("mostrarFechaHoraPais")
	private MostrarFechayHoraServidor mostrarFechaHoraPais;

	@Autowired
	@Qualifier("mostrarFechaHoraPaisLenguaje")
	private MostrarFechayHoraServidor mostrarFechaHoraPaisLenguaje;

	@Test
	public void deberiaGenerarSingletonYPrototype() {
		MostrarHoraServidor mostrarFechaHoraMostrarHoraServidor = mostrarFechaHora
				.getMostrarHoraServidor();
		MostrarHoraServidor mostrarFechaHoraPaisMostrarHoraServidor = mostrarFechaHoraPais
				.getMostrarHoraServidor();
		MostrarHoraServidor mostrarFechaHoraPaisLenguajeMostrarHoraServidor = mostrarFechaHoraPaisLenguaje
				.getMostrarHoraServidor();

		assertNotNull(mostrarFechaHoraMostrarHoraServidor);
		assertNotNull(mostrarFechaHoraPaisMostrarHoraServidor);
		assertNotNull(mostrarFechaHoraPaisLenguajeMostrarHoraServidor);
		assertEquals(mostrarFechaHoraPaisMostrarHoraServidor.toString(),
				mostrarFechaHoraPaisLenguajeMostrarHoraServidor.toString());
		assertNotEquals(mostrarFechaHoraMostrarHoraServidor.toString(),
				mostrarFechaHoraPaisMostrarHoraServidor.toString());

	}

}
