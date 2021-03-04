package service_classes;

import java.io.IOException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

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

}
