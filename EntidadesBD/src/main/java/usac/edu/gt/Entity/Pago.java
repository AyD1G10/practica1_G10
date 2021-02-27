package usac.edu.gt.Entity;

import java.util.List;

@Entity
public class Pago<T> {
	private double total;
	private int correlativo;
	private List<T> listaProductos;
	private String observaciones;
	
	public Pago(List<T> listaProductos,double total,int correlativo) {
		this.listaProductos = listaProductos;
		this.total = total;
		this.correlativo = correlativo;
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getCorrelativo() {
		return correlativo;
	}

	public void setCorrelativo(int correlativo) {
		this.correlativo = correlativo;
	}

	public List<T> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<T> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public String toString() {
		return "Categoria [correlativo="+correlativo+", total=" + total + ", listaProductos=" +listaProductos.toString()+"]"; 
	}
	
	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
