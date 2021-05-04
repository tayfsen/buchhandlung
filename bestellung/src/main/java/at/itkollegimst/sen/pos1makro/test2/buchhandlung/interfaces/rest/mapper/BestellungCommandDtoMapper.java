package at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.mapper;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.CreateBestellungsDto;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.CreateBestellung;

public class BestellungCommandDtoMapper {
    public static CreateBestellung toCreateBestellungCommand(CreateBestellungsDto createBestellungsDto){
        return new CreateBestellung(
                createBestellungsDto.getBestellnummer(),
                createBestellungsDto.getAbgeholt(),
                createBestellungsDto.getBezahlt()

    );
}
}
