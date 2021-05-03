package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.drucker;

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

    public Drucker(CreateDruckerCommand createDruckerCommand) {
        this.buchdruck = createDruckerCommand.buchdruck();
        this.buchGebunden = createDruckerCommand.buchGebunden();
    }


    public boolean buchdruck() {
        return buchdruck;
    }

    public boolean buchGebunden() {
        return buchGebunden;
    }


}
