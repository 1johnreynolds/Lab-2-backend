package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.pub_info;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;


import javax.json.JsonObject;
import java.util.ArrayList;
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
            System.out.println("receive title" + title);
            List<pub_info> pub = pub_info.findByTitle(title); // ( match where username and password both match )
            System.out.println(pub != null);
            //System.out.println(pub.book_title);
            //ObjectNode reslist= Json.newObject();
            List<ObjectNode> reslist= new ArrayList<>();

                if (pub != null) {
                    int i=0;
                    for (pub_info pubs : pub) {
                        i++;
                        ObjectNode res = Json.newObject();
                        res.put("pid", pubs.pid);
                        res.put("title", pubs.Title);
                        res.put("mdate", pubs.mdate);
                        res.put("author", pubs.author);
                        res.put("author_list", pubs.author_list);
                        res.put("article_key", pubs.article_key);
                        res.put("editor", pubs.editors);
                        res.put("pages", pubs.pages);
                        res.put("ee", pubs.ee);
                        res.put("pub_url", pubs.pub_url);
                        res.put("journal", pubs.journal);
                        res.put("book_title", pubs.book_title);
                        res.put("volume", pubs.volume);
                        res.put("pub_number", pubs.pub_number);
                        res.put("publisher", pubs.publisher);
                        res.put("isbn", pubs.isbn);
                        res.put("series", pubs.series);
                        res.put("cross_ref", pubs.cross_ref);
                        System.out.println(res);
//                      reslist.put(Integer.toString(i),res.toString());
                        reslist.add(res);
                    }
                    System.out.println(reslist);
                    return ok(reslist.toString());
                } else {
                    System.out.println(reslist.toString());
                    return ok("null");
                }
        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result findAll(){
        List<pub_info> pubs = pub_info.findAll();
        return ok(views.html.publist.render(pubs));
    }

}
