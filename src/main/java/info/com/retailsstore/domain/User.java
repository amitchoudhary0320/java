package info.com.retailsstore.domain;

public class User {

	
	private Integer Id;
	private String name;
	private String status;
	private Integer memberShipDuration;
	private Product product;
	
	
	public User(String name, Integer id, String status,Integer memberShipDuration,Product product) {
		super();
		this.name = name;
		Id = id;
		this.status = status;
		this.memberShipDuration=memberShipDuration;
		this.product=product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
		
	}
	
	
	public Integer getMemberShipDuration() {
		return memberShipDuration;
	}
	public void setMemberShipDuration(Integer memberShipDuration) {
		this.memberShipDuration = memberShipDuration;
	}
	
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", Id=" + Id + ", status=" + status + "]";
	}
	
	
}
