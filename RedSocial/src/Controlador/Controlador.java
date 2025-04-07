package Controlador;

import java.util.ArrayList;

import Modelo.Foto;
import Modelo.FuenteNoticias;
import Modelo.Mensaje;
import Modelo.Publicacion;

public class Controlador {
	GestorArray gestorArray = new GestorArray();
	
	public Mensaje añadirMensaje(Mensaje mensaje,FuenteNoticias noticias) {
		gestorArray.añadirMensaje(mensaje);
		noticias.añadirMensaje(mensaje);
		return mensaje;
	}
	

	public Foto añadirFoto(Foto foto,FuenteNoticias noticias) {
		gestorArray.añadirFoto(foto);
		noticias.añadirFoto(foto);
		return foto;
	}
	
	public ArrayList<Publicacion> mostarPublicaciones() {
		ArrayList<Publicacion> publicaciones =  gestorArray.mostrarPublicaciones();
		return publicaciones;
	}
	

}
