package service_classes;

import java.io.IOException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sun.org.apache.bcel.internal.util.ByteSequence;

import daointerfaceses.ItemDao;
import pojo_classes.Items;

public class ItemDaoImplimentation implements ItemDao{

	JdbcTemplate jdbctemplate;
	
	
	public ItemDaoImplimentation(DataSource ds) {
		jdbctemplate=new JdbcTemplate(ds);
	}


	//this method is user for insert items data into database...
	public int addItem(Items i) {
	
		String query="insert into item values(?,?,?,?,?,?,?,?)";
		int count=0;
		  try {
			byte[] image=i.getItemImage().getBytes();

		  
			 count= jdbctemplate.update(query,new Object[]{null,i.getItemName(),image,i.getItemCategory(),i.getItemQuantity(),i.getItemUnit(),i.getItemUnitPrice(),i.getItemStatus()});
		  } catch (IOException e) {
			e.printStackTrace();
		}

		return count;
	}

   //This method is use for get all list of item from database..
	public List<Items> getAllItem() {
	
		String query="select * from item";
		RowMapper<Items> rowMapper=new RowMapper<Items>() {

			public Items mapRow(ResultSet req, int row) throws SQLException {
				Items i=new Items();
				i.setItemId(req.getInt("itemId"));
				i.setItemName(req.getString("item_name"));
				i.setItemCategory(req.getString("item_category"));
				i.setItemQuantity(req.getInt("iten_quantity"));
				i.setItemUnit(req.getInt("item_unit"));
				i.setItemUnitPrice(req.getInt("item_unitPrice"));
				i.setItemStatus(req.getString("item_status"));
				return i;
			}
		};
		
		List<Items> list=jdbctemplate.query(query,rowMapper);
		
		return list;
	}

	//this method is user for get item image from database ....
	public Blob getItemImage(int id) {
		
		  String query="select item_image from item where itemId=?";
			
			Blob photo=jdbctemplate.queryForObject(query, new Object[]{id},Blob.class);
			return photo;
	}

//This method is user for update item information....
	public int updateItem(Items i) {
		String query="update item set item_image=?,item_category=?,iten_quantity=?,item_unit=?,item_unitPrice=?,item_status=? where item_name=? ";
		int count=0;
		try {
			byte[] image=i.getItemImage().getBytes();
			
			count=jdbctemplate.update(query,new Object[]{image,i.getItemCategory(),i.getItemQuantity(),i.getItemUnit(),i.getItemUnitPrice(),i.getItemStatus(),i.getItemName()});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}

}
