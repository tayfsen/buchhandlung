package at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo.mapper;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.Bestellung;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.CreateBestellungsDto;

public class BestellungEntityDtoMapper {
    public static CreateBestellungsDto toCreateBestellungdto(Bestellung bestellung) {
        return new CreateBestellungsDto(
                bestellung.getBestellungsnummer(),
                bestellung.getAbgeholt(),
                bestellung.getBezahlt()
        );
    }


}
