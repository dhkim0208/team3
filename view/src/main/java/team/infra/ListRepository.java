package team.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

@RepositoryRestResource(collectionResourceRel = "lists", path = "lists")
public interface ListRepository extends PagingAndSortingRepository<List, Long> {
    List<List> findByBookId(Long bookId);
    // keep

}
