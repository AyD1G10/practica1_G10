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
	
	public double restar_5porCiento(double num1, double num2) {
		double resultado =0;
		resultado = num1 + num2;
		resultado = resultado - (resultado * 0.05);
		return resultado;
	}
	
	
}