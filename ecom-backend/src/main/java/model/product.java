package model;

import java.util.Locale.Category;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="PRODUCT")

public class product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="productid")
	private int productId;
	
	@Column(name="productname")
	private String productName;
	
	@Column(name="productdesc")
	private String productDesc;
	
	@Column(name="productprize")
	private double productPrize;
	
	@Column(name="productquantity")
	private int productQuantity;
	
	@Column(name="productlive")
	private boolean live;
	
	@Column(name="productimagename")
	private String imageName;
	
	@Column(name="productstock")
	private boolean stock=true;
	
	@Column(name="category")
	private Category category;
	
	public int getProductId() {
		return productId;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(int productId, String productName, String productDesc, double productPrize, int productQuantity,
			boolean live, String imageName, boolean stock, Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrize = productPrize;
		this.productQuantity = productQuantity;
		this.live = live;
		this.imageName = imageName;
		this.stock = stock;
		this.category = category;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public double getProductPrize() {
		return productPrize;
	}
	public void setProductPrize(double productPrize) {
		this.productPrize = productPrize;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public boolean isStock() {
		return stock;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
}
