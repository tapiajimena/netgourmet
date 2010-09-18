package Model;
import java.util.ArrayList;
import java.util.Iterator;


public class Menu {

	private ArrayList<SubMenu> listadoDeSubMenues_platos;
	private ArrayList<SubMenu> listadoDeSubMenues_bebidas;
	//private ArrayList<Listado> listadoDeCombos;//combos q incluyen uno o varios platos y la bebida

	public Menu(){
		listadoDeSubMenues_platos = new ArrayList<SubMenu>();
		listadoDeSubMenues_bebidas = new ArrayList<SubMenu>();
	}
	
	public ArrayList<SubMenu> getListadoSubMenues_platos(){
		return listadoDeSubMenues_platos;
	}

	public ArrayList<SubMenu> getListadoSubMenues_bebidas(){
		return listadoDeSubMenues_bebidas;
	}
}
