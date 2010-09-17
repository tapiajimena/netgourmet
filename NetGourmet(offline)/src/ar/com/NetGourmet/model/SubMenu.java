package ar.com.NetGourmet.model;
import java.util.ArrayList;

//los menues suelen estar divididos por categorias, a esas subdivisiones las llamaremos submenues
//entonces, aparte de tener la lista de items, tenemos el nombre o categoria q la distingue
public class SubMenu {
	
	private String nombre;//
	private ArrayList<Item> listado;
	
	public SubMenu(String name, ArrayList<Item> list){
		nombre = name;
		listado = list;
	}
	
	public void agregarPlato(Item item){
		listado.add(item);
	}
	
	public void quitarPlato(Item item){
		//////////buscar y eliminar//////////////
	}
	
	public ArrayList<Item> getListado(){
		return listado;
	}
	
	public String getNombre(){
		return nombre;
	}
}
