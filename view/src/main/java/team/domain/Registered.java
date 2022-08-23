package team.domain;

import java.util.Date;
import lombok.Data;
import team.infra.AbstractEvent;

@Data
public class Registered extends AbstractEvent {

    private Long id;
    private String bookName;
}
