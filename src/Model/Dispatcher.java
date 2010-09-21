package Model;

import java.util.ArrayList;

/**
 * La idea de esta clase utilitaria, es que reciba los pedidos armados por el Cliente,
 * luego separe los items por proveedor, arme los pedidos por proveedor
 * y lo envie a los proveedores.
 */
public class Dispatcher {
	
	public void tomarPedido(Pedido pedido) {
		if (pedido.is_confirmado()){
			//iterar pedido y armar pedidos por proveedor
		}else{
			//EXCEPCION
		}
	}
	
}
