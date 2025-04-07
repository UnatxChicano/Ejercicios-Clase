package Modelo;

import java.util.ArrayList;

public class FuenteNoticias {
	
	public ArrayList<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}

	private ArrayList<Publicacion> publicaciones;

	public FuenteNoticias(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
	
	public FuenteNoticias() {
		publicaciones = new ArrayList<Publicacion>();
	}
	
	public void añadirMensaje(Mensaje mensaje) {
		publicaciones.add(mensaje);
	}
	public void añadirFoto(Foto foto) {
		publicaciones.add(foto);
	}

	@Override
	public String toString() {
		return "FuenteNoticias [mensajes=" + publicaciones + "]";
	}
	
	

}
