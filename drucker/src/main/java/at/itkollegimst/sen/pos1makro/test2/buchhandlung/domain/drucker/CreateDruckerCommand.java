package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.drucker;

import lombok.Value;

@Value
public class CreateDruckerCommand {

    boolean buchdruck;
    boolean buchGebunden;


    public CreateDruckerCommand(boolean buchdruck, boolean buchGebunden) {
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
