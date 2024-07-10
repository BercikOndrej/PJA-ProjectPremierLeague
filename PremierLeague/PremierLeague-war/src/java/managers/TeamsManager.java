package managers;

import api.ITeamApi;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.List;
import models.Team;

/**
 *
 * Class representing manager used for Teams data manipulation
 */
@ApplicationScoped
@Named("teamsManager")
public class TeamsManager {
    
    @EJB
    private ITeamApi iTeamApi;

    public TeamsManager() {
    }
    
    /**
     *
     * @return List of teams order by it's name
     */
    public List<Team> getTeamsOrderByName() {
        return iTeamApi.getTeamsOrderByName();
    }

    /**
     *
     * @return List of teams order by it's position at league
     */
    public List<Team> getTeamsOrderByLeaguePosition() {
        return iTeamApi.getTeamsOrderByLeaguePosition();
    }

    /**
     *
     * @return List of teams order by it's position at league in home matches
     */
    public List<Team> getTeamsOrderByLeaguePositionHome() {
        return iTeamApi.getTeamsOrderByLeaguePositionHome();
    }

    /**
     *
     * @return List of teams order by it's position at league in away matches
     */
    public List<Team> getTeamsOrderByLeaguePositionAway() {
        return iTeamApi.getTeamsOrderByLeaguePositionAway();
    }

    /**
     *
     * @param name name of team. It doesn't mean common name of team
     *
     * @return Team instance of team with this name. Otherwise return null
     */
    public Team getTeamByName(String name) {
        return iTeamApi.getTeamByName(name);
    }

    /**
     *
     * @param id
     *
     * @return Team with this id
     */
    public Team getTeamById(int id) {
        return iTeamApi.getTeamById(id);
    }
}
