package week7;

public class BookManager {
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
