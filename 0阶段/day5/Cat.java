public class Cat extends Animal
{
	public Cat(String name){
		super(name);
	}

	@Override
		public void eat(){
			System.out.println(getName()+"吃鱼");
		}
		public void miao(){
			System.out.println(getName()+"喵喵");
		}
}