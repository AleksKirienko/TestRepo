package ru.sibsutis.barter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BarterController {

    @RequestMapping(value = "/authorization", method = RequestMethod.GET)
    private String authorization() {
        return "authorization";
    }

    @RequestMapping(value = "/r", method = RequestMethod.GET)
    private String registration() {
        return null;//todo
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    private String mainPage() {
        return null;//todo
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    private String profile() {
        return null;//todo
    }

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    private String addNewProduct() {
        return null;//todo
    }




}
