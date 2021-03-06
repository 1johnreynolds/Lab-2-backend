package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlRow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Conference extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    public Long cid;

    @Column(columnDefinition = "VARCHAR (250)NOT NULL DEFAULT ''")
    public String name;

    @Column(columnDefinition = "VARCHAR (250)NOT NULL DEFAULT ''")
    public String location;

    @Column(columnDefinition = "INT DEFAULT 0000")
    public int year;

    @Column(columnDefinition = "DOUBLE DEFAULT 0000")
    public double x;

    @Column(columnDefinition = "DOUBLE DEFAULT 0000")
    public double y;

    public static List<SqlRow> findByReference_1_5(String name, int year) {
        try{

            List<SqlRow> query1_5 = Ebean.createSqlQuery("Select name, location, year, x, y" +
                    " from conference where " +
                    "name='" + pub_info.replacePunctuation(name) + "' \n" +
                    "and  year=" + year + "")
                    .findList();
            return query1_5;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
