package Abstract.com;

public class Demo22 {
	
	public static void main(String[] args) {
		int num=0;
		for (int i=2;i>=1;i--) {
			for(int j=0;j<i;j++) {
				num=num+i;
			}
		}
		System.out.println(num);
	}

}
