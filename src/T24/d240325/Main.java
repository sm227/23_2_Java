package T24.d240325;

public class Main {

	public static void main(String[] args) {
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		ProductServiceImpl productServiceImpl = new ProductServiceImpl(productDaoImpl);
		ProductUi productUi = new ProductUi();
		productUi.setProductServiceImpl(productServiceImpl);
		
		productUi.showMenu();
		
	}

}
