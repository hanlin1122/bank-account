public class BankAccount{
  // Class Variables
  // numberOfTransactions counts the number of deposits and withdrawls of all accounts.
  private static int numberOfTransactions = 0;
  // objectCount counts the number of BankAccount objects that have been created.
  private static int objectCount = 0;
  private static int nextAccountNumber = 10000000;

  // Instance Variables
  // Do not store the period after middle initial.
  private String firstName, lastName, middleInitial;
  private double balance;
  private int accountNumber;

  // Constructors
  // Set accountNumber to nextAccountNumber, then increment nextAccountNumber.
  public BankAccount(){
    accountNumber = nextAccountNumber;
    nextAccountNumber++;
    objectCount++;

    if(objectCount % 10 == 0){
      balance += 10;
    }
  }
  public BankAccount(String firstName, String lastName, String middleInitial, double balance){
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleInitial = middleInitial;
    this.balance = balance;
    
    accountNumber = nextAccountNumber;
    nextAccountNumber++;
    objectCount++;

    if(objectCount % 10 == 0){
      balance += 10;
    }
  }

  // name can be either format "Bob Ramakrishnan" or "Bob D. Builder"
  public BankAccount(String name, double balance){
    firstName = name.substring(0, name.indexOf(" "));
    if (name.indexOf(".") > 0) {
      middleInitial = name.substring(name.indexOf(" ")+1, name.indexOf("."));
      lastName = name.substring(name.indexOf(".")+1);
    }
    else {
      lastName = name.substring(name.indexOf(" ")+1);
    }
    this.balance = balance;
    
    accountNumber = nextAccountNumber;
    nextAccountNumber++;
    objectCount++;

    if(objectCount % 10 == 0){
      balance += 10;
    }
  }

  // Getters / Setters
  // Getters for all class variables.
  // getName() should return "Bob Ramakrishnan" or "Bob D. Builder"
  // Getter for balance.
  public static int getNumOfTransactions(){
    return numberOfTransactions;
  }
  public static int getObjectCount(){
    return objectCount;
  }
  public static int getNextAccNum(){
    return nextAccountNumber;
  }
  public String getName() {
    if(middleInitial.equals("")){
      return firstName + " " + lastName;
    }
    return firstName + " " + middleInitial + ". " + lastName;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccNum(){
    return accountNumber;
  }
  public void setFirstName(String first){ 
    firstName = first;
  }
  public void setMiddleInitial(String middle){ 
    middleInitial = middle;
  }
  public void setLastName(String last){ 
    lastName = last;
  }

  // Deposit / Withdraw
  public void deposit(double depositAmount){
    balance += depositAmount;
  }
  // withdraw() should return the amount withdrawn. You cannot withdraw past zero.
  public double withdraw(double withdrawlAmount){
    balance -= withdrawlAmount;
    
    return balance;
  }
  
  // Other Methods
  public String toString(){
    String s = "Name: ";
    s += getName();
    s += ", Balance: $";
    s += getBalance();
    return s;
  } // Ex, "Name: Bob Ramakrishnan, Balance: $12.03
  // printReport() should just list all class & instance variables. Use \t for spacing. Ex:
  // numberOfTransactions: 	3
  // objectCount: 		5
  // ....
  public void printReport(){
    System.out.println("numberOfTransactions:\t" + getNumOfTransactions());
    System.out.println("objectCount:\t" + getObjectCount());
  }
}
