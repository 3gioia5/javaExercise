public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String pName, int pAge) {
        name = pName;
        if (pAge < 0) {
            age = 12;
        } else {
            age = pAge;
        }
        cashAmount = 0;
    }

    public Person(String pName, int pAge, int pCashAccount) {
        name = pName;
        if (pAge < 0) {
            age = 12;
        } else {
            age = pAge;
        }
        if (pCashAccount < 0) {
            cashAmount = 0;
        } else {
            cashAmount = pCashAccount;
        }
    }


    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public int getAge() {
        return age;
    }

    public void setCashAmount(int newCashAmount) {
        if (newCashAmount >= 0) {
            cashAmount = newCashAmount;
        }
    }
    public int getCashAmount() {
        return cashAmount;
    }

    public void setAccount(BankAccount newAccount) {
        account = newAccount;
    }

    public BankAccount getAccount() {
        return account;
    }

    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
}