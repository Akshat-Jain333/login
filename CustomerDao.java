package java8;

public interface CustomerDao {
	void customerInfo();
}

class CustomerImpl1 implements CustomerDao{
	
	CustomerDao customerDao=new CustomerDao() {

	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		System.out.println("Customer Info");
	}
};

public static void main(String[] args) {
	CustomerImpl1 customerImpl1=new CustomerImpl1();
	customerImpl1.customerDao.customerInfo();
}


}

