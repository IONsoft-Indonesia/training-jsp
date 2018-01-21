package id.co.ionsoft.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Sukma Wardana
 * @version 1.0.0
 */
@Controller
@RequestMapping("ion")
public class AboutController {

    @RequestMapping("about")
    public String about(Model model) {
        model.addAttribute("name", "P.T. IONsoft");
        model.addAttribute("address", "WISMA GKBI suites 1711");
        
        return "contact";
    }
}
