package week7;

class Book {
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

class BookManager {
    public Book[] arr;

    public BookManager() {
        arr = new Book[5];
    }

    int bookNum = 0;

    public void newBook(String name, int price, int amount) {
        if (bookNum < 4) {
            arr[bookNum++] = new Book(name, price, amount);
        }
        else System.out.println("책 수납공간 없음");
    }

    public void newBook(Book book) {
        arr[bookNum++] = book;
    }

    public void sellBook(String name, int amount) {
        for (int i = 0; i < bookNum; i++) {
            if (arr[i].getName().equals(name)) {
                arr[i].sellBook(amount);
            }

        }
    }

    public void stockBook(String name, int amount) {
        for (int i = 0; i < bookNum; i++) {
            if (arr[i].getName().equals(name)) {
                arr[i].stockBook(amount);
            }

        }
    }

    public void showInfo(String name) {
        for (int i = 0; i < bookNum; i++) {
            if (arr[i].getName().equals(name)) {
                System.out.println("[INFO]" + "제목 : " + arr[i].getName() + " , 가격 : "  + arr[i].getPrice() + ", 수량 : " + arr[i].getAmount());
            }
        }
    }

    public void showAllInfo() {
        System.out.println("------재고 현황-----");
        for (int i =0; i<arr.length; i++) {
            System.out.println("[INFO]" + "제목 : " + arr[i].getName() + " , 가격 : "  + arr[i].getPrice() + ", 수량 : " + arr[i].getAmount());
        }
    }
}
public class BookStore {
    public static void main(String[] args) {
        BookManager m = new BookManager();
        m.newBook("폭풍의 언덕", 10000, 1);
        m.newBook("나무", 20000, 2);
        m.newBook("죄와벌", 30000, 3);
        m.newBook("연금술사", 40000, 4);

        Book book = new Book("네가지사랑", 5000 , 5);
        m.newBook(book);

        //구매
        m.sellBook("폭풍의 언덕", 1);
        m.showInfo("폭풍의 언덕");

        //등록
        m.newBook("파페포포 메모리즈", 10000, 1);
        m.sellBook("폭풍의 언덕" ,1);

        //재고증가
        m.stockBook("폭풍의 언덕", 10);

        // 모든 정보
        m.showAllInfo();
    }
}
