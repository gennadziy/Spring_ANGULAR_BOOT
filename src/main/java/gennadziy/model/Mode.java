package gennadziy.model;

/*
@Author Gennadziy GITHUB/gennadziy
Class name: Mode
Date: 2020-04-03
Time: 12:48
*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class Mode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Date date;

}
