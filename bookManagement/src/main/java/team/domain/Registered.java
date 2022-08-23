package team.domain;

import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

@Data
@ToString
public class Registered extends AbstractEvent {

    private Long id;
    private String bookName;

    public Registered(BookManagement aggregate) {
        super(aggregate);
    }

    public Registered() {
        super();
    }
    // keep

}
