package exercisejuly;

public class Encapsulation {
private int accountno;
long phoneno;
int balance;
//setter is write
private void setAccountNo(int accountno)
{
	this.accountno = accountno;
}
//getter is read
public int getAccountNo()
{
	return accountno;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation en = new Encapsulation();
		System.out.println(en.getAccountNo());
		en.setAccountNo(33434);
		System.out.println(en.getAccountNo());
	}

}
