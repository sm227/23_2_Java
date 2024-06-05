package T24;


// 프린터 구현 최상위 클래스
abstract class PrinterImpl {
    private String ID;

    public PrinterImpl(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    abstract public void print(Object msg);
}

class Printer {
    private String ID;

    private PrinterImpl printerImpl; // 실제 본 프린처를 구현한 클래스

    public Printer(PrinterImpl printerImpl) {
        this.printerImpl = printerImpl;
    }

    public String getID() {
        return printerImpl.getID();
    }

    public void print(Object msg) {
        printerImpl.print(msg);
    }
}

class InkgetPrinter extends PrinterImpl {
    public InkgetPrinter(String ID) {
        super(ID);
    }

    public void print(Object msg) {
        System.out.println("잉크젯 방식 프린트 시작");
        System.out.println(msg.toString());
        System.out.println("잉크젯 방식 프린트 종료");
    }
}

class LaserPrinter extends PrinterImpl {
    public LaserPrinter(String ID) {
        super(ID);
    }

    public void print(Object msg) {
        System.out.println("레이저 방식 프린트 시작");
        System.out.println(msg.toString());
        System.out.println("레이저 방식 프린트 종료");
    }
}


class DotPrinter extends PrinterImpl {
    public DotPrinter(String ID) {
        super(ID);
    }

    public void print(Object msg) {
        System.out.println("도트 방식 프린트 시작");
        System.out.println(msg.toString());
        System.out.println("도트 방식 프린트 종료");
    }
}


public class test {
    public static void main(String[] args) {
        Printer[] printers = new Printer[3];
        printers[0] = new Printer(new InkgetPrinter("101"));
        printers[1] = new Printer(new DotPrinter("102"));
        printers[2] = new Printer(new LaserPrinter("103"));

        for (int i = 0; i < printers.length; i++) {
            if (printers[i].getID().equals("101")) {
                System.out.println("101 프린터 고장\n");
                continue;
            }
            printWelcome(printers[i]);
        }

    }

    public static void printWelcome(Printer printer) {
        System.out.println("프린터 ID : " + printer.getID());
        printer.print("프린터 세계 초대합니다");
        System.out.println("");
    }
}

