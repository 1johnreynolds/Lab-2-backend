package controllers;

import com.avaje.ebean.SqlRow;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Conference;
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

    public Result partOneQueryOne() {

        System.out.println("In PartOneQueryOne");
        JsonNode req = request().body().asJson();
        String title = req.get("title").asText();
        System.out.println("receive title: "+title);
        try {
            List<SqlRow> pub = pub_info.findByTitle_1_1(title); // ( match where username and password both match )
            System.out.println(pub);
            System.out.println(pub.size());
            System.out.println(pub.get(0));
            //System.out.println(pub.book_title);
            //ObjectNode reslist= Json.newObject();
            List<ObjectNode> reslist= new ArrayList<>();

                if (pub.size()!= 0) {
                    int i=0;
                    for (SqlRow pubs : pub) {
                        i++;
                        ObjectNode res = Json.newObject();
                        res.put("pid", pubs.get("pid").toString());
                        res.put("title", (String)pubs.get("title"));
                        res.put("mdate", (String)pubs.get("mdate"));
                        res.put("author",(String) pubs.get("author"));
                        res.put("author_list", pubs.get("author_list").toString());
                        res.put("article_key",(String) pubs.get("article_key"));
                        res.put("editors",(String)pubs.get("editors"));
                        res.put("pages", (String)pubs.get("pages"));
                        res.put("ee", (String)pubs.get("ee"));
                        res.put("pub_url", (String)pubs.get("pub_url"));
                        res.put("pub_year", pubs.get("pub_year").toString());
                        res.put("journal", (String)pubs.get("journal"));
                        res.put("book_title",(String) pubs.get("book_title"));
                        res.put("volume", pubs.get("volume").toString());
                        res.put("pub_number",pubs.get("pub_number").toString());
                        res.put("publisher", (String)pubs.get("publisher"));
                        res.put("isbn", (String)pubs.get("isbn"));
                        res.put("series", (String)pubs.get("series"));
                        res.put("cross_ref",(String) pubs.get("cross_ref"));
//                        res.put("title", pubs.title);
//                        res.put("mdate", pubs.mdate);
//                        res.put("author", pubs.author);
//                        res.put("author_list", pubs.author_list);
//                        res.put("article_key", pubs.article_key);
//                        res.put("editor", pubs.editors);
//                        res.put("pages", pubs.pages);
//                        res.put("ee", pubs.ee);
//                        res.put("pub_url", pubs.pub_url);
//                        res.put("journal", pubs.journal);
//                        res.put("book_title", pubs.book_title);
//                        res.put("volume", pubs.volume);
//                        res.put("pub_number", pubs.pub_number);
//                        res.put("publisher", pubs.publisher);
//                        res.put("isbn", pubs.isbn);
//                        res.put("series", pubs.series);
//                        res.put("cross_ref", pubs.cross_ref);
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

    public Result partOneQueryTwo() {

        System.out.println("In PartOneQueryTwo");
        JsonNode req = request().body().asJson();
        String title = req.get("journal").asText();
        int volume = req.get("volume").asInt();
        int number = req.get("pub_number").asInt();
        System.out.println("receive title"+title);
        System.out.println("receive volume"+volume);
        System.out.println("receive number"+number);
        try {
            List<SqlRow> pub = pub_info.findByJournal_1_2(title,volume,number); // ( match where username and password both match )
            System.out.println(pub.size());
            System.out.println(pub.size()!=0);

            //System.out.println(pub.book_title);
            //ObjectNode reslist= Json.newObject();
            List<ObjectNode> reslist= new ArrayList<>();

            if (pub.size()!=0) {
                int i=0;
                for (SqlRow pubs : pub) {
                    i++;
                    ObjectNode res = Json.newObject();
                    res.put("title", (String)pubs.get("title"));
                    res.put("mdate", (String)pubs.get("mdate"));
                    res.put("author_list", pubs.get("author_list").toString());
                    res.put("article_key",(String) pubs.get("article_key"));
                    res.put("editors",(String)pubs.get("editors"));
                    res.put("pages", (String)pubs.get("pages"));
                    res.put("ee", (String)pubs.get("ee"));
                    res.put("pub_url", (String)pubs.get("pub_url"));
                    res.put("journal", (String)pubs.get("journal"));
                    res.put("pub_year", pubs.get("pub_year").toString());
                    res.put("volume", pubs.get("volume").toString());
                    res.put("pub_number",pubs.get("pub_number").toString());
                    System.out.println(res);
//                      reslist.put(Integer.toString(i),res.toString());
                    reslist.add(res);
                }
                System.out.println(reslist);
                return ok(reslist.toString());
            } else {
                System.out.println("null res");
                return ok("null");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return ok("false");
        }
    }

    public Result partOneQueryThree() {

        System.out.println("In PartOneQueryThree");
        JsonNode req = request().body().asJson();
        String author = req.get("author").asText();
        System.out.println(req);
        int pub_year = req.get("pub_year").asInt();
        System.out.println("receive reasearcher name = "+author);
        System.out.println("pub_year = "+pub_year);
        try {
            List<SqlRow> pub = pub_info.findByTitle_1_3(author,pub_year); // ( match where username and password both match )
            System.out.println(pub.get(0)!= null);
            //System.out.println(pub.book_title);
            //ObjectNode reslist= Json.newObject();
            List<ObjectNode> reslist= new ArrayList<>();

            if (pub.get(0)!= null) {
                int i=0;
                for (SqlRow pubs : pub) {
                    i++;
                    ObjectNode res = Json.newObject();
                    res.put("title", (String)pubs.get("title"));
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

    public Result partOneQueryFour() {

        System.out.println("In PartOneQueryFour");
        try {
            List<SqlRow> pub = pub_info.findByAuthor_1_4(); // ( match where username and password both match )
            System.out.println(pub.get(0)!= null);
            //System.out.println(pub.book_title);
            //ObjectNode reslist= Json.newObject();
            List<ObjectNode> reslist= new ArrayList<>();

            if (pub.get(0)!= null) {
                int i=0;
                for (SqlRow pubs : pub) {
                    i++;
                    ObjectNode res = Json.newObject();
                    res.put("author",(String) pubs.get("author"));

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

    public Result partOneQueryFive() {
        System.out.println("In PartOneQueryFive");
        try {
            JsonNode req = request().body().asJson();
            String confName = req.get("name").asText();
            int year = req.get("year").asInt();
            System.out.println("Receive Conf Name: " + confName);
            System.out.println("Receive Conf Year: " + year);

            List<SqlRow> pub = Conference.findByReference_1_5(confName,year); // ( match where username and password both match )
            System.out.println(pub.size());
            //System.out.println(pub.book_title);
            //ObjectNode reslist= Json.newObject();
            List<ObjectNode> reslist= new ArrayList<>();

            if (pub.get(0)!= null) {
                System.out.println("get value");
                int i=0;
                for (SqlRow pubs: pub) {
                    i++;
                    ObjectNode res = Json.newObject();

                    res.put("name",(String) pubs.get("name"));
                    res.put("year",(int) pubs.get("year"));
                    res.put("location",(String) pubs.get("location"));
                    res.put("x",(Double) pubs.get("x"));
                    res.put("y",(Double) pubs.get("y"));

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
        System.out.println(pubs);
        return ok(views.html.publist.render(pubs));
    }

}
