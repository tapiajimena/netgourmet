package models;

import java.util.ArrayList;


/**
 * 
 */
public class Cliente {

	//Atributos
	private ArrayList<Pedido> pedidos;
	
	private String nombre;
	private String direccion;
	private String email;
	private int telefono;
	private int celular;
	private String usuario; //para el login
	private String clave;   //para el login
	
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
	
	//metodos
	/**
	 * Constructor
	 */
	public Cliente(String nombre, String direccion, String email, int telefono, int celular, String usuario, String clave) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
		this.celular = celular;		
		this.usuario = usuario;
		this.clave = clave;
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
	
}
