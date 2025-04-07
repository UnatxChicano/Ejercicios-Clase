package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Gestor {

	
	
	public ArrayList<Publicacion> leerArchivo() {
		ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
		 File archivo = new File("vehiculos.txt");
		
		try {
			 if (archivo.exists()) {
	                FileReader fr = new FileReader(archivo);
	                BufferedReader br = new BufferedReader(fr);
	                String linea;

		        while ((linea = br.readLine()) != null) {
		        	
		        	if (linea.trim().isEmpty() || linea.startsWith("-")) continue;
		        	
		        	if (linea.startsWith("Mensaje nº")) {
		                int id = Integer.parseInt(linea.split("Mensaje nº")[1].trim());
		                String texto = br.readLine().split("Texto: ")[1];
		                String usuario = br.readLine().split("usuario: ")[1];
		                long instante = Long.parseLong(br.readLine().split("instante: ")[1]);
		                int likes = Integer.parseInt(br.readLine().split("likes: ")[1]);

		                ArrayList<String> comentarios = new ArrayList<String>();
		                while ((linea = br.readLine()) != null && linea.startsWith("Comentario:")) {
		                    comentarios.add(linea.split("Comentario: ")[1]);
		                }

		                publicaciones.add(new Mensaje(id, usuario, likes, comentarios, instante, texto));
		            } else if (linea.startsWith("Foto nº")) {
		                int id = Integer.parseInt(linea.split("Foto nº")[1].trim());
		                String fichero = br.readLine().split("Fichero: ")[1];
		                String titulo = br.readLine().split("Título: ")[1];
		                String usuario = br.readLine().split("Usuario: ")[1];
		                long instante = Long.parseLong(br.readLine().split("Instante: ")[1]);
		                int likes = Integer.parseInt(br.readLine().split("Likes: ")[1]);

		                ArrayList<String> comentarios = new ArrayList<String>();
		                while ((linea = br.readLine()) != null && linea.startsWith("Comentario:")) {
		                    comentarios.add(linea.split("Comentario: ")[1]);
		                }

		                publicaciones.add(new Foto(id, usuario, likes, comentarios, instante, fichero,titulo));
		            }
		        }
		        br.close();
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}


	
		return publicaciones;
	}
}
