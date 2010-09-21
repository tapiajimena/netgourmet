package Model;

public class Pedido {
//un cliente tiene varios pedidos
	
	//atriburos
	private boolean confirmado;

	//metodos
	/**
	 * Constructor
	 * por defecto un Pedido no esta confirmado
	 */
	public Pedido() {
		this.confirmado = false;
	}
	
	public boolean is_confirmado() {
		return confirmado;
	}
	public void confirmar() {
		this.confirmado = true;
	}
	public void cancelar() {
		this.confirmado = false;
	}
}
