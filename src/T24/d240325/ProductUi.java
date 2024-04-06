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
            System.out.println("명령어를 입력하세요: ");
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

        // 사용자로부터의 제품 삭제 요청을
        // productServiceImpl에게 삭제해달라고 위임시킴
        try {
            productServiceImpl.removeProduct(args[1]);
            System.out.println("제품을 삭제하였습니다.\n");
        }catch (ProductNotFoundException e) {
            System.out.println("제품이 존재하지 않습니다.");
        }
    }

    private void processChangeCommand(String[] args) {
        if (args.length != 3) {
            printHelp();
            return;
        }


        // 사용자로부터 입력받은 변경할 제품의 아이디와 가격을
        // 담고있는 ProductVo 객체를 생성함
        ProductVo product = new ProductVo(args[1], "", Integer.parseInt(args[2]));

        // 사용자의 제품가격 변경 요청을 처리하기 위해
        // productServiceImpl에게 가격변경 처리를 위임시킴
        try {
            productServiceImpl.changeProductPrice(product);
            System.out.println("제품 가격을 변경하였습니다.\n");
        } catch (ProductNotFoundException e) {
            System.out.println("제품이 존재하지 않습니다.");
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
            System.out.println("제품이 존재하지 않습니다.\n");
        }
    }


    private void processListCommand() {
        Collection<ProductVo> products = productServiceImpl.getProducts();

        for (ProductVo product : products) {
            System.out.println(product);
        }
    }

    private void processNewCommand(String[] args) {
        // 사용자가 new 명령을 잘못 입력했으면
        if (args.length != 4) {
            printHelp();
            return;
        }

        ProductVo product = new ProductVo(args[1], args[2], Integer.parseInt(args[3]));

        try {
            productServiceImpl.registProduct(product);
        } catch (AlreadyExistingProductException e) {
            System.out.println("이미 존재하는 제품입니다. \n");
        }
    }

    private void printHelp() {
        System.out.println();
        System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요.");
        System.out.println("명령어 사용법");
        System.out.println("new 제품아이디 제품이름 가격");
        System.out.println("search 제품아이디");
        System.out.println("change 제품아이디 변경할가격");
        System.out.println("delete 제품아이디");
        System.out.println("list");
        System.out.println();
    }


}
