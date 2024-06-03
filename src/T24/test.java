package T24;

abstract class Printer {
    private String ID;

    public Printer(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void print(Object msg) {

    }
}

class InkgetPrinter extends Printer {
    public InkgetPrinter(String ID) {
        super(ID);
    }

    public void print(Object msg) {
        System.out.println("잉크젯 방식 프린트 시작");
        System.out.println(msg.toString());
        System.out.println("잉크젯 방식 프린트 종료");
    }
}

class LaserPrinter extends Printer {
    public LaserPrinter(String ID) {
        super(ID);
    }

    public void print(Object msg) {
        System.out.println("레이저 방식 프린트 시작");
        System.out.println(msg.toString());
        System.out.println("레이저 방식 프린트 종료");
    }
}

class DotPrinter extends Printer {
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
        printers[0] = new InkgetPrinter("101");
        printers[1] = new DotPrinter("102");
        printers[2] = new LaserPrinter("103");

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

