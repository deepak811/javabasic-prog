package constructor;

public class Constructor1 {
	
	String name;
	int rollno; 
	
	
	//now whil creatin constructor I have to keep in mind 2 things the name of the onstructor should be matched with the class name
	//2)how many instance variable are there in this class answer is 2  & for how many variable I am performing initialization i.e 2 name & roll no…whathever instance variable are thr in class u can provide them as a argument in constructor

	
	
	
	public  Constructor1(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
	}
	public static void main (String[] args)
	{
		Constructor1 c1=new Constructor1("deepak",01);
		System.out.println(c1.name);
		System.out.println(c1.rollno);
	}

}


//So whenever we create a class object for every class object a Separate copy of instance variable will be created(for s  two instance variable will be created name & roll no and jvm used to provide them  default value for string default value is null for int it’s 0 SO NAME WILL BE NULL and roll no will be assigned as 0  as default value by JVM and these many activity will be performed by new keyword}
//Till up to this constructor is not in picture now contructor will come into picture student(“deep”,”01) this par is calling constructor this part says we are calling student constructor and passing values “”deep & 01 to it
