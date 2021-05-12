package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model;

import lombok.Value;

@Value
public class CreateDrucker {

    boolean buchdruck;
    boolean buchGebunden;


    public CreateDrucker(boolean buchdruck, boolean buchGebunden) {
        this.buchdruck = buchdruck;
        this.buchGebunden = buchGebunden;
    }


    public boolean buchdruck() {
        return buchdruck;
    }

    public boolean buchGebunden() {
        return buchGebunden;
    }
}
