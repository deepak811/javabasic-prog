package interfaceexa;

public interface interfaceexample {
	
	public void m11();
	//the above one is called as abstract method  without implementation
	
	public  void m12()
	{};
	//this method is called as method with dummy implemetation /method with incomplete implemtation

	public void m13();
	public abstract  void m14();
//Every method in interface are always public & abstract(whether we are declaring or not )
	//that y we call interface as 100% pure abstract class
	
	public static final int a=3;
	int b=4;
	//every variable in interface is always public, static & final whether we are declaring it or not
	//Variable present in abstract class need not to be public static & final

	private void m16();
	
	private static final int c=3;
}
