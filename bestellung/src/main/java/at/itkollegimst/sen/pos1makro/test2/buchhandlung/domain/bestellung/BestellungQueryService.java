package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.bestellung;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo.BestellungRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BestellungQueryService {

    private final BestellungRepo bestellungRepo;

    public BestellungQueryService(BestellungRepo bestellungRepo){
        this.bestellungRepo = bestellungRepo;
    }

    public Optional<Bestellung> getBestellungByBestellungsnummer(String bestellungsnummer){
        return bestellungRepo.getBestellungByBestellungsnummer(bestellungsnummer);
    }

    public boolean bestellungExisting(String bestellungsnummer){
        return bestellungRepo.getBestellungByBestellungsnummer(bestellungsnummer).isPresent();
    }

}
