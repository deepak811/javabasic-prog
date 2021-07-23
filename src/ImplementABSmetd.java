
public class ImplementABSmetd extends Absexm3{
	
	
	
	public void m6() {
		System.out.println("abstract method implemented sucessfully");
		
	}
	public static void main(String args[])
	{
		Absexm3 imp=new Absexm3();
		imp.m6();
		//here u can see u cannot instantiate abstract class it means u can not create object of class
		//Absexm3
		//in console this will the error msg
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			//Cannot instantiate the type Absexm3

			//at ImplementABSmetd.main(ImplementABSmetd.java:12)
		
		m6();
		ImplementABSmetd.m6();
		
		ImplementABSmetd imp1=new ImplementABSmetd();
		imp1.m6();
		//this will work fine u inherit all the properties of parent into child as the parent class is a abstract class u wont be able to
		//create its object
		//to access the method which is inside the class u have to create child class object first then only u can acces the method if its a static method
		//in that case no need to create object of classs to accesss the method directly call the method as m6() inside PSVM().
		//u can't call it in this way as (m6() &;ImplementABSmetd.m6();this works in case of static method only.
		
	}

	
}
//to implement abstract class abstract method u need to extend abstract class in another class
//when u do this u will get error on the child class name ImplementABSmetd saying"either make this class ImplementABSmetd as abstract or "
//		+ "add unimplemented methods of Absexm3"
//hover over the error on class "ImplementABSmetd" & click on add unimplemeted method it will put/add the abstract method 
//of Absexm3 class inside child class by removing abstract keyword from that mthod "it was like public abstract void m6();"
//not automaticallly it comes as public void m6(),now we will implement this 