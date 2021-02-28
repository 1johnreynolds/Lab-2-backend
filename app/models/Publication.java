package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Publication extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Constraints.Required
    public String Title;

    public static Find<Long, Publication> find = new Find<Long, Publication>(){};

    public static Publication findByName(String name) {
        return Publication.find
                .where()
                .eq("Title", name)
                .findUnique();
    }
}
