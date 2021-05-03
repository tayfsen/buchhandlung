package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.buchhandlung;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Buchhandlung {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String buchname;
    private double preis;

    public Buchhandlung() {
    }

    public Buchhandlung(CreateBuchhandlungCommand createBuchhandlungCommand) {
        this.buchname = createBuchhandlungCommand.getBuchname();
        this.preis = createBuchhandlungCommand.getPreis();
    }


    public String getBuchname() {
        return buchname;
    }

    public double getPreis() {
        return preis;
    }


}
