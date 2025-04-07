package Modelo;

import java.util.ArrayList;

public class Foto extends Publicacion {
	
	private String archivo;
	private String nombreFoto;
	
	public Foto() {
		// TODO Auto-generated constructor stub
		archivo="";
		nombreFoto="";
	}

	public Foto(int id, String usuario, int likes, ArrayList<String> comentarios, long time,String archivo,String nombreFoto) {
		super(id, usuario, likes, comentarios, time);
		// TODO Auto-generated constructor stub
		this.archivo=archivo;
		this.nombreFoto=nombreFoto;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public String getNombreFoto() {
		return nombreFoto;
	}

	public void setNombreFoto(String nombreFoto) {
		this.nombreFoto = nombreFoto;
	}

	@Override
	public String toString() {
		return super.toString() + "archivo=" + archivo + ", nombreFoto=" + nombreFoto + "]";
	}	

}
