package team.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import team.BookManagementApplication;
import team.domain.Registered;

@Entity
@Table(name = "BookManagement_table")
@Data
public class BookManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String bookName;

    @PostPersist
    public void onPostPersist() {
        Registered registered = new Registered(this);
        registered.publishAfterCommit();
    }

    public static BookManagementRepository repository() {
        BookManagementRepository bookManagementRepository = BookManagementApplication.applicationContext.getBean(
            BookManagementRepository.class
        );
        return bookManagementRepository;
    }
}
