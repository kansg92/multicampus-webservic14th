package oracle;

//VO = value object
public class CustomerVO {
	private String id;
	private String password;
	private String name;
	public CustomerVO() {
	}
	public CustomerVO(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	
	
}
