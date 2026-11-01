import java.util.ArrayList;
public class Library{
	private ArrayList<Book> books;

	public Library(){
		books = new ArrayList<>();
	}
	public void addBook(Book book){
		books.add(book);
		System.out.println("添加成功！");
	}
	public void showAllBooks(){
		if(books.isEmpty()){
				System.out.println("书库为空");
				return;
		}
		
		for(int i=0;i<books.size();i++){
			System.out.println("["+(i+1)+"]");
			books.get(i).showInfo();
			}
		}

	public void findBook( String name){
			boolean found = false;
			for(Book b:books){
				if(b.getName().equals(name)){
					found = true;
					b.showInfo();
				}
				}
			if(!found){
				System.out.println("没找到"+"《"+name+"》");

				}
	}

	public int getCount(){
			return books.size();
			}






}