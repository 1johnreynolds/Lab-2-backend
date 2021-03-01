package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Publication;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Content;


/**
 * @description: user reg/login
 * @author: Swati Bhat
 * @create: 2019-11-16 15:15
 */

public class PubController extends Controller {

    public Result authenticate() {

        System.out.println("In authenticate");
        JsonNode req = request().body().asJson();
        String title = req.get("Title").asText();

        try {
            Publication pub = Publication.findByName(title); // ( match where Title matches )
            if(pub!=null && title.equals(pub.Title)){
                return ok("true");
            }else{
                return ok("false");
            }
        }
        catch (Exception e) {
            return ok("false");
        }

    }

    public Result showID(){
        JsonNode req = request().body().asJson();
        String title = req.get("Title").asText();
        Publication pub = Publication.findByName(title);
        return ok(String.valueOf(pub.Id));
    }

}
