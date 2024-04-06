package T24.d240325;

import java.util.Collection;
import java.util.Scanner;

public class ProductUi {
    private ProductServiceImpl productServiceImpl;

    public ProductUi() {
        super();
    }

    public ProductServiceImpl getProductServiceImpl() {
        return productServiceImpl;
    }

    public void setProductServiceImpl(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }


    public void showMenu() {
        Scanner scan = new Scanner(System.in);
        String command = "";

        while (true) {
            System.out.println("��ɾ �Է��ϼ���: ");
            command = scan.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                break;
            } else if (command.toLowerCase().startsWith("new ")) {
                processNewCommand(command.split(" "));
                continue;
            } else if (command.equalsIgnoreCase("list")) {
                processListCommand();
                continue;
            } else if (command.toLowerCase().startsWith("search ")) {
                processSearchCommand(command.split(" "));
                continue;
            } else if (command.toLowerCase().startsWith("change ")) {
                processSearchCommand(command.split(" "));
                continue;
            } else if(command.toLowerCase().startsWith("delete ")) {
                processDeleteCommand(command.split(" "));
                continue;
            }

            printHelp();
        }
    }

    private void processDeleteCommand(String[] args) {
        if (args.length != 2) {
            printHelp();
            return;
        }

        // ����ڷκ����� ��ǰ ���� ��û��
        // productServiceImpl���� �����ش޶�� ���ӽ�Ŵ
        try {
            productServiceImpl.removeProduct(args[1]);
            System.out.println("��ǰ�� �����Ͽ����ϴ�.\n");
        }catch (ProductNotFoundException e) {
            System.out.println("��ǰ�� �������� �ʽ��ϴ�.");
        }
    }

    private void processChangeCommand(String[] args) {
        if (args.length != 3) {
            printHelp();
            return;
        }


        // ����ڷκ��� �Է¹��� ������ ��ǰ�� ���̵�� ������
        // ����ִ� ProductVo ��ü�� ������
        ProductVo product = new ProductVo(args[1], "", Integer.parseInt(args[2]));

        // ������� ��ǰ���� ���� ��û�� ó���ϱ� ����
        // productServiceImpl���� ���ݺ��� ó���� ���ӽ�Ŵ
        try {
            productServiceImpl.changeProductPrice(product);
            System.out.println("��ǰ ������ �����Ͽ����ϴ�.\n");
        } catch (ProductNotFoundException e) {
            System.out.println("��ǰ�� �������� �ʽ��ϴ�.");
        }
    }

    private void processSearchCommand(String[] args) {
        if (args.length != 2) {
            printHelp();
            return;
        }
        try {
            ProductVo product = productServiceImpl.getProduct(args[1]);
            System.out.println(product);
        } catch (ProductNotFoundException e) {
            System.out.println("��ǰ�� �������� �ʽ��ϴ�.\n");
        }
    }


    private void processListCommand() {
        Collection<ProductVo> products = productServiceImpl.getProducts();

        for (ProductVo product : products) {
            System.out.println(product);
        }
    }

    private void processNewCommand(String[] args) {
        // ����ڰ� new ����� �߸� �Է�������
        if (args.length != 4) {
            printHelp();
            return;
        }

        ProductVo product = new ProductVo(args[1], args[2], Integer.parseInt(args[3]));

        try {
            productServiceImpl.registProduct(product);
        } catch (AlreadyExistingProductException e) {
            System.out.println("�̹� �����ϴ� ��ǰ�Դϴ�. \n");
        }
    }

    private void printHelp() {
        System.out.println();
        System.out.println("�߸��� ����Դϴ�. �Ʒ� ��ɾ� ������ Ȯ���ϼ���.");
        System.out.println("��ɾ� ����");
        System.out.println("new ��ǰ���̵� ��ǰ�̸� ����");
        System.out.println("search ��ǰ���̵�");
        System.out.println("change ��ǰ���̵� �����Ұ���");
        System.out.println("delete ��ǰ���̵�");
        System.out.println("list");
        System.out.println();
    }


}
