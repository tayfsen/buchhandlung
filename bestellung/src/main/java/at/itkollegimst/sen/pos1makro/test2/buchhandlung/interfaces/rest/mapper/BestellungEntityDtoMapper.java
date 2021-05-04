package at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.mapper;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.CreateBestellungsDto;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.Bestellung;

public class BestellungEntityDtoMapper {
    public static CreateBestellungsDto toCreateBestellungDto(Bestellung bestellung){
        return new CreateBestellungsDto(
                bestellung.getBestellungsnummer(),
                bestellung.getAbgeholt(),
                bestellung.getBezahlt()
        );
    }
}
