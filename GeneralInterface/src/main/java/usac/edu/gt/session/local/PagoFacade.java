package usac.edu.gt.session.local;

import java.util.ArrayList;

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
	
	public void listaproduct_sumatotal() {
		ArrayList<Pago> lista_productos;
		Double total = 0;	
		for(int i = 0; i < lista_productos.size(); i++) {
			total += lista_productos.get(i).total;
		}
		
	}
	
}