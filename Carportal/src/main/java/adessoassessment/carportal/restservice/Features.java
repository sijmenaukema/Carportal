package adessoassessment.carportal.restservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "features")
@EntityListeners(AuditingEntityListener.class)

class Features {

    @Id
    @Getter
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Column(name = "cost")
    @Getter
    @Setter
    private int cost;

    @Column(name = "models")
    @Getter
    @Setter
    private String models;
}

