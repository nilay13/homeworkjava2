package homeworkjava2.adapter;
import homeworkjava2.Abstract.ICustomerCheckServices;
import homeworkjava2.Entities.Customer;
import homeworkjava2.tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
public class MerniceServiceAdapter implements ICustomerCheckServices {

	@Override
	public boolean checkIfResalPerson(Customer customer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		boolean result = false;
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), 0);
			
		} catch(Exception e ) {
			
			
			System.out.println("Geçerli Deðil");
		}
		return result;
	}

	
	
}
