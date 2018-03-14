package info.com.retailsstore.domain;

public class Bill {

	/* create Total printBillDiscount()  based on the groceries*/
	
	public Integer printBillDiscount(User user,Discount d){
		
		
		Integer total=d.getDiscount(user);
		if(user.getProduct().getName()!=null && user.getProduct().getName().equals("groceries")){
			return total=0;
		}else{
			return total + billDiscountBasedOnDoller( user);
		}
	}
	
	
	/* create billDiscountBasedOnDoller() based on the doller  */
	
	public static Integer billDiscountBasedOnDoller(User user){
		if(user.getProduct().getPrice()!=null && user.getProduct().getPrice()>=100){
			return 5;
		}else{
			return 0;
		}
	}
}
