package usac.edu.gt.session.local;

@Stateless
public class ProductoFacade extends AbstractFacade<Producto> implements ProductoFacadeLocal{
	
	@PersistanceContect(unitName ='BD_PU')
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		UserTransaction userTransaction = ejbContext.getUserTransaction();
		userTransaction.begin();
		 this.create(entidad); 
		 this.edit(entidad); 
		 this.remove(entidad);
		 userTransaction.commit();
		return em;
	}
	
	@Resource
	private EJBContext ejbContext;
	
	public ProductoFacade() {
		super(Producto.class);
		
	}
}
