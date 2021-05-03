package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.buchhandlung;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo.BuchhandlungRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuchhandlungQueryService {
    private final BuchhandlungRepo buchhandlungRepo;

    public BuchhandlungQueryService(BuchhandlungRepo buchhandlungRepo){
        this.buchhandlungRepo = buchhandlungRepo;
    }

    public Buchhandlung getBestellungByBuchname(String buchname){
        return buchhandlungRepo.getBuchhandlungByBuchhandlung(buchname);
    }

    public Buchhandlung bestellungExisting(String buchname){
        return buchhandlungRepo.getBuchhandlungByBuchhandlung(buchname);
    }

}
