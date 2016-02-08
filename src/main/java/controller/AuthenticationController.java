package controller;

import entity.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by guilherme on 08/02/16.
 * Authentication Controller
 */
@Controller
@RequestMapping("/auth")
public class AuthenticationController {
    private static final Logger logger = Logger.getLogger(AuthenticationController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, @ModelAttribute("user") User user) {
        model.addAttribute(user);
        return "auth/login";
    }
}
