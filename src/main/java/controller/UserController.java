package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import daointerfaceses.UserDao;
import pojo_classes.User;

@Controller
public class UserController {
	
	@Autowired
	UserDao ud;

	@RequestMapping("/creatUser")
	public ModelAndView insertUser(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView();
		
		String salutation=request.getParameter("salutation");
		String fname= request.getParameter("fname");
		String lname=request.getParameter("lname");
		String gender=request.getParameter("gender");
		String mob=request.getParameter("mob");
		String mail=request.getParameter("mail");
		String address=request.getParameter("address");
		String role=request.getParameter("role");
		String status=request.getParameter("status");
		
		User u=new User();
		u.setSalutation(salutation);
		u.setFname(fname);
		u.setLname(lname);
		u.setGeneder(gender);
		u.setMob(mob);
		u.setMail(mail);
		u.setAddress(address);
		u.setRole(role);
		u.setStatus(status);
	  
	int count=ud.createUser(u);
		
	if(count>0)
	{
		mv.addObject("msg","Insertion Successfully done...");
	}
	else 
	{
		mv.addObject("msg","Insertion faield plase try again...");
	}
		
		mv.setViewName("CreateUserAccount");
		return mv;
	
	
	}
}
