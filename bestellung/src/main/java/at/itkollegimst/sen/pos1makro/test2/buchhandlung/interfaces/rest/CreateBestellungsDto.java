package at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest;

import lombok.Value;

@Value
public class CreateBestellungsDto {
    String bestellnummer;
    boolean abgeholt;
    boolean bezahlt;

    public CreateBestellungsDto(String bestellnummer, boolean abgeholt, boolean bezahlt) {
        this.bestellnummer = bestellnummer;
        this.abgeholt = abgeholt;
        this.bezahlt = bezahlt;
    }


    public String getBestellnummer() {
        return bestellnummer;
    }

    public boolean getAbgeholt() {
        return abgeholt;
    }

    public boolean getBezahlt() {
        return bezahlt;
    }


}
