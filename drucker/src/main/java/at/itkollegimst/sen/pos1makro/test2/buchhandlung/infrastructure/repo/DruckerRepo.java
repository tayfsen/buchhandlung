package at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.Drucker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DruckerRepo extends JpaRepository<Drucker, Long> {


}
