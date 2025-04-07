package Vista;

import java.util.ArrayList;
import java.util.Scanner;

import Controlador.Controlador;
import Modelo.Foto;
import Modelo.FuenteNoticias;
import Modelo.Mensaje;
import Modelo.Publicacion;


public class Menu {
	static Scanner teclado = new Scanner(System.in);
	static Controlador controlador = new Controlador();
	static FuenteNoticias noticias = new FuenteNoticias();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		controlador.leerArchivo(noticias);
		menu();

	}

	
	public static int menu() {
		int opcion=-1;
		
		do { 
			
			System.out.println("1- Añadir mensaje \n"
					+ "2- Añadir foto \n"
					+ "3- Mostar mensaje \n"
					+ "4- Mostar mensajes por usuario \n"
					+ "5- Comentar una publicacion \n"
					+ "6- Dar like a un mensaje \n"
					+ "7- Dar unlike a un mensaje \n"
					+ "8- Salir \n");
			opcion = teclado.nextInt();
			
			switch(opcion) {
			case 1: 
				Mensaje mensaje =pedirMensaje();
				controlador.añadirMensaje(mensaje,noticias);
				break;
			case 2:
				controlador.añadirFoto(pedirFoto(),noticias);
				break;
			case 3:
				ArrayList<Publicacion> publicaciones=controlador.mostarPublicaciones(noticias);
				for(Publicacion publicacion:publicaciones) {
						System.out.println(publicacion);
				}
				
				
				break;
			case 4:
				System.out.println("Introduce el usuario");
				String usuario = teclado.next();
				ArrayList<Publicacion> publicaciones2=controlador.mostarPublicaciones(noticias);
				for(Publicacion publicacion:publicaciones2) {
					if(publicacion.equals(usuario)) {
						System.out.println(publicacion);
				}
				}
				
				break;
			case 5:
				System.out.println("Introduce el id de la publicacion a comentar");
				int id=teclado.nextInt();
				System.out.println("Introduce el comentario:");
				String comentario = teclado.next();
				controlador.comentarPublicacion(id, comentario, noticias);
				break;
			case 6:
				System.out.println("Introduce el id de la publicacion a dar like");
				int idLike=teclado.nextInt();
				controlador.darLike(idLike, noticias);
				break;
			case 7:
				System.out.println("Introduce el id de la publicacion a dar unlike");
				int idUnLike=teclado.nextInt();
				controlador.darUnLike(idUnLike, noticias);
				break;
			case 8:
				System.out.println("Saliendo...");
				break;
			}
				
			
		}while(opcion!=8);
		
		return opcion;
		}
	
	
	public static  Mensaje pedirMensaje() {
		
		Mensaje mensaje = new Mensaje();
		System.out.println("Introduce el usuario");
		mensaje.setUsuario(teclado.next());
		System.out.println("Introduce el mensaje");
		mensaje.setMensaje(teclado.next());

		return mensaje;
	}
	public static Foto pedirFoto() {
		
		Foto foto = new Foto();
		System.out.println("Introduce el usuario");
		foto.setUsuario(teclado.next());
		System.out.println("Introduce el nombre de la foto");
		foto.setNombreFoto(teclado.next());
		System.out.println("Introduce el nombre del archivo");
		foto.setArchivo(teclado.next());

		return foto;
	}
	
}

