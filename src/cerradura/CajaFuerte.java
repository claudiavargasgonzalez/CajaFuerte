package cerradura;

public class CajaFuerte {
	private boolean abierto = true;

	public boolean estaAbierta() {
		return this.abierto;
	}

	public void cerrar() {
		this.abierto = false;
		
	}

}
