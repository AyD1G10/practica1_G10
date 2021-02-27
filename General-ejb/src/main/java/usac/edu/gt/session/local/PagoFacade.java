package usac.edu.gt.session.local;

@Stateless
public class PagoFacade extends AbstractFacade<Pago> implements PagoFacadeLocal{
	
	@PersistanceContect(unitName ='BD_PU')
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		
		return em;
	}
	
	@Resource
	private EJBContext ejbContext;
	
	public PagoFacade() {
		super(Pago.class);
		
	}
	
	public void sumarTotalPago(double total,Pago pago) {
		pago.total += total;
	}
	
}