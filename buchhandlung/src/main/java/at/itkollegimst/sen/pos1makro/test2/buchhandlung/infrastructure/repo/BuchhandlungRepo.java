package at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.drucker.Buchhandlung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuchhandlungRepo extends JpaRepository<Buchhandlung, Long> {
}
