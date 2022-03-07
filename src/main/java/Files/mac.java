package Files;

public class mac {
    private int id;
    private String name;
    private int age;
    
    
    
    
	public mac() {
		super();
		// TODO Auto-generated constructor stub
	}
	public mac(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Water [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
    
    
}
