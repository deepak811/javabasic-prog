
abstract class AbstractClass {
	
public static void main(String args[])
{

	AbstractClass abs=new AbstractClass();
	//in the above line it will throw an error u can not instantiate this class AbstractClass
	//is it correct when u write this complier will throw an error(this class is abstract so cannot be instantiated)
abs.m1();
	
}
public abstract void m1();
//this is a abstract method which is having declaration or method signature ONLY no implementation 

 public void m2()
 {};
 //this is partially implemented method ,or inappropriate implementation/dummy method

}


//abstract class is marked as a sign "A"
//so for abstract class instantitation is not allowed 