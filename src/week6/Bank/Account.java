package week6.Bank;

class Account {
    private String name;
    private long balance;

    public Account() {
    }

    public Account(String name) {
        this.name = name;
        System.out.println(name + "님의 계좌가 만들어 졌습니다.");
    }

    public void deposit(long amount) {
        balance = balance + amount;
        System.out.println(name + "님의 계좌에" + amount + "원이 입금되었습니다");
    }

    public void withdraw(long amount) {
        if (balance < amount) System.out.println(name + "님의 계좌에 잔고가 부족합니다.");
        else {
            balance = balance - amount;
            System.out.println(name + "님의 계좌에서" + amount + "원이 출금되었습니다.");
        }
    }

    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
