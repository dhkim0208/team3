package team.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import team.domain.*;

@Component
public class BookManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<BookManagement>> {

    @Override
    public EntityModel<BookManagement> process(
        EntityModel<BookManagement> model
    ) {
        return model;
    }
}
