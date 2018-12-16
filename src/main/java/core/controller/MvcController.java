package core.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MvcController {

//    @RequestMapping(value = "/test",
//            method = RequestMethod.GET,
// produces = MediaType.TEXT_HTML_VALUE)
    @GetMapping(value = "/test")
    public String test() {
        return "test.html";
    }

}