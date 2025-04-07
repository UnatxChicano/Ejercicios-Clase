package Controlador;

import java.util.ArrayList;

import Modelo.Foto;
import Modelo.Mensaje;
import Modelo.Publicacion;

public class GestorArray {

	static ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
	
	public void añadirMensaje(Mensaje mensaje) {
		publicaciones.add(mensaje);
		
		
	}
	
	public void añadirFoto(Foto foto) {
		publicaciones.add(foto);	
	}
	
	public ArrayList<Publicacion> mostrarPublicaciones(){
		return publicaciones;
	}
	
}
