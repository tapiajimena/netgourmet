package models;

import java.util.ArrayList;


/**
 * 
 */
public class Proveedor {

	//Atributos
	private ArrayList<Comida> comidas;
	private ArrayList<Pedido> pedidos;
	
	private String nombre;
	private int telefono;
	private String direccion;
	private String website;
	private String atencion_desde_hora;
	private String atencion_hasta_hora;
	private String usuario; //para el login
	private String clave;   //para el login

	
	
	
	
	//metodos getter y setters	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

}
