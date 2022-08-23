package team.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import team.domain.*;

@Component
public class BookRentalHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<BookRental>> {

    @Override
    public EntityModel<BookRental> process(EntityModel<BookRental> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/reserve")
                .withRel("reserve")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/cancel")
                .withRel("cancel")
        );

        return model;
    }
}
