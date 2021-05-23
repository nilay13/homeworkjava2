package homeworkjava2.Concrete;


import homeworkjava2.Abstract.BaseCustomerManager;
import homeworkjava2.Abstract.ICustomerCheckServices;
import homeworkjava2.Entities.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckServices customerCheckService;
	
	public SturbucksCustomerManager(ICustomerCheckServices customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		
		if(customerCheckService.checkIfResalPerson(customer))
		{
			super.Save(customer);
		}
		else 
		{
			System.out.println("Geçerli Kullanýcý deðil");
		}		
		
	
}
}

	

