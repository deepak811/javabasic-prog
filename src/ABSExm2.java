
public  class ABSExm2 {

	public void m3()
	{};
	
	public void m4()
	{};
	
	
	//this error is saying either add body or declare it  as abstract method
	
	
	//******is it possible to declare a class as abtract which is not having any abtract method..yes we can
	//Reson may be u think think the implementation is not proper----this shows that the class is implemented
	//but this is incomplete or we can say dummy implementation
public static void main(String args[])
{
	ABSExm2 dfg=new ABSExm2();
	dfg.m3();
	dfg.m4();
	//nothing will happen even it is syntactically correct so we need that object creation should be avoided so will declare it as abstractclass
}
}
//now will create object of this class & call the methods but we will not get any output then what is the use of creationg object
//of this class..now if u don’t want to allow to create object of this class even though it doesn’t have any abstract method u can assign /declare 
//it as abstract

//as of now class object creation is allowed but if u declare thsi class as "public  abstract class ABSExm2 "then it will throw an error 
//on objct creation saying it can not beinstatiated"ABSExm2 dfg=new ABSExm2();"in this line


//My class doesn’t contain have any abstract method can I still declare it as abstract class 
//Yes possible…even if a class doesn’t have any abstract method but of u feel the implantation is not proper/inappropriate  then we can define that class as abstractclass
//here the implementation of this meths  is not complete or we can say its dummy implementation/empty method 