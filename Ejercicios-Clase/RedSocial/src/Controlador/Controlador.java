package Controlador;

import java.util.ArrayList;

import Modelo.Foto;
import Modelo.FuenteNoticias;
import Modelo.Gestor;
import Modelo.Mensaje;
import Modelo.Publicacion;

public class Controlador {
	
	Gestor gestor =  new Gestor();
	
	public Mensaje añadirMensaje(Mensaje mensaje,FuenteNoticias noticias) {
		noticias.añadirMensaje(mensaje);
		return mensaje;
	}
	

	public Foto añadirFoto(Foto foto,FuenteNoticias noticias) {
		noticias.añadirFoto(foto);
		return foto;
	}
	
	public ArrayList<Publicacion> mostarPublicaciones(FuenteNoticias fuentenoticias) {
		ArrayList<Publicacion> publicaciones =  fuentenoticias.getPublicaciones();
		return publicaciones;
	}
	
	public Publicacion comentarPublicacion(int id, String comentario,FuenteNoticias fuentenoticias) {
		ArrayList<Publicacion> publicaciones =  fuentenoticias.getPublicaciones();
		for(Publicacion publicacion:publicaciones) {
			if(id==publicacion.getId()) {
				publicacion.getComentarios().add(comentario);
				return publicacion;
			}
		}
		return null;
	}
	
	public Publicacion darLike(int id,FuenteNoticias fuentenoticias) {
		ArrayList<Publicacion> publicaciones =  fuentenoticias.getPublicaciones();
		for(Publicacion publicacion:publicaciones) {
			if(id==publicacion.getId()) {
				publicacion.darLike(publicacion);
				return publicacion;
			}
		}
		return null;
	}
	
	public Publicacion darUnLike(int id,FuenteNoticias fuentenoticias) {
		ArrayList<Publicacion> publicaciones =  fuentenoticias.getPublicaciones();
		for(Publicacion publicacion:publicaciones) {
			if(id==publicacion.getId()) {
				publicacion.darUnLike(publicacion);
				return publicacion;
			}
		}
		return null;
	}
	
	public ArrayList<Publicacion> leerArchivo(FuenteNoticias fuentenoticias) {
		ArrayList<Publicacion> publicaciones =  gestor.leerArchivo();
		for(Publicacion publicacion : publicaciones) {
			fuentenoticias.getPublicaciones().add(publicacion);
		}
		return publicaciones;
	} 
	

}
