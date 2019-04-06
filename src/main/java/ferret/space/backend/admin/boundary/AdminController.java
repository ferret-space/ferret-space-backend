package ferret.space.backend.admin.boundary;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path = "/admin")
public class AdminController {
    
    @RequestMapping("/hello")
    public String index() {
        return "Greetings from admin area!";
    }
    
}
