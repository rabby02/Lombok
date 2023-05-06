package Testu.Qa;

public class TestUtil {
	
	public static void HoldExecutionForSeconds(int sec)
	{
		
		try {
			Thread.sleep(sec*1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
