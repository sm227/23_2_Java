package week6.Bank;

class AccountManager {
    private int accountNum;
    private Account[] arr;

    public AccountManager() {
        arr = new Account[10];
    }

    public void newAccount(String name) {
        if (accountNum < 10) arr[accountNum++] = new Account(name);
        else System.out.println("계좌가 10개를 초과했습니다");
    }

    public void deposit(String name, long amount) {
        /*
        array를 검색하여 name과 일치하는
        account에서 amount만큼을 입금한다.
        입금되었음을 화면에 출력한다.
         */

        for (int i = 0; i < accountNum; i++) {
            if (arr[i].getName().equals(name)) {
                arr[i].deposit(amount);
                break;
            }
        }
    }

    public void withdraw(String name, long amount) {
        for (int i = 0; i < accountNum; i++) {
            if (arr[i].getName().equals(name)) {
                arr[i].withdraw(amount);
                break;
            }
        }
    }

    public String getBalance(String name) {
        String str = null;
        for (int i = 0; i < accountNum; i++) {
            if (arr[i].getName().equals(name)) {
                str = name + "님의 잔고는" + arr[i].getBalance() + "원 입니다.";
                break;
            }
        }
        return str;
    }


}
