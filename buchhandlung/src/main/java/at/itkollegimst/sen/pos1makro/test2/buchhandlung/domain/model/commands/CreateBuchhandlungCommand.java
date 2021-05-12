package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.commands;

import lombok.Value;

@Value
public class CreateBuchhandlungCommand {
    String buchname;
    String buchnummer;
    double preis;
    String bestellungsnummer;
    boolean abgeholt;
    boolean bezahlt;



    public CreateBuchhandlungCommand(String buchname, String buchnummer, double preis, String bestellungsnummer, boolean bezahlt, boolean abgeholt) {
        this.buchname = buchname;
        this.preis = preis;
        this.buchnummer = buchnummer;
        this.bestellungsnummer = bestellungsnummer;
        this.abgeholt = abgeholt;
        this.bezahlt = bezahlt;
    }


    public String getBuchname() {
        return buchname;
    }

    public double getPreis() {
        return preis;
    }

    public String getBuchnummer()
    {
        return buchnummer;
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
