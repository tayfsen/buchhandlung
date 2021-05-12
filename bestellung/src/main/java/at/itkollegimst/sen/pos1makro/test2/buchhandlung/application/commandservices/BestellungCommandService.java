package at.itkollegimst.sen.pos1makro.test2.buchhandlung.application.commandservices;


import at.itkollegimst.sen.pos1makro.test2.buchhandlung.application.queryservices.BestellungQueryService;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.Bestellung;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.CreateBestellungCommand;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo.BestellungRepo;
import org.springframework.stereotype.Service;

@Service
public class BestellungCommandService {
private BestellungRepo bestellungRepo;
private BestellungQueryService bestellungQueryService;


public BestellungCommandService(BestellungRepo bestellungRepo, BestellungQueryService bestellungQueryService)
{
    this.bestellungRepo = bestellungRepo;
    this.bestellungQueryService = bestellungQueryService;

}

public void createBestellung(CreateBestellungCommand createBestellungCommand)
{
    Bestellung bestellung = new Bestellung(createBestellungCommand);
    bestellungRepo.save(bestellung);


}



}
