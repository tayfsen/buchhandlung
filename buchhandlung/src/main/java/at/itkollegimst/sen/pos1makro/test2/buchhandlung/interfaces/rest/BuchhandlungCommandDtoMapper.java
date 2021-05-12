package at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.commands.CreateBuchhandlungCommand;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.dtos.CreateBuchhandlungDto;

public class BuchhandlungCommandDtoMapper {
    public static CreateBuchhandlungCommand toCreateBuchhandlungCommand(CreateBuchhandlungDto createBuchhandlungDto)
    {
return new CreateBuchhandlungCommand(
        createBuchhandlungDto.getBuchname(),
        createBuchhandlungDto.getBuchnummer(),
        createBuchhandlungDto.getPreis(),
        createBuchhandlungDto.getBestellungsnummer(),
        createBuchhandlungDto.getBezahlt(),
        createBuchhandlungDto.getAbgeholt()

        );
    }

}
