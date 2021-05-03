package at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.bestellung.Bestellung;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BestellungRepo extends JpaRepository<Bestellung, Long> {
Optional<Bestellung> getBestellungByBestellungsnummer(String bestellnummer);
}
