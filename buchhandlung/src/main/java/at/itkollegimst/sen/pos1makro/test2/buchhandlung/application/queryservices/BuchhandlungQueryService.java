package at.itkollegimst.sen.pos1makro.test2.buchhandlung.application.queryservices;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.aggregate.Buchhandlung;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo.BuchhandlungRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuchhandlungQueryService {
    private final BuchhandlungRepo buchhandlungRepo;

    public BuchhandlungQueryService(BuchhandlungRepo buchhandlungRepo){
        this.buchhandlungRepo = buchhandlungRepo;
    }

    public Optional<Buchhandlung> getBuchhandlungByBuchnummer(String buchnummer){
        return buchhandlungRepo.getBuchhandlungByBuchnummer(buchnummer);
    }



}
