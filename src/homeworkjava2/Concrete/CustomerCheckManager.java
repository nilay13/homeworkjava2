package homeworkjava2.Concrete;


import homeworkjava2.Abstract.ICustomerCheckServices;
import homeworkjava2.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckServices{

	@Override
	public boolean checkIfResalPerson(Customer customer) {
		
		return true;
}
}


