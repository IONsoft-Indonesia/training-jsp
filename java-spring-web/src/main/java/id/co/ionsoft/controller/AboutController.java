package id.co.ionsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Sukma Wardana
 * @version 1.0.0
 */
@Controller
@RequestMapping(value = "/ion")
public class AboutController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public ModelAndView about() {
	ModelAndView model = new ModelAndView("about");
	
        model.addObject("name", "P.T. IONsoft");
        model.addObject("address", "WISMA GKBI suites 1711");
        
        return model;
    }
}
