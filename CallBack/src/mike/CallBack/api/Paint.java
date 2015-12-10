package mike.CallBack.api;

public class Paint  implements CallBackInterface{

	@Override
	public  void paint() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("begin");
		this.paint();
		System.out.println("end");
	}
}
