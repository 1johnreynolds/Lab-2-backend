package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.data.validation.Constraints;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.concurrent.CompletionStage;




@Entity
public class Publication extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long pid;

    @Constraints.Required
    public String Title;

    @Constraints.Required
    public String Metadata;

    public static Find<Long, Publication> find = new Find<Long, Publication>(){};

    public static Publication findByTitle(String title) {
        try{
            return Publication.find
                    .where()
                    .eq("Title", title)
                    .findUnique();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }


    public static List<Publication> findAll() {
        return find.all();
    }

}
