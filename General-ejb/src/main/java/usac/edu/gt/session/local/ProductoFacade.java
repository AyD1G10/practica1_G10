package usac.edu.gt.session.local;

@Stateless
public class ProductoFacade extends AbstractFacade<Producto> implements ProductoFacadeLocal{
	
	@PersistanceContect(unitName ='BD_PU')
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	@Resource
	private EJBContext ejbContext;
	
	public ProductoFacade() {
		super(Producto.class);
	}
}
