package Model;
import java.util.ArrayList;


public class Cliente {

	//Atributos nico
	private ArrayList<Pedido> pedidos;
	private int telefono;
	private String direccion;
	private String nombreUsuario; //para el login
	private String nombreCompleto;
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public ArrayList<Pedido> getPedidosConfirmados() {
		return pedidos;//TODO: iterar
	}
	public ArrayList<Pedido> getPedidosCancelados() {
		return pedidos;//TODO: iterar
	}
	public void setNuevoPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	/**
	 * Constructor
	 * @param telefono
	 * @param direccion
	 * @param historial
	 * @param nombreUsuario
	 * @param nombreCompleto
	 */
	public Cliente(int telefono, String direccion, Historial historial,
			String nombreUsuario, String nombreCompleto) {
		super();
		this.telefono = telefono;
		this.direccion = direccion;
		this.historial = historial;
		this.nombreUsuario = nombreUsuario;
		this.nombreCompleto = nombreCompleto;
	}
	
	//metodos getter y setters
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Historial getHistorial() {
		return historial;
	}
	public void setHistorial(Historial historial) {
		this.historial = historial;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
}
