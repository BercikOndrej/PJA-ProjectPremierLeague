package api;

import jakarta.ejb.Local;
import java.util.List;
import models.Team;

/**
 * Interface for access to database via EJB.
 * It is intended for clients.
 * This interface provides Teams data.
 */
@Local
public interface ITeamApi {
    
    /**
     * 
     * @return List of teams order by it's name
     */
    public List<Team> getTeamsOrderByName();
    
    /**
     *
     * @return List of teams order by it's position at league
     */
    public List<Team> getTeamsOrderByLeaguePosition();
    
    /**
     * 
     * @return List of teams order by it's position at league in home matches
     */
    public List<Team> getTeamsOrderByLeaguePositionHome();
    
    /**
     * 
     * @return List of teams order by it's position at league in away matches
     */
    public List<Team> getTeamsOrderByLeaguePositionAway();
    
    /**
     * 
     * @param name name of team. It doesn't mean common name of team
     * @return Team instance of team with this name. Otherwise return null
     */
    public Team getTeamByName(String name);
    
    /**
     *
     * @param id
     *
     * @return Team with this id
     */
    public Team getTeamById(int id);
}
