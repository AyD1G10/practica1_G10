package usac.edu.gt.session.local;

@Stateless
public class PagoFacade extends AbstractFacade<Pago> implements PagoFacadeLocal{
	
	@PersistanceContect(unitName ='BD_PU')
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		UserTransaction userTransaction = ejbContext.getUserTransaction();
		userTransaction.begin();
		this.create(entidad);
		userTransaction.commit();
		return em;
	}
	
	@Resource
	private EJBContext ejbContext;
	
	public PagoFacade() {
		super(Pago.class);
		
	}
	
	public create(EntityManager entidad){
		this.entidad = entidad;
	}

	@Override
	public double pago1(double num1) {
		if(num1>0){
			double numReturn=num1+num1*0.1;
			return numReturn;
			
		}
		
		
		return num1;
	}
	
	public double CalcularIVA(double valor) {
		double iva = valor * 0.12;
		DoLogger.log().info("Precio: " + valor.toString() 
			+ " Iva: " + iva.toString() 
			+ " Total: " + (valor + iva).toString());
		return iva;
	}
	public double restar_5porCiento(double num1, double num2, double num3) {
		double resultado =0;
		resultado = num1 + num2 + num3;
		resultado = resultado - (resultado * 0.05);
		return resultado;
	}
	
	public void sumarTotalPago(double total,Pago pago) {
		DoLogger.log().info("Total: " + total.toString());
		DoLogger.log().info("Total Pago: " + pago.total.toString());
		pago.total += total;
	}

	public double listaproduct_sumatotal() {
		ArrayList<Pago> lista_productos;
		Double total = 0;	
		for(int i = 0; i < lista_productos.size(); i++) {
			total += lista_productos.get(i).total;
		}
		DoLogger.log().info("Total: " + total);
		return total;
	}
	
}