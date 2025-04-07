package Modelo;

import java.util.ArrayList;

public class Mensaje extends Publicacion {
	
	private String mensaje;

	public Mensaje() {
		super();
		mensaje="";
	}
	

	public Mensaje(int id, String usuario, int likes, ArrayList<String> comentarios, long time, String mensaje) {
		super(id, usuario, likes, comentarios, time);
		this.mensaje=mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return super.toString() + "mensaje=" + mensaje + "]";
	}

}
