
public class p52 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Companyp52 cmp=new Companyp52();
		Driverp52 drv1=new Driverp52(cmp);
		drv1.start();
		
		Driverp52 drv2=new Driverp52(cmp);
		drv2.start();
	}
}


class Companyp52
{
	private int sum=0;
	public void add(int a) {
		int tmp=sum;
		System.out.println("目前的合計金額是"+tmp+"元");
		System.out.println("賺到"+a+"元了。");
		tmp=tmp+a;
		System.out.println("合計金額是"+tmp+"元");
		sum=tmp;
	}
}
class Driverp52 extends Thread
{
	private Companyp52 comp;
	public Driverp52(Companyp52 c) {
		comp =c;
	}
	
	public void run() {
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}