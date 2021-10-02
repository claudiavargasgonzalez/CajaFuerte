package cerradura;

public class CajaFuerte {
	private boolean abierto = true;
	private int codigo = 0;

	public boolean estaAbierta() {
		return this.abierto;
	}

	public void cerrar() {
		this.abierto = false;

	}

	public void ingresarCodigo(int i) {
		this.codigo = i;

	}

	public int getCodigo() {
		return codigo;
	}

	public void abrirLaCaja(int nuevoCodigo) {
		if (nuevoCodigo == this.codigo) {
			this.abierto = true;
		} else {
			this.abierto = false;
		}

	}

}
