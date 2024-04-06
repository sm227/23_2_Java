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

    // 사용자가 입력한 제품을 등록하는 서비스
    public void registProduct(ProductVo newProduct) {
        // 지금 등록하려고 하는 newProduct의 아이디와 동일한 아이디를 가진
        // 제품이 있는지를 확인
        ProductVo productVo = productDaoImpl.selectById(newProduct.getId());

        if (productVo != null) {
            // newProduct와 동일한 아이디를 가진 제품이 이미 존재하면
            throw new AlreadyExistingProductException();
        }

        // newProduct와 동일한 아이디를 가진 제품이 존재하지 않으면
        newProduct.setRegisterDate(new Date());
        // ProductDaoImpl에게 등록하라고 위임시킴
        productDaoImpl.insert(newProduct);
    }

    // 전체 제품을 조화하는 서비스
    public Collection<ProductVo> getProducts() {
        // ProductDaoImpl에게 전체 조회 위임
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
        // 수정하고자 하는 updateProduct의 아이디에 해당하는 객체가 이미 존재하는지 확인
        ProductVo product = productDaoImpl.selectById(updateProduct.getId());

        // 수정하고자 하는 updateProduct가 존재하지 않으면
        // ProductNotFoundException을 던짐
        if (product == null) {
            throw new ProductNotFoundException();
        }

        // 수정하고자 하는 updateProduct가 존재하면
        updateProduct.setName(product.getName());
        updateProduct.setRegisterDate(product.getRegisterDate());

        // productDaoImpl에게 수정하라고 위임시킴
        productDaoImpl.update(updateProduct);


    }

    public void removeProduct(String id) {
        ProductVo product = productDaoImpl.selectById(id);

        // 삭제하고자 하는 아이디의 제품이 존재하지 않으면
        if (product == null) {
            throw new ProductNotFoundException();
        }
        // 삭제하고자 하는 제품이 존재하면
        // productDaoImpl에게 삭제를 위임시킴
        productDaoImpl.delete(id);
    }
}
