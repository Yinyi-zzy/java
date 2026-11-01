import	java.util.ArrayList;
public class Test{
	public static void main(String[]args){
		Animal a1=	new	Dog("旺财")	;
		Animal a2=	new	Cat("咪咪");
		Animal a3=	new Dog("大黄");

	Animal []zoo={a1,a2,a3};

	System.out.println("遍历数组");
		for( Animal a:zoo){
			a.eat();
		}
//ArrayList版本
	ArrayList<Animal> animals=new ArrayList<>();
	animals.add(new Dog("来福"));
	animals.add(new Cat("小花"));
	animals.add(new Dog("阿黄"));

	System.out.println("ArrayList版本");
	for(Animal a:animals){
		a.eat();
		}
	//调用子类
	Animal unknown =new Dog("旺旺");
	if(unknown instanceof Dog){
		Dog d =(Dog)unknown;
		d.bark();
	}


	}
}