package at.itkollegimst.sen.pos1makro.test2.buchhandlung.application.queryservices;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.Bestellung;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo.BestellungRepo;
import org.springframework.stereotype.Service;


@Service
public class BestellungQueryService{

    private final BestellungRepo bestellungRepo;

    public BestellungQueryService(BestellungRepo bestellungRepo){
        this.bestellungRepo = bestellungRepo;
    }

    public Bestellung getBestellungByBestellungsnummer(String bestellungsnummer){
        return bestellungRepo.getBestellungByBestellungsnummer(bestellungsnummer);
    }



}
