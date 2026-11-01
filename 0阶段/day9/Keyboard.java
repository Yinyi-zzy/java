public class Keyboard implements USB{
		private String brand;

		public  Keyboard(String brand){
				this.brand=brand;
		
		}

		@Override
			public void connect(){
				System.out.println(brand+"键盘已连接");		
		}
		@Override
			public void disconnect(){
				System.out.println(brand+"键盘已断开");
		
		}


}