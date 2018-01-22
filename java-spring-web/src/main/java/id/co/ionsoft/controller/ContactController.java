package id.co.ionsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import id.co.ionsoft.entity.Contact;

@Controller
@RequestMapping(value = "/ion")
public class ContactController {

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(Model model) {
	
	model.addAttribute("contact", new Contact());
	
	return "contact";
    }
    
    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public ModelAndView	handleSubmit(@ModelAttribute("contact") Contact contact) {
	
	ModelAndView model = new ModelAndView("admin/message");
	
	model.addObject("name", contact.getName());
	model.addObject("message", contact.getMessage());
	
	return model;
    }
}
