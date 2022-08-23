package team.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "bookManagements",
    path = "bookManagements"
)
public interface BookManagementRepository
    extends PagingAndSortingRepository<BookManagement, Long> {}
