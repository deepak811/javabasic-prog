
public class AbstractExm1 {

	public abstract int getnumber();
	//***So if a class has atleast one abstract method then compulsory that class shoud be declared as 
	//--abstract class to restrict him from class object creation
	//now this is normal class but having a abstract method now the error is because
	//1)either chnage this method to non abtractmethod 
//2)or make this class as abstract which will restrict this class from object creation bcause what will be the sense of using 
	//this method inside execution block(PSVM)bcoz this method has nothing to run
public static void main(String args[])
{
	AbstractExm1 adc=new AbstractExm1();
	adc.getnumber();
}

}
//Then  calling g.getnumber() objet creation of such classes should not be allowed so to prevent
//this object creation we will declare this class as abstract
