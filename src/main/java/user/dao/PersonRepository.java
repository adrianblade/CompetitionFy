package user.dao;

import user.model.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adrian on 12/02/2017.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

}