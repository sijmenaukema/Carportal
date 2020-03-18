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

public class Features {

    @Id
    @Getter
    @Setter
    private int id;

    @Column
    @Getter
    @Setter
    private String name;

    @Column
    @Getter
    @Setter
    private int cost;

    @Column
    @Getter
    @Setter
    private String models;
}

