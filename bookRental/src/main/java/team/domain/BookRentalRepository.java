package team.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "bookRentals",
    path = "bookRentals"
)
public interface BookRentalRepository
    extends PagingAndSortingRepository<BookRental, Long> {}
