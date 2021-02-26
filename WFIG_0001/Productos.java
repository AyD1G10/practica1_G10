import java.util.ArrayList;
import java.util.List;

@Named
@RequesScoped
public class Productos {
	private String nombreAplicacion;
	List<Producto> listProducts= new ArrayList<>();
	
	@EJB
	private ProductoFacadeLocal productoFacadeLocal;
	
	@PostConstruct
	public void init() {
		
		nombreAplicacion = "Practia 1";
	}
	
	@PreDestro
	public void destroy() {
		
	}
	
	public String getNombreAplicacion() {
		return nombreAplicacion;
	}
	
	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}
	
	public List<Producto> getListaProductos() {
		return listProducts;
	}
	
	public void setListaProductosn(List<Producto> listProducts) {
		this.listProducts = listProducts;
	}
	
}
