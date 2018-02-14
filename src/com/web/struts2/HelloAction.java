package com.web.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello(){
        return "success";
    }
    
    
    @Override
    public void validate() {
        if (name != null && name.equalsIgnoreCase("hugo")){
            addActionMessage("Welcome to my site" + name);
        }else{
            addActionError("You are not recognized");
        }
    }

}
