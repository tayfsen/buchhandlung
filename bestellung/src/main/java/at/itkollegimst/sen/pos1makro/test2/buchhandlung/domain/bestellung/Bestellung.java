package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.bestellung;


import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Bestellung  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String bestellnummer;
    private boolean abgeholt;
    private boolean bezahlt;

    public Bestellung() {
    }

    public Bestellung(CreateBestellungCommand createBestellungCommand) {
        this.bestellnummer = createBestellungCommand.getBestellnumer();
        this.abgeholt = createBestellungCommand.getAbgeholt();
        this.bezahlt = createBestellungCommand.getBezahlt();
    }


    public Long getId() {
        return id;
    }

    public String getBestellnumer() {
        return bestellnummer;
    }

    public boolean getAbgeholt() {
        return abgeholt;
    }

    public boolean getBezahlt() {
        return bezahlt;
    }


}
