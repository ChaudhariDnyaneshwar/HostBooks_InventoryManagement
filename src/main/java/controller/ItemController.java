package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import daointerfaceses.ItemDao;
import pojo_classes.Items;

@Controller
public class ItemController
{ 
	@Autowired
	ItemDao itemdao;
	
	//This method is use for add items...

	@RequestMapping( value = "/addItem", method = RequestMethod.POST)
	public ModelAndView addItem(HttpServletRequest request,@RequestParam("image")MultipartFile image)
	{
		ModelAndView mv=new ModelAndView();
		
		
		String itemName=request.getParameter("iname");
		String itemCategory=request.getParameter("icategory");
		int itemQuantity=Integer.parseInt(request.getParameter("iquantity"));
        int itemUnit=Integer.parseInt(request.getParameter("iunit"));
        int itemUnitPrice=Integer.parseInt(request.getParameter("iunitPrice"));
        String itemStatus=request.getParameter("itemStatus"); 

        Items i=new Items();
        i.setItemName(itemName);
        i.setItemImage(image); 
        i.setItemCategory(itemCategory);
        i.setItemQuantity(itemQuantity);
        i.setItemUnit(itemUnit);
        i.setItemUnitPrice(itemUnitPrice);
        i.setItemStatus(itemStatus);
        
        int count=itemdao.addItem(i);
        
        if(count>0)
        {
        	mv.addObject("msg","insertion is successfully done...");
        }
        else
        {
        	mv.addObject("msg","insertion is faield ,plase try again....");
        }
        
        mv.setViewName("AddItem");
        
        return mv;
	}
	
}
