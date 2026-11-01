public class BookTest{
	public static void main(String[]args){
		Book book1=new Book("三体","liu",60.0);
		Book book2=new Book("三体2","liu",65.0);
		book1.showInfo();
		book2.showInfo();
		book2.setPrice(30.0);
		book2.showInfo();
		System.out.println("book1书名是"+book1.getName());
	}



}
