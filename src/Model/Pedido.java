package Model;

import java.util.ArrayList;

public class Pedido {
//un cliente tiene varios pedidos
	
	/**
	 * NEFASTA IMPLEMENTACION CON STRINGS
	 * TODO: ARREGLAR
	 */
	
	//atriburos
	private String estado;
	private int fechaCreacion; //Fecha en que el pedido fue realizado
	private int fechaConfirmado; //Fecha en que el pedido fue confirmado
	private int fechaEnvio; //En caso de realizar un pedido a fecha postergada
	private ArrayList<Item> listado;

	//metodos
	/**
	 * Constructor
	 * por defecto un Pedido no esta confirmado, esta pendiente
	 */
	public Pedido() {
		this.estado = "Pendiente";
	}
	
	public boolean is_confirmado() {
		if (estado=="confirmado"){ 
				return true; 
			}else{
				return false;
			}
	}
	public void confirmar() {
		estado = "confirmado";
	}
	public void cancelar() {
		if (estado!="confirmado") { 
			estado = "Cancelado";
		}else{ 
			//EXCEPCION 
		}
	}
	
	public void agregarItem(Item item){
		listado.add(item);
	}
	
	public void quitarItem(Item item){
		//////////buscar y eliminar//////////////
	}
	
	public ArrayList<Item> getItems() {
		return listado;
	}
	
}
