public class Animal  {
	private String name;
	
	public Animal(String  name){
	this.name=name;
	}

	public void eat() {
		System.out.println(name+"在吃东西");
	 }

	public String getName() {
	return name;
	}

}