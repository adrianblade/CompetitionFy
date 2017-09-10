package competitionFy.controller;

import competitionFy.dao.GameRepository;
import competitionFy.dao.UserRepository;
import competitionFy.model.Game;
import competitionFy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/clasification")
public class ClasificationController {
	@Autowired
	private GameRepository gameRepository;

	@GetMapping(path="/{teamId}")
	public @ResponseBody Iterable<Game> getAllGamesByTeamId(@PathVariable("teamId") int id) {
		return gameRepository.findByLocalTeamOrVisitorTeam(id, id);
	}
}
