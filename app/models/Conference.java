package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Conference extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    public Long cid;

    @Column(columnDefinition = "VARCHAR (250)NOT NULL DEFAULT ''")
    public String name;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public double x;

    @Column(columnDefinition = "VARCHAR(100)NOT NULL DEFAULT ''")
    public double y;

}
