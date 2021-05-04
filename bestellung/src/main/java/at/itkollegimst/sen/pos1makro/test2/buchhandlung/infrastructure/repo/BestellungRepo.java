package at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.Bestellung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BestellungRepo extends JpaRepository<Bestellung, Long> {
Bestellung getBestellungByBestellungsnummer(String bestellungsnummer);
}
