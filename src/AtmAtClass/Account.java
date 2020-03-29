package AtmAtClass;

public class Account {

    private Person person;
    private CreditCard creditCard;
    private String password;

    public Account(String name, String surname, String password){
        this.person = new Person(name, surname);
        this.creditCard = new CreditCard();
        this.setPassword(password);
    }

    public Person getPerson(){
        return person;
    }

    public void setPassword(String password) {
        if (password.length() < 8) System.out.println("Password length cannot be less than 8");
        else this.password = password;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }


    public void cashIn(int amount){
        this.creditCard.setBalance(creditCard.getBalance() + amount);
    }

    public void cashOut(int amount){
        if (amount > this.creditCard.getBalance()) System.out.println("Not enough amount");
        else this.creditCard.setBalance(creditCard.getBalance() - amount);
    }

    public void transferMoney(Account account, int amount){
        if (amount > this.creditCard.getBalance()) System.out.println("Not enough amount");
        else{
            this.cashOut(amount);
            account.cashIn(amount);
        }
    }

    public void showBalance(){
        System.out.println("Your balance is: " + this.creditCard.getBalance());
    }

    public String getPassword() {
        return password;
    }
}