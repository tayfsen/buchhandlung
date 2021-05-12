package at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo.mapper;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.CreateBestellungCommand;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.CreateBestellungsDto;

public class BestellungCommandDtoMapper {
    public static CreateBestellungCommand toCreateBestellungCommand(CreateBestellungsDto createBestellungsDto) {
        return new CreateBestellungCommand(
                createBestellungsDto.getBestellnummer(),
                createBestellungsDto.getAbgeholt(),
                createBestellungsDto.getBezahlt()
        );
    }

}
