package pojo_classes;

import org.springframework.web.multipart.MultipartFile;

public class Items {
	
	private int itemId;
	private String itemName;
	private MultipartFile itemImage;
	private String itemCategory;
	private int itemQuantity;
	private int itemUnit;
	private int itemUnitPrice;
	private String itemStatus;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public MultipartFile getItemImage() {
		return itemImage;
	}
	public void setItemImage(MultipartFile itemImage) {
		this.itemImage = itemImage;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public int getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(int itemUnit) {
		this.itemUnit = itemUnit;
	}
	public int getItemUnitPrice() {
		return itemUnitPrice;
	}
	public void setItemUnitPrice(int itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	

}
