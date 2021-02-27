package usac.edu.gt.session.local;

@Local
public interface PagoFacadeLocal {
	
	Pago find(Object id);
	
	void create(Pago pago);
	
	void edit(Pago pago);
	
	void remove(Pago pago);

}
