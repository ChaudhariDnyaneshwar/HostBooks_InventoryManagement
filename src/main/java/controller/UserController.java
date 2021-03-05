package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import daointerfaceses.UserDao;
import pojo_classes.User;

@Controller
public class UserController {
	
	@Autowired
	UserDao user_d;
	
  //This method is use for cret user account
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
	  
	int count=user_d.createUser(u);
		
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
	
	//This method is use for the validation of user....
	
	@RequestMapping("/getValidate")
	public ModelAndView getValidate(@RequestParam("fname")String fname,@RequestParam("mail")String mail,HttpServletResponse response,HttpSession session)
	{
		ModelAndView mv=new ModelAndView();
		
		User u=new User();
		u.setFname(fname);
		u.setMail(mail);
         int count= user_d.getUserValidate(u);
		
         if(count>0)
         {
        	 session.setAttribute("uname",fname);
        	 mv.setViewName("UserHome");
         }
         else
         {
        	 mv.setViewName("Login");
        	 mv.addObject("msg","Plase enter valid user name and password...");
         }
		return mv;
	}
	
	
	//This method is use for user logout....
	  @RequestMapping("/userLogout")
	public ModelAndView userLogout(HttpSession session)
	{
		ModelAndView mv=new ModelAndView();
		session.removeAttribute("uname");
    	session.invalidate();
    	mv.setViewName("Login");
		return mv;
	}
	
	//This method is use for getting all user...
	@RequestMapping("/getAllUser")
	public ModelAndView getAllUser()
	{
		ModelAndView mv=new ModelAndView();
		List<User> list=user_d.getAllUser();
		mv.addObject("list",list);
		mv.setViewName("ShowAllUser");
		
		return mv;
	}
	
	//This method is use for the updating User Information...
	@RequestMapping("/updateUser")
	public ModelAndView getUpdateUser(HttpServletRequest request)
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
		
	int a=user_d.updateUser(u);
	
	  if(a>0)
	  {
		  mv.setViewName("redirect:/getAllUser");
	  }
	  else
	  {
		  mv.addObject("msg","Plase try again,something is wrong...");
	      mv.setViewName("UpdateUser");
	  }
		return mv;
	}
	
	//This method is use for delete user 
	@RequestMapping("/deleteUser")
	public ModelAndView deleteUser(@RequestParam("id")int id)
	{
		ModelAndView mv=new ModelAndView();
	     
		int a= user_d.deleteUser(id);
		
		
		mv.setViewName("redirect:/getAllUser");
		 return mv;
	}
	
	
}
