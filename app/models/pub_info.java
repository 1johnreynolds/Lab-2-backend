package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;


@Entity
public class pub_info extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    public Long pid;

    @Column(columnDefinition = "VARCHAR (250)NOT NULL DEFAULT ''")
    public String Title;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String mdate;

    @Column(columnDefinition = "VARCHAR(100)NOT NULL DEFAULT ''")
    public String author;

    @Column(columnDefinition = "VARCHAR(150)NOT NULL DEFAULT ''")
    public String author_list;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String article_key;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String editors;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL DEFAULT ''")
    public String pages;

    @Column(columnDefinition = "VARCHAR(200) NOT NULL DEFAULT ''")
    public String ee;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String pub_url;

    @Column(columnDefinition = "INT DEFAULT 0000")
    public int pub_year;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String journal;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String book_title;

    @Column(columnDefinition = "INT NOT NULL DEFAULT 0")
    public int volume;

    @Column(columnDefinition = "INT NOT NULL DEFAULT 0")
    public int pub_number;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String publisher;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL DEFAULT ''")
    public String isbn;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String series;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String cross_ref;


    public static Find<Long, pub_info> find = new Find<Long, pub_info>(){};

    public static List<pub_info> findByTitle(String title) {
        try{
            return pub_info.find
                    .where()
                    .eq("Title", title)
                    .findList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }


    public static List<pub_info> findAll() {
        return find.all();
    }

}
