package at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.buchhandlung;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo.BuchhandlungRepo;
import org.springframework.stereotype.Service;

@Service
public class BuchhandlungCommandService {

    private final BuchhandlungRepo buchhandlungRepo;
    private final BuchhandlungQueryService buchhandlungQueryService;


    public BuchhandlungCommandService(BuchhandlungRepo buchhandlungRepo, BuchhandlungQueryService buchhandlungQueryService)
    {
        this.buchhandlungRepo = buchhandlungRepo;
        this.buchhandlungQueryService = buchhandlungQueryService;
    }

    public void createBestellung(CreateBuchhandlungCommand createBuchhandlungCommand)
    {
        Buchhandlung buchhandlung = new Buchhandlung(createBuchhandlungCommand);
        buchhandlungRepo.save(buchhandlung);

    }
}
