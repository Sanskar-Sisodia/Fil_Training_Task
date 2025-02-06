package RUNTIME;

public class RT {

	public static void main(String[] args) {
		try
		{
			Runtime r=Runtime.getRuntime();
			Process p=r.exec("MSPaint");
			}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
