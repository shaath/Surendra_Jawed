package methods;

public class ReuseEg1 {

	public static void main(String[] args)
	{
//		parent p=new parent();
//		
//		p.m1();
//		p.m2();
		
		parent p=new Child();
		
		p.m1();
		p.m2();
		
		Child c=new Child();
		
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
	}

}
