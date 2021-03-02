package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Publication;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.mvc.Controller;
import play.mvc.Result;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;
import play.libs.ws.WSResponse;
import play.libs.ws.WSResponse;


import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

import java.util.List;


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
        System.out.println("receive title"+title);
        try {
            System.out.println("receive title"+title);

            Publication pub = Publication.findByTitle(title); // ( match where username and password both match )
            System.out.println(pub!=null);

            if(pub != null){
                ObjectNode res = Json.newObject();
                res.put("pid",pub.pid);
                res.put("Title", pub.Title);
                res.put("Metadata", pub.Metadata);
                System.out.println(res);
                return ok(res);
            }else{
                ObjectNode res = Json.newObject();
                System.out.println(res);
                return ok("null");
            }
        }
        catch (Exception e) {
            return ok("false");
        }

    }

    public Result findAll(){
        List<Publication> pubs = Publication.findAll();
        return ok(views.html.publist.render(pubs));
    }

}
