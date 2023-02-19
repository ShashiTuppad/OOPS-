package UdaySir;

public class Test {

	public static void main(String[] args) {
		Father f=new Father();
		Son s=new Son();
		Doughter d= new Doughter();
		System.out.println(f instanceof Father);
		System.out.println(s instanceof Son);
		System.out.println(d instanceof Doughter);
		System.out.println(s instanceof Father);
		System.out.println(d instanceof Father);
		System.out.println(f instanceof Son);

	}

}
