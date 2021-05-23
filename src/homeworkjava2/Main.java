package homeworkjava2;

import homeworkjava2.Abstract.BaseCustomerManager;
import homeworkjava2.Concrete.SturbucksCustomerManager;
import homeworkjava2.adapter.MerniceServiceAdapter;
import homeworkjava2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCutomerManager= new SturbucksCustomerManager(new MerniceServiceAdapter());
		baseCutomerManager.Save(new Customer(1,"Hatice","Sönmez","HAtice12@gmail.com"));
		
	}

	
}
