package at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest;


import at.itkollegimst.sen.pos1makro.test2.buchhandlung.application.commandservices.BuchhandlungCommandService;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.application.queryservices.BuchhandlungQueryService;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.dtos.CreateBuchhandlungDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/buchhandlung")
public class BuchhandlungController {
private BuchhandlungCommandService buchhandlungCommandService;
private BuchhandlungQueryService buchhandlungQueryService;


public BuchhandlungController(BuchhandlungCommandService buchhandlungCommandService, BuchhandlungQueryService buchhandlungQueryService){
this.buchhandlungCommandService = buchhandlungCommandService;
this.buchhandlungQueryService = buchhandlungQueryService;
}


@PostMapping
public ResponseEntity<?> createBuchhandlung(@RequestBody CreateBuchhandlungDto createBuchhandlungDto)
{
buchhandlungCommandService.createBuchhandlung(BuchhandlungCommandDtoMapper.toCreateBuchhandlungCommand(createBuchhandlungDto));

URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{bestellungsnummer}")
        .buildAndExpand(createBuchhandlungDto.getBestellungsnummer())
        .toUri();

return ResponseEntity.created(location).build();

}



}
