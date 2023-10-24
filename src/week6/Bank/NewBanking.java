package week6.Bank;

/**
 * (4) 은행예제
 */
public class NewBanking {
    public static void main(String[] args) {
        AccountManager am = new AccountManager();
        am.newAccount("손오공");
        am.newAccount("저팔계");
        am.newAccount("사오정");

        am.deposit("손오공", 1000);
        System.out.println(am.getBalance("손오공"));
        am.withdraw("손오공", 2000);
        am.withdraw("손오공", 1000);
        System.out.println(am.getBalance("손오공"));
        am.deposit("저팔계", 3000);
        System.out.println(am.getBalance("저팔계"));
        am.withdraw("저팔계", 2000);
        am.withdraw("저팔계", 1000);
        System.out.println(am.getBalance("저팔계"));
    }
}
