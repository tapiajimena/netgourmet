package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Un Pedido es un conjunto de Items, estos items pueden pertenecer a distintos proveedores, por ello
 * el pedido es enviado al dispatcher que toma el pedido, lo filtra por proveedor y lo reparte a los proveedores.
 */
public class Pedido {
//un cliente tiene varios pedidos
	
	/**
	 * NEFASTA IMPLEMENTACION CON STRINGS
	 * TODO: ARREGLAR
	 */
	
	//This code sucks, you know it and I know it. 
	//Move on and call me an idiot later.
	private boolean confirmado;//confirmado o no confirmado (se podria decir que esta en espera) -> true or false
	private boolean cancelado;// cancelado o "confirmado o en espera"
	private Date fechaCreacion; //Fecha en que el pedido fue realizado
	private Date fechaConfirmado; //Fecha en que el pedido fue confirmado
	private Date fechaEnvio; //En caso de realizar un pedido a fecha postergada
	private ArrayList<Item> listado;

	//metodos
	/**
	 * Constructor
	 * por defecto un Pedido no esta confirmado, esta pendiente
	 */
	public Pedido() {
		confirmado = false;
		cancelado = false;
	}
	
	public boolean is_confirmado() {
		return confirmado;
	}
	
	public void confirmar() {
		confirmado = true;
	}
	
	//un pedido se puede cancelar solo si no ha sido confirmado
	//en otras palabras, solo se puede cancelar si estaba en espera
	public void cancelar() throws imposibleCancelarPedidoException {
		if(!confirmado) cancelado = true;
		else throw new imposibleCancelarPedidoException(this);
	}
	
	/**
	* For the brave souls who get this far: You are the chosen ones,
	* the valiant knights of programming who toil away, without rest,
	* fixing our most awful code. To you, true saviors, kings of men,
	* I say this: never gonna give you up, never gonna let you down,
	* never gonna run around and desert you. Never gonna make you cry,
	* never gonna say goodbye. Never gonna tell a lie and hurt you.
	*/
	
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
