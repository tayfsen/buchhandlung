package at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.mapper.BestellungCommandDtoMapper;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.interfaces.rest.mapper.BestellungEntityDtoMapper;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.application.commandservices.BestellungCommandService;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.application.queryservices.BestellungQueryService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/bestellungen")
public class BestellungController {

    private BestellungQueryService bestellungQueryService;
    private BestellungCommandService bestellungCommandService;

    public BestellungController(BestellungCommandService bestellungCommandService, BestellungQueryService bestellungQueryService) {
        this.bestellungQueryService = bestellungQueryService;
        this.bestellungCommandService = bestellungCommandService;
    }

    @PostMapping
    public ResponseEntity<?> createBestellung(@RequestBody CreateBestellungsDto createBestellungsDto) {
        bestellungCommandService.createBestellung(BestellungCommandDtoMapper.toCreateBestellungCommand(createBestellungsDto));

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{bestellnummer}")
                .buildAndExpand(createBestellungsDto.getBestellnummer())
                .toUri();
        return ResponseEntity.created(location).build();

    }

    @GetMapping("/{bestellungsnummer}")
    public ResponseEntity<CreateBestellungsDto> getBestellungsnummer(@PathVariable String bestellungsnummer) {
        return new ResponseEntity<>(
                BestellungEntityDtoMapper.toCreateBestellungDto(bestellungQueryService.getBestellungByBestellungsnummer(bestellungsnummer)), HttpStatus.OK);

    }


}
