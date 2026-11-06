public class Mouse implements USB{
		private String brand;

		public Mouse(String brand){
		this.brand=brand;
		}

		@Override
			public void connect(){
					System.out.println(brand+"鼠标已连接");
					}
		@Override
			public void disconnect(){
					System.out.println(brand+"鼠标已断开");
					}

			//特有办法，不属于重写父类，不用写@Override

			public void click(){
					System.out.println(brand+"鼠标单击");
					}
		}
