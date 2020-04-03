package gennadziy.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Data
@Table
public class Autoss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @Size(min = 4, max = 6)
    private String name;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private String color;

    private Timestamp timestamp= new Timestamp ( System.currentTimeMillis () );



}
