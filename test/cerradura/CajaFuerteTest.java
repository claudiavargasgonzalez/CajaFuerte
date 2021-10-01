package cerradura;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaFuerteTest {

	@Test
	public void alCrearUnaCajaFuerteDeberiaEstarAbiertatest() {
		CajaFuerte miCaja =new CajaFuerte();
		
		assertTrue(miCaja.estaAbierta());
	}
	
	@Test
	public void alCerrarDeberiaEstarCerradaTest() {
		CajaFuerte miCaja = new CajaFuerte();
		miCaja.cerrar();
		
		assertFalse(miCaja.estaAbierta());
		
				
	}

}
