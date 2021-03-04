package daointerfaceses;

import java.sql.Blob;
import java.util.List;

import pojo_classes.Items;

public interface ItemDao {

	public int addItem(Items i);
	
	public List<Items> getAllItem();
	public Blob getItemImage(int id);
}
