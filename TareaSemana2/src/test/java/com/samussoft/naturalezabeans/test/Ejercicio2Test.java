package com.samussoft.naturalezabeans.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.samussoft.naturalezabeans.Ejercicio1;
import com.samussoft.naturalezabeans.Ejercicio2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:system-test-config.xml" })
public class Ejercicio2Test {

	@Autowired
	@Qualifier("naturalezaBeansEjercicio2")
	private Ejercicio2 ejercicio2;

	@Autowired
	@Qualifier("naturalezaBeansEjercicio1")
	private Ejercicio1 ejercicio1;

	@Test
	public void comprobarSuma() {

		assertNotNull(ejercicio2.getSuma());

		assertEquals(ejercicio2.getSuma().intValue(), 24);

		assertNotNull(ejercicio1.getSuma());

		assertEquals(ejercicio1.getSuma().intValue(), 40);
	}

}
