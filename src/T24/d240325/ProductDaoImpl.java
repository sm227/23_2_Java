package T24.d240325;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class ProductDaoImpl {

	private Map<String, ProductVo> products = new HashMap<String, ProductVo>();
	
	public ProductDaoImpl() {
		super();
	}
	
	public ProductVo selectById(String id) {
		return products.get(id);
	}
	
	public void insert(ProductVo newProductVo) {
		products.put(newProductVo.getId(), newProductVo);
	}
	
	public void update(ProductVo updateProductVo) {
		products.put(updateProductVo.getId(), updateProductVo);
	}
	
	public void delete(String id) {
		products.remove(id);
	}
	
	Collection<ProductVo> selectAll() {
		return products.values();
	}
	
	
	
}
