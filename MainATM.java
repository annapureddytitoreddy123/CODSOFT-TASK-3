class ATM{
private BankAccount useraccount;
public ATM(BankAccount useraccount){
	this.useraccount=useraccount;
}
public boolean withdraw(double amount){
	if(amount>0&&useraccount.getbalance()>amount){
	useraccount.withdraw(amount);
	return true;
}
  return false;
}
public boolean deposit(double amount){
	if(amount>0){
		useraccount.deposit(amount);
		return true;
	}
	return false;
}
public double checkbalance(){
	return useraccount.getbalance();
}
}
class BankAccount{
	private double balance;
	public BankAccount(double initialbalance){
		this.balance=initialbalance;
	}
	public double getbalance(){
		return balance;
	}
	public void deposit(double amount){
		if(amount>0){
			balance+=amount;
		}
	}
	public void withdraw(double amount){
		if(amount>0&& balance>amount){
			balance-=amount;
		}
	}
}
public class MainATM{
	public static void main(String []args){
		BankAccount useraccount=new BankAccount(100000);
		ATM atm=new ATM(useraccount);
		if(atm.withdraw(20000)){
			System.out.println("withdrawal successfull.remaining balance is"+atm.checkbalance());
		}
		else{
		System.out.println("withdrawal failed.Insufficient balance");
		}
		atm.deposit(500);
		System.out.println("deposit successfull.new balance is"+atm.checkbalance());
		}
}
			
	
		
	
