public class MyClass
{  
int a = 50;		
static int b = 100;		
 
public void method1()
{  
		int n = 90;
	a=30;
System.out.println(" m1 N is "+n);	
System.out.println("m1 a is "+a);	
System.out.println("m1 b is  "+b);		  
}  

public void method2()
{  
	b=200;
		//System.out.println(n);	
		System.out.println("m2 a is "+a);	
		System.out.println("m2 b is  "+b); 	  
}  
public static void main(String[] args)
{  
        MyClass ob = new MyClass ();
		MyClass ob2 = new MyClass ();	 
ob.method1 ();
ob2. method2 ();
ob.method1 ();	  
}  

}