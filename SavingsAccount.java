public class SavingsAccount extends BankAccount{
  // Instance Variables
  private double interestRate;
  
  // Constructor
  SavingsAccount(String firstName, String lastName, String middleInitial, double balance, double interestRate){
    setFirstName(firstName);
    setMiddleInitial(middleInitial);
    setLastName(lastName);
    deposit(balance);
    this.interestRate = interestRate;

    if(getBalance() >= 300){
      deposit(50);
    }
  }
  
  // Getters / Setters
  // Getter only for interestRate.
  public double getInterestRate(){
    return interestRate;
  }
  
  // Other Methods
  public String toString(){
    String s = "Name: ";
    s += getName();
    s += ", Balance: $";
    s += getBalance();
    s += ", Interest Rate: " + interestRate;
    return s;
  } // Override toString() to include interestRate at the end.
  public void printReport(){
    System.out.println("numberOfTransactions:\t" + getNumOfTransactions());
    System.out.println("objectCount:\t" + getObjectCount());
    System.out.println("interestRate:\t" + interestRate;
  } // Override printReport() to print interestRate at the end.
  public void accrueMonthlyInterest(){
    double balance = getBalance();
    balance += (1/12)*interestRate;
  } // Apply and add 1/12th of your interestRate to balance.
}
