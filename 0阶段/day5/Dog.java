public class Dog extends Animal{
	public Dog(String name){
		super (name);
	}
		@Override
			public void eat(){
		System.out.println(getName()+"在吃骨头");
			}

			public void bark(){
				System.out.println(getName()+"汪汪");
			}
}