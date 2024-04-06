package T24.d240325;

import java.util.Collection;
import java.util.Date;

public class ProductServiceImpl {
    private ProductDaoImpl productDaoImpl;

    public ProductServiceImpl(ProductDaoImpl productDaoImpl) {
        super();
        this.productDaoImpl = productDaoImpl;
    }

    public ProductDaoImpl getProductDaoImpl() {
        return productDaoImpl;
    }

    public void setProductDaoImpl(ProductDaoImpl productDaoImpl) {
        this.productDaoImpl = productDaoImpl;
    }

    // ����ڰ� �Է��� ��ǰ�� ����ϴ� ����
    public void registProduct(ProductVo newProduct) {
        // ���� ����Ϸ��� �ϴ� newProduct�� ���̵�� ������ ���̵� ����
        // ��ǰ�� �ִ����� Ȯ��
        ProductVo productVo = productDaoImpl.selectById(newProduct.getId());

        if (productVo != null) {
            // newProduct�� ������ ���̵� ���� ��ǰ�� �̹� �����ϸ�
            throw new AlreadyExistingProductException();
        }

        // newProduct�� ������ ���̵� ���� ��ǰ�� �������� ������
        newProduct.setRegisterDate(new Date());
        // ProductDaoImpl���� ����϶�� ���ӽ�Ŵ
        productDaoImpl.insert(newProduct);
    }

    // ��ü ��ǰ�� ��ȭ�ϴ� ����
    public Collection<ProductVo> getProducts() {
        // ProductDaoImpl���� ��ü ��ȸ ����
        return productDaoImpl.selectAll();
    }

    public ProductVo getProduct(String id) {
        ProductVo product = productDaoImpl.selectById(id);
        if (product == null) {
            throw new ProductNotFoundException();
        }
        return product;
    }

    public void changeProductPrice(ProductVo updateProduct) {
        // �����ϰ��� �ϴ� updateProduct�� ���̵� �ش��ϴ� ��ü�� �̹� �����ϴ��� Ȯ��
        ProductVo product = productDaoImpl.selectById(updateProduct.getId());

        // �����ϰ��� �ϴ� updateProduct�� �������� ������
        // ProductNotFoundException�� ����
        if (product == null) {
            throw new ProductNotFoundException();
        }

        // �����ϰ��� �ϴ� updateProduct�� �����ϸ�
        updateProduct.setName(product.getName());
        updateProduct.setRegisterDate(product.getRegisterDate());

        // productDaoImpl���� �����϶�� ���ӽ�Ŵ
        productDaoImpl.update(updateProduct);


    }

    public void removeProduct(String id) {
        ProductVo product = productDaoImpl.selectById(id);

        // �����ϰ��� �ϴ� ���̵��� ��ǰ�� �������� ������
        if (product == null) {
            throw new ProductNotFoundException();
        }
        // �����ϰ��� �ϴ� ��ǰ�� �����ϸ�
        // productDaoImpl���� ������ ���ӽ�Ŵ
        productDaoImpl.delete(id);
    }
}
