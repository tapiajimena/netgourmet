package Model;

import java.util.ArrayList;

public class Proveedor {

	private Menu menu;
	private int telefono;
	private String direccion;
	private String nombre;
	private String horarioAtencion;
	private boolean puedeTomarMasPedidos;
	//en caso de tener demasiados pedidos, el proveedor deberia notificar
	//q actualmente no toma mas pedidos
	//esto evita esperas innecesarias de parte de los clientes, y evita al proveedor ser 
	//calificado de forma negativa
	private int sumatoriaCalificaciones;
	private int cantidadDeCalificaciones;
	//private boolean abierto;//es mas comodo ver un flag q diga si esta abierto, q comparar horarios. Ademas, podria estar cerrado por duelo, o por el ramad�n!
	//JAJAJA muy buena gus!
	
	private ArrayList<Pedido> pedidos;
	
	public Proveedor(){
		
	}
	
	//agregar un pedido al proveedor, si es que puede tomar pedidos
	public void sendPedido(Pedido pedido){
		if (puedeTomarMasPedidos) { 
			this.pedidos.add(pedido);
		}else{ 
			//EXCEPCION 
		}
	}
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public ArrayList<Pedido> getPedidosConfirmados() {
		return pedidos;//TODO: iterar
	}
	public ArrayList<Pedido> getPedidosCancelados() {
		return pedidos;//TODO: iterar
	}
	
	
	
	public void recibirCalificacion(int calif){
		cantidadDeCalificaciones++;
		sumatoriaCalificaciones += calif;
	}
	
	public String getPromedioCalificaciones(){
		String retorno = new String();
		
		if (cantidadDeCalificaciones == 0) retorno = "0";
		else retorno = Util.myNumberFormat().format(sumatoriaCalificaciones/cantidadDeCalificaciones);
		return retorno;
	}
	
	/*public void setAbierto(boolean bool){
		abierto = bool;
	}
	
	public boolean estaAbierto(){
		return abierto;
	}*/
	
	public void setPuedeTomarMasPedidos(boolean bool){
		puedeTomarMasPedidos = bool;
	}
	
	public boolean puedeTomarMaspedidos(){
		return puedeTomarMasPedidos;
	}
}
