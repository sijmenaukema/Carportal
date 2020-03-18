package adessoassessment.carportal.restservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "features")

public class Car {

    @Id
    private long id;


}

