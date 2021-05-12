package at.itkollegimst.sen.pos1makro.test2.buchhandlung.application.commandservices;

import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.aggregate.Buchhandlung;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.domain.model.commands.CreateBuchhandlungCommand;
import at.itkollegimst.sen.pos1makro.test2.buchhandlung.infrastructure.repo.BuchhandlungRepo;
import org.springframework.stereotype.Service;

@Service
public class BuchhandlungCommandService {


    private BuchhandlungRepo buchhandlungRepo;


    public BuchhandlungCommandService(BuchhandlungRepo buchhandlungRepo)
    {
        this.buchhandlungRepo = buchhandlungRepo;
    }

    public String createBuchhandlung(CreateBuchhandlungCommand createBuchhandlungCommand)
    {
        Buchhandlung buchhandlung = new Buchhandlung(createBuchhandlungCommand);
        buchhandlungRepo.save(buchhandlung);
        return buchhandlung.getBuchnummer();
    }
}
