package jottero.rocks.walterapi;

import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class walterController {
    @Autowired
    private postinterface postinterface1;
    private long counter =0;
    private List<String> posts;
    private static final  String template="%s!";


    @CrossOrigin
    @GetMapping("/walter")
    public waltermodel walter(){
        postinterface1.save(new waltermodel("walter","firetruck"));
         waltermodel a = postinterface1.findByWalter("walter");
        return a;
    }
    @CrossOrigin
    @RequestMapping(value = "getlastposts", method = RequestMethod.GET)
    @ResponseBody
    public List<waltermodel> getlastposts(@RequestParam String id) {
        List<waltermodel> returnlist=new ArrayList<waltermodel>();
        if(true){
            for (var item:postinterface1.findAll()
                 ) {
                returnlist.add(new waltermodel(item.walter, item.text));
            }
            return returnlist;
        }
        else{
            return returnlist;
        }

    }

    public waltermodel savepost(@RequestParam String id,String text, String Title) {
        postinterface1.save(new waltermodel(Title,text));
        return new waltermodel(posts.get(Integer.parseInt(id)),"empty");
    }
}
