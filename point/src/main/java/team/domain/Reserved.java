package team.domain;

import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private Long bookId;
    private String bookName;
    private String userId;
    private Integer point;
    private String rentalStartTime;
    private String rentalEndTime;
    private String rentalStatus;
    // keep

}
