import java.util.Scanner;

public class Main{
	public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			Library library = new Library();

			System.out.println("图书管理系统");

				while (true)
				
				{
	    System.out.println("\n请选择操作");		// \n直接换行再输出
	    System.out.println("1. 添加图书");
            System.out.println("2. 显示所有图书");
            System.out.println("3. 按书名查找");
            System.out.println("4. 退出");
            System.out.print("输入选项：");

			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1){
				System.out.println("书名");
				String name = sc.nextLine();
				
				System.out.println("作者");
				String author = sc.nextLine();

				System.out.println("价格");
				double price = sc.nextDouble();
				sc.nextLine();

				Book book= new Book(name,author,price);
				library.addBook(book);




			}
			
			else if (choice == 2){
					System.out.println("所有图书");		
					library.showAllBooks();
					System.out.println(library.getCount()+"本");

					}
				
			else	if (choice == 3){
					System.out.println("输入书名");
					String name = sc.nextLine();
					library.findBook(name);
			
			}
			else	if (choice == 4){
					System.out.println("再见！");
					break;
					}
			else{
  				System.out.println("无效选项，请重新输入");
			}
					
				
				}


			sc.close();


			
			}

}
