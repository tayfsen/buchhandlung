package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.bestellung;

import lombok.Value;

@Value
public class CreateBestellungCommand {
    String bestellnummer;
    boolean abgeholt;
    boolean bezahlt;


    public CreateBestellungCommand(String bestellnummer, boolean abgeholt, boolean bezahlt) {
        this.bestellnummer = bestellnummer;
        this.abgeholt = abgeholt;
        this.bezahlt = bezahlt;
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
