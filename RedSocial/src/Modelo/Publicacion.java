package Modelo;

import java.util.ArrayList;

public  class Publicacion {
	static int index=0;
	protected int id;
	protected String usuario;
	protected int likes;
	protected ArrayList<String> comentarios;
	protected long time;
	protected FuenteNoticias noticias;
	
	public Publicacion(){
		index ++;
		id=index;
		usuario="";
		likes=0;
		comentarios=new ArrayList<String>();
		time=System.currentTimeMillis();
	}
	
	
		public Publicacion( String usuario, int likes, ArrayList<String> comentarios) {
		super();
		index++;
		this.id = index;
		this.usuario = usuario;
		this.likes = likes;
		this.comentarios = comentarios;
		this.time = System.currentTimeMillis();
	}
		
		public Publicacion(int Id,String usuario, int likes, ArrayList<String> comentarios,long time) {
			super();
			index++;
			this.id = Id;
			this.usuario = usuario;
			this.likes = likes;
			this.comentarios = comentarios;
			this.time = time;
		}


		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public int getLikes() {
			return likes;
		}
		public void setLikes(int likes) {
			this.likes = likes;
		}
		public ArrayList<String> getComentarios() {
			return comentarios;
		}
		public void setComentarios(ArrayList<String> comentarios) {
			this.comentarios = comentarios;
		}
		public long getTime() {
			return time;
		}
		public void setTime(long time) {
			this.time = time;
		}
		
		
		public void darLike(Publicacion publi) {
			publi.setLikes(publi.getLikes()+1);
		}
		
		public void darUnLike(Publicacion publi) {
			if(publi.getLikes()!=0) {
			publi.setLikes(publi.getLikes()-1);
			}
		}

		public void dejarComentario(Publicacion publi,String comentario){
			publi.getComentarios().add(comentario);
		}


		@Override
		public String toString() {
			return "Publicacion [id=" + id + ", usuario=" + usuario + ", likes=" + likes + ", comentarios="
					+ comentarios + ", time=" + time + "]";
		}
		
		

}
