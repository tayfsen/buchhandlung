package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.buchhandlung;

import lombok.Value;

@Value
public class CreateBuchhandlungCommand {
    String buchname;
    double preis;


    public CreateBuchhandlungCommand(String buchname, double preis) {
        this.buchname = buchname;
        this.preis = preis;
    }


    public String getBuchname() {
        return buchname;
    }

    public double getPreis() {
        return preis;
    }


}
