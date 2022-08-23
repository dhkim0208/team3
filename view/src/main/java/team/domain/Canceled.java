package team.domain;

import java.util.Date;
import lombok.Data;
import team.infra.AbstractEvent;

@Data
public class Canceled extends AbstractEvent {

    private Long id;
    private Long bookId;
    private String bookName;
    private String userId;
    private Integer point;
    private String rentalStartTime;
    private String rentalEndTime;
    private String rentalStatus;
}
