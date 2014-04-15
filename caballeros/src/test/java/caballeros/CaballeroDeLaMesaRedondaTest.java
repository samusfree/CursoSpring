package caballeros;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaballeroDeLaMesaRedondaTest {
	@Test
	public void testEmbarcarAventura() throws  AventuraFailedException {
		CaballeroDeLaMesaRedonda caballero = new CaballeroDeLaMesaRedonda("Sir Amadeo");
		
		SantoGrial santoGrial = (SantoGrial) caballero.embarcarEnAventura();
		
		assertNotNull(santoGrial);
		assertTrue(santoGrial.isSanto());
	}
}
