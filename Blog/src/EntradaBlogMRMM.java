/*Clase para manejar las entradas de un blog.
 * La clase se creó el 21/3/1999 por Ana López.
 * Esta es la versión 2.3
 */
//Modificar.
/**
 * EntradaBlogMRMM
 * @author Maria del Rosario Martínez Marco (Charo)
 * @version 2.3
 *
 */
public class EntradaBlogMRMM {		
/**
 * Clase que representa una entrada en un Blog
 */
//separador es el ccarácter que separa ENTRADA DE del
	//nombre del autor
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	//Constructor de la clase. recibe el número de entrada, el nombre del autor
	//de la entrada y el texto que contiene la entrada. Si el número de entrada
	//es negativo, lanza una excepción.
	/**
	 * Constructor de la clase
	 * @param id código que se le da a la entrada
	 * @param autor nombre del autor de la entrada
	 * @param texto contenido de la entrada
	 * @throws IllegalArgumentException se produce la excepción cuando el id es negativo
	 */
	public EntradaBlogMRMM(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	//Devuelve el número de la entrada
	/**
	 * Obtención del código de entrada
	 * @return id: código de la entrada
	 */
	public int getId(){
		return this.id;
	}
	
	//devuelve el texto completo de la entrada
	/**
	 * Obtención del texto completo de entrada
	 * @return texto: texto de entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	//devuelve el nombre del autor de la entrada en mayúsculas
	/**
	 * Devuelve el nombre del autor de la entrada en mayúsculas
	 * @return autor: nombre del autor en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	//devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	/** 
	 * Método obsoleto que devuelve el autor de la entrada
	 * see getAutor()
	 * @return nombre del autor
	 */
	@SuppressWarnings("javadoc")
	public String devuelveAutor(){
		return this.autor;
	}
	
	//No tiene porqué tener argumentos.
	/**
	 * @param args sin argumentos
	 */
	public static void main(String[] args) {
                //Modificar.
		EntradaBlogMRMM e1=new EntradaBlogMRMM (1,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}