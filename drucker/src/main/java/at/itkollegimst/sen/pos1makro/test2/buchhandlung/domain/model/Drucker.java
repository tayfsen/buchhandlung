package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Drucker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)

    private boolean buchdruck;
    private boolean buchGebunden;


    public Drucker() {
    }

    public Drucker(CreateDrucker createDrucker) {
        this.buchdruck = createDrucker.buchdruck();
        this.buchGebunden = createDrucker.buchGebunden();
    }


    public boolean buchdruck() {
        return buchdruck;
    }

    public boolean buchGebunden() {
        return buchGebunden;
    }


}
