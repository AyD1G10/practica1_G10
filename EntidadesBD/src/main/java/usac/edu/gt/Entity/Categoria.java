package usac.edu.gt.Entity;

@Entity
public class Categoria {
	
	private int codigoCategoria;
	private String nombre;
	private String descripcion;
	
	public Categoria(int codigoCategoria,String nombre,String descripcion) {
		this.codigoCategoria = codigoCategoria;
		this.descripcion = descripcion;
		this.nombre = nombre;
	}
	
	public int getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String toString() {
		return "Categoria [codigoCategoria="+codigoCategoria+", nombre=" + nombre + ", descripcion=" +descripcion+"]"; 
	}
}
