package ferret.space.backend.track.boundary;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/track")
public class TrackController {

    @RequestMapping("/hello")
    public String index() {
        return "Greetings from track area!";
    }
}
