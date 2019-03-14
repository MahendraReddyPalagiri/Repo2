package com.durgasoft.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.durgasoft.model.Register;

@Controller
public class MyController {
     @RequestMapping(value="registrationform",method=RequestMethod.GET)
	public String ShowRegistrationForm(Model model) {
    model.addAttribute("register", new Register());
	return "RegistrationForm";
    }
@RequestMapping(value="register",method=RequestMethod.POST)
public ModelAndView registration(@Valid Register register,BindingResult result) {
  if (result.hasErrors()) {
	  return new ModelAndView("RegistrationForm", "register", register);	
}else {
	return new ModelAndView("RegistrationDetails", "register", register);	
}
  
}

}
