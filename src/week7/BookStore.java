package week7;

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
