public class ComputerTest{
		public static void main(String[]args){
		USB[]devices={
			new Mouse("罗技"),
			new Keyboard("雷蛇")
		};

			System.out.println("开机，逐个连接设备");
			for(USB device:devices){
				device.connect();
			}
			
			System.out.println("\n使用设备");

			//调用特有方法，向下转型

			if(devices[0] instanceof Mouse){
					Mouse m = (Mouse) devices[0];
					m.click();
			}

			System.out.println("关机，逐个断开设备");

			for(USB device:devices){
			device.disconnect();
			}
		}
			

}