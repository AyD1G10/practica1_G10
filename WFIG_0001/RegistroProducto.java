import java.util.ArrayList;
import java.util.List;

@Named
@RequesScoped
public class RegistroProducto {
	
	private int id;
	private String nombre;
	private double precio;
	
	@EJB
	private RegistroProductoFacadeLocal registroProductoFacadeLocal;
	
	@PostConstruct
	public void init() {
		
	}
	
	@PreDestroy
	public void destroy() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
