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
	
	@Test
	public void alIngresarUnCodigoNuevoLaCajaLoGuarda() {
		CajaFuerte miCaja = new CajaFuerte();
		
		miCaja.ingresarCodigo(1234);
	
		assertEquals(1234,miCaja.getCodigo());
		System.out.println(miCaja.getCodigo());
		
	}
	
	@Test
	public void alIngresarElCodigoCorrectoSeAbraLaCaja() {
		CajaFuerte miCaja = new CajaFuerte();
		
		miCaja.ingresarCodigo(1234);
		miCaja.abrirLaCaja(1234);
		
		assertTrue(miCaja.estaAbierta());
		
	}
	
	@Test
	public void alIngresarElCodigoIncorrectoNoSeAbraLaCaja() {
		CajaFuerte miCaja = new CajaFuerte();
		
		miCaja.ingresarCodigo(1234);
		miCaja.abrirLaCaja(2546);
		
		assertFalse(miCaja.estaAbierta());
		System.out.println(miCaja.getCodigo());
		
	}

}
