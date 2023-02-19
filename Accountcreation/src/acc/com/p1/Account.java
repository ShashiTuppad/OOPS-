package acc.com.p1;

public class Account {
	//entity class
	private int accnum;
	private String custname;
	private double accbal;
	public Account(int accnum, String custname, double accbal) {
		this.accnum = accnum;
		this.custname = custname;
		this.accbal = accbal;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	
	

}
