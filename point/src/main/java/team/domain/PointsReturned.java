package team.domain;

import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

@Data
@ToString
public class PointsReturned extends AbstractEvent {

    private Long id;
    private String pointQty;
    private String userId;

    public PointsReturned(Point aggregate) {
        super(aggregate);
    }

    public PointsReturned() {
        super();
    }
    // keep

}
