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
	
	@Override
	public double pago1(double num1) {
		double numReturn=num1+num1*0.1;
		
		return numReturn;
	}
	
	public double CalcularIVA(double valor) {
		return valor * 0.12;
	}
}