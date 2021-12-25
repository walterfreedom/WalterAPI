package jottero.rocks.walterapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class walterController {
    private long counter =0;
    private static  final  String template="%s!";
    @CrossOrigin
    @GetMapping("/walter")
    public waltermodel walter(){
    return new waltermodel(counter,"walter");
    }

    @GetMapping("/postwalter")
    public waltermodel postwalter(){

        return new waltermodel(counter,"walter");
    }
}
