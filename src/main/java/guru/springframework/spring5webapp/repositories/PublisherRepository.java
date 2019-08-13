package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by at on 13/8/19.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
