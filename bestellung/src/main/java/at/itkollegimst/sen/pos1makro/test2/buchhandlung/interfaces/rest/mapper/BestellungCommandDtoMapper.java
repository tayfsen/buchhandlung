package at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.mapper;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.CreateBestellungsDto;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.CreateBestellungCommand;

public class BestellungCommandDtoMapper {
    public static CreateBestellungCommand toCreateBestellungCommand(CreateBestellungsDto createBestellungsDto){
        return new CreateBestellungCommand(
                createBestellungsDto.getBestellnummer(),
                createBestellungsDto.getAbgeholt(),
                createBestellungsDto.getBezahlt()

    );
}
}
