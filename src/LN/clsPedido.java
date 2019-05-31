package LN;

import Comun.clsRuntimeExceptionPropia;
import Comun.itfProperty;
import static Comun.clsConstantes.*;

/**
 * Clase para crear objetos pedido *
 */
public class clsPedido implements itfProperty {
	
	/*
	 * Id del pedido
	 */
	int idpedido;
	/*
	 * Precio del pedido
	 */
	double precio;
	/*
	 * N de bastidor del vehiculo a vender
	 */
	String numbastidor;
	/*
	 * Dni del comprador
	 */
	String dnicliente;
	/*
	 * Id de operario
	 */
	String idoperario;
	/*
	 * Tipo de pedido
	 */
	String tipopedido;
	
	/*
	 * Constructor para recoger de BBDD
	 */
	public clsPedido(int idpedido, double precio, String numbastidor, String dnicliente, String idoperario, String tipopedido) {
		this.idpedido = idpedido;
		this.precio = precio;
		this.numbastidor = numbastidor;
		this.dnicliente = dnicliente;
		this.idoperario = idoperario;
		this.tipopedido = tipopedido;
	}

	/*
	 * Constructor para insertar el objeto en BBDD
	 */
	public clsPedido(double precio, String numbastidor, String dnicliente, String idoperario, String tipopedido) {
		this.precio = precio;
		this.numbastidor = numbastidor;
		this.dnicliente = dnicliente;
		this.idoperario = idoperario;
		this.tipopedido = tipopedido;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public double getPrecio() {
		return precio;
	}

	public String getNumbastidor() {
		return numbastidor;
	}

	public String getDnicliente() {
		return dnicliente;
	}

	public String getIdoperario() {
		return idoperario;
	}

	public String getTipopedido() {
		return tipopedido;
	}

	@Override
	public Object getProperty(String propiedad) throws clsRuntimeExceptionPropia {
		
		switch(propiedad) {
		
		case PROPIEDAD_PEDIDO_ID: return this.getIdpedido();
		case PROPIEDAD_PEDIDO_PRECIO: return this.getPrecio();
		case PROPIEDAD_PEDIDO_NUMBASTIDOR: return this.getNumbastidor();
		case PROPIEDAD_PEDIDO_DNICLIENTE: return this.getDnicliente();
		case PROPIEDAD_PEDIDO_IDOPERARIO: return this.getIdoperario();
		case PROPIEDAD_PEDIDO_TIPOPEDIDO: return this.getTipopedido();
		default: throw new clsRuntimeExceptionPropia();
		}
	}
	
	
	
	
	
	
	
	

}
