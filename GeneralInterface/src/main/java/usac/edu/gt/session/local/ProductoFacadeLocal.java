package usac.edu.gt.session.local;


@Local
public interface ProductoFacadeLocal {
	
	Producto find(Object id);
	
	void create(Producto producto);
	
	void edit(Producto producto);
	
	void remove(Producto producto);

}
