package UdaySir;

public class Solution {
//	Father obj=new Doughter();
//	Father obj1=new Son();
	static void Display(Father obj) {
		if(obj instanceof Son) {
			System.out.println("Down casted to Son");
			Son s=(Son)obj;
			System.out.println(s.x+" "+s.y);
		}
		else if(obj instanceof Doughter){
			System.out.println("Down casted to Doughter");
			Doughter d= (Doughter)obj;
			System.out.println(d.x+" "+d.z);
		}
	}
	public static void main(String[] args) {
		Display(new Doughter());
		System.out.println("==============================");
		Display(new Son());

	}
}
