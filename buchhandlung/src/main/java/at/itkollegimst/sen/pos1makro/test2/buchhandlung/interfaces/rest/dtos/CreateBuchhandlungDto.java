package at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.dtos;

import lombok.Value;

@Value
public class CreateBuchhandlungDto {
    String buchnummer;
    String buchname;
    double preis;
    String bestellungsnummer;
    boolean abgeholt;
    boolean bezahlt;


    public CreateBuchhandlungDto(String buchnummer, String buchname, double preis, String bestellungsnummer, boolean abgeholt, boolean bezahlt) {
        this.buchnummer = buchnummer;
        this.buchname = buchname;
        this.preis = preis;
        this.bestellungsnummer = bestellungsnummer;
        this.abgeholt = abgeholt;
        this.bezahlt = bezahlt;
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

    public String getBestellungsnummer() {
        return bestellungsnummer;
    }

    public boolean getAbgeholt() {
        return abgeholt;
    }

    public boolean getBezahlt() {
        return bezahlt;
    }
}
