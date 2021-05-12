package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.aggregate;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.commands.CreateBuchhandlungCommand;
import lombok.Data;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity
@Data
public class Buchhandlung extends AbstractAggregateRoot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String buchnummer;
    private String buchname;
    private double preis;
    private String bestellungsnummer;
    private boolean abgeholt;
    private boolean bezahlt;

    public Buchhandlung() {
    }

    public Buchhandlung(CreateBuchhandlungCommand createBuchhandlungCommand) {
        this.buchnummer = createBuchhandlungCommand.getBuchnummer();
        this.buchname = createBuchhandlungCommand.getBuchname();
        this.preis = createBuchhandlungCommand.getPreis();
        this.bestellungsnummer = createBuchhandlungCommand.getBestellungsnummer();
        this.abgeholt = createBuchhandlungCommand.getAbgeholt();
        this.bezahlt = createBuchhandlungCommand.getBezahlt();
    }


    public String getBuchnummer() {
        return buchnummer;
    }

    public String getBuchname() {
        return buchname;
    }

    public double getPreis() {
        return preis;
    }

    public Long getId() {
        return id;
    }

    public String getBestellungsnummer() {
        return bestellungsnummer;
    }

    public boolean isAbgeholt() {
        return abgeholt;
    }

    public boolean isBezahlt() {
        return bezahlt;
    }
}
