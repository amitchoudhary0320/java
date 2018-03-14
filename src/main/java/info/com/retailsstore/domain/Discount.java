package info.com.retailsstore.domain;

public class Discount {

	
	/* create  getDiscount()  based on the User have 2 year & employee & affiliate  */
	public Integer getDiscount(User user){
		
		if( user.getMemberShipDuration()!=null && user.getMemberShipDuration()>=2 ){
			return 5;
		}else if(user.getStatus().equals("employee")){
			return 30 ;
		}else if(user.getStatus().equals("affiliate")){
			return 10;
		}else{
			return 0;
		}
		
	}
}
