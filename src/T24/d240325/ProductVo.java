package T24.d240325;

import java.util.Date;

public class ProductVo {
   private String id;      // ��ǰ id
   private String name;   // ��ǰ �̸�
   private int price;      // ��ǰ ����
   private Date registerDate;      // ��ǰ ��� ��¥.
   
   public ProductVo() {
      super();
   }

   public ProductVo(String name, int price) {
      super();
      this.name = name;
      this.price = price;
   }

   public ProductVo(String id, String name, int price, Date registerDate) {
      super();
      this.id = id;
      this.name = name;
      this.price = price;
      this.registerDate = registerDate;
   }

   
   
   
   public ProductVo(String id, String name, int price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}

public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public Date getRegisterDate() {
      return registerDate;
   }

   public void setRegisterDate(Date registerDate) {
      this.registerDate = registerDate;
   }

   
   
   public String toString() {
      return "��ǰ ���� [id=" + id + ", name=" + name + ", price=" + price + ", registerDate=" + registerDate + "]";
   }   
   
}