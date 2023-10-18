package week7;

public class Book {
    private String name;
    private int price;
    private int amount;

    public Book(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void sellBook(int i) {
        if (amount < i) {
            System.out.println(name + "책은 매진되었음");
        }
        else {
            amount = amount - i ;
            System.out.println(name + " 책" + i + "권이 팔렸음");
        }
    }

    public void stockBook(int i ) {
        amount  = amount + i;
    }

    // Getter

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
