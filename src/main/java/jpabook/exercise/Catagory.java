package jpabook.exercise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Catagory {

    @Id@GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Long id;

    private String name;
}
