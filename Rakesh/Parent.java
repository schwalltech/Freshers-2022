
class children{
	void add()
	{
	System.out.println("hello");
   
    }
}
public class Parent extends children{
void sub()
{
    
	System.out.println("hello");;
}
public static void main(String[]args)
{
Parent c1 = new Parent();
c1.add();
c1.sub();
//System.out.println(c1.add());

//System.out.println(c1.sub());
}

}

