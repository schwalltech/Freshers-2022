public class Driver extends Student
{
	public static void main(String[] args)
	{

		Student s1=new Student();
		s1.setName("Dugu");
		
		
		System.out.println("NAME"+s1.getName());
		
		s1.setAge(12);
		System.out.println("AGE"+s1.getAge());
		
		s1.setMobilenum(9087645321L);
		System.out.println("MOBILE NUM"+s1.getMobilenum());
		
		s1.setAddress("11/24,abcd");
		System.out.println("ADDRESS"+s1.getAddress());
		
		s1.setPincode(637013);
		System.out.println("PINCODE"+s1.getPincode());
		

	}
	

}