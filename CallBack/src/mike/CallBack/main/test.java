package mike.CallBack.main;

import static org.junit.Assert.*;

import org.junit.Test;

import mike.CallBack.api.Paint;

public class test extends Paint{

	@Test
	public void test() {
		this.draw();
	}
	@Override
	public void paint() {
		// TODO Auto-generated method stub
		super.paint();
		System.out.println("doing...");
	}

}
