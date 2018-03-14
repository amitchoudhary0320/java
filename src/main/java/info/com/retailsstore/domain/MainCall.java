package info.com.retailsstore.domain;

public class MainCall {

	public static void main(String[] args) {
	
		/* create Product instance*/
		
		Product product=new Product(12, "food",10.d);
		
		/* create Product instance*/
		
		User user=new User("akc",90,"affiliate",null,product);
		
		System.out.println("User data is :--"+user);
		
		
		/* create Discount  instance*/
		Discount discount=new Discount();
		discount.getDiscount(user);
		System.out.println("User Discout based on the role{ ( 'employee/affiliate'):-"+discount.getDiscount(user));
		
		Bill b=new Bill();
		System.out.println("User Final Bill based on the role & product & Doller:-"+b.printBillDiscount(user, discount));

	};
	
	
	

}
