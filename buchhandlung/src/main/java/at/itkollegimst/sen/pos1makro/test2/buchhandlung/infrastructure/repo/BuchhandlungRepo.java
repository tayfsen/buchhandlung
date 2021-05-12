package at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.aggregate.Buchhandlung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BuchhandlungRepo extends JpaRepository<Buchhandlung, Long> {
    Optional<Buchhandlung> getBuchhandlungByBuchnummer(String buchnummer);
}
