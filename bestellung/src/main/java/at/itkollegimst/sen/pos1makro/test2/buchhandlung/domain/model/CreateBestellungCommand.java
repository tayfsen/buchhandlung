package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model;

import lombok.Value;

@Value
public class CreateBestellungCommand {
    String bestellungsnummer;
    boolean abgeholt;
    boolean bezahlt;


    public CreateBestellungCommand(String bestellungsnummer, boolean abgeholt, boolean bezahlt) {
        this.bestellungsnummer = bestellungsnummer;
        this.abgeholt = abgeholt;
        this.bezahlt = bezahlt;
    }


    public String getBestellnummer() {
        return bestellungsnummer;
    }

    public boolean getAbgeholt() {
        return abgeholt;
    }

    public boolean getBezahlt() {
        return bezahlt;
    }


}
