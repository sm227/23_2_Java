package week4;
class Account {
    String name;
    int balance = 0;
    public Account(String name, int balance) {
       this.name = name;
       this.balance = balance;
    }
    public Account(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int a) {
        balance += a;
        return a;
    }

    public int withdraw(int a) {
        if (balance < a) {
            System.out.println("잔액이 부족합니다.");
            return 0;
        }
        return a;
    }

}

public class AccountTest {
    public static void main(String[] args) {
        System.out.println("------홍길동 계좌------");
        Account a = new Account("홍길동", 10000);
        System.out.printf("%d 원이 입금되었습니다.\n", a.deposit(20000));
        System.out.printf("%s님의 잔액은 %d입니다\n", a.getName(),a.getBalance());
        System.out.printf("%d원이 출금되었습니다.\n" , a.withdraw(40000));
        System.out.printf("%d원이 출금되었습니다.\n" , a.withdraw(10000));
        System.out.printf("%s님의 잔액은 %d 입니다\n", a.getName(), a.getBalance());

        System.out.println("------사오정 계좌------");
        Account b = new Account("사오정");
        b.withdraw(1000);
        System.out.printf("%s님의 잔액은 %d입니다." , b.getName(), b.getBalance());
    }
}
