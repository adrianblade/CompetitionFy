package competitionFy.dao;

import competitionFy.model.Player;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adrian on 12/02/2017.
 */
public interface PlayerRepository extends CrudRepository<Player, Long> {

}