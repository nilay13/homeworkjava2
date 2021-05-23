package homeworkjava2.Abstract;

import homeworkjava2.Entities.Customer;
//import homeworkjava2.Concrete.SturbucksCustomerManager;
//import homeworkjava2.Concrete.NeroCustomerManager;


public abstract class BaseCustomerManager implements ICustomerServices{

	@Override
	public void Save(Customer customer) {
		System.out.println("Save to db : " + customer.getFirstName() );
		
	}

	//protected abstract void add(Customer customer);

}
