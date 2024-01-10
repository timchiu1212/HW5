
public class p32 {

	public static void main(String[] args)throws  Carp32Exception{
		// TODO Auto-generated method stub
		
		Carp32 car1;
		car1=new Carp32();
		
		car1.setCar(1234, -10.0);
		
		car1.show();
	}

}


class Carp32Exception extends Exception
{
	
}
class Carp32{
	private int num;
	private double gas;
	
	public Carp32()
	{
		num=0;
		gas=0.0;
		System.out.println("已生產了汽車");
	}
	public void setCar(int n,double g)throws Carp32Exception
	{
		if(g<0)
		{
			Carp32Exception e=new Carp32Exception();
			throw e;
		}
		else {
		num=n;
		gas=g;
		System.out.println("將車號重設為"+num+"汽油量設為"+gas);	
		}
		
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+num);
	}
}