

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("task")
class TaskController {
    @GetMapping("test")
    public Date test(){
        Date now = new Date(System.currentTimeMillis());
        System.out.print(now);
        return now;
    }
}