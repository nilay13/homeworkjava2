package homeworkjava2.Entities;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	public Customer(int id, String firstName, String lastName, String eMail) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getNationalityId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
