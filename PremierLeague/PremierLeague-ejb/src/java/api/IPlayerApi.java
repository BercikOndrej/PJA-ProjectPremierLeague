package api;

import jakarta.ejb.Local;
import java.util.List;
import models.Player;

/**
 * Interface for access to database via EJB.
 * It is intended for clients.
 * This interface provides Players data.
 */
@Local
public interface IPlayerApi {

    /**
     * 
     * @return List of all players saved in the database
     */
    public List<Player> getPlayers();
    
    /**
     * 
     * @return List of best scorers over all teams. Players with 0 goals are not included
     */
    public List<Player> getTopScorers();
    
    /**
     * 
     * @return List of players who played the most minutes for a season
     */
    public List<Player> getPlayersWithTheMostMinutesPlayed();
    
    /**
     * 
     * @return List of the oldest players in the league
     */
    public List<Player> getTheOldestPlayers();
    
    /**
     * 
     * @return List of players who has the most assist. Players with 0 assist are not included.
     */
    public List<Player> getPlayersWithTheMostAssists();
       
    /**
     * 
     * @return Only goalkeepers who has the most clean sheets for a season
     */
    public List<Player> getGoalkeepersWithTheMostCleanSheets();
    
    /**
     * 
     * @param teamName name of team which it's players played for (common name)
     * @return List of players who played for this team
     */
    public List<Player> getPlayersOfTeam(String teamName);
    
    /**
     * 
     * @param teamName name of team which it's players played for (common name)
     * @return List of goalkeepers who played for this team
     */
    public List<Player> getGoalkeepersOfTheTeam(String teamName);
    
    /**
     * 
     * @param teamName name of team which it's players played for (common name)
     * @return List of defenders who played for this team
     */
    public List<Player> getDefendersOfTheTeam(String teamName);
    
    /**
     * 
     * @param teamName name of team which it's players played for (common name)
     * @return List of midfielders who played for this team
     */
    public List<Player> getMidfieldersOfTheTeam(String teamName);
    
    /**
     * 
     * @param teamName name of team which it's players played for (common name)
     * @return List of forwards who played for this team
     */
    public List<Player> getForwardsOfTheTeam(String teamName);
    
    /**
     * 
     * @return List of objects witch represent more detail information about players cards
     */
    public List<Object[]> getTheMostPunishedPlayers();
    
    /**
     * 
     * @return List of attackers who has the biggest attackers rank 
     */
    public List<Player> getAttackersOrderByTheirRank();
    
    /**
     *
     * @return List of midfielders who has the biggest midfielders rank
     */
    public List<Player> getMidfieldersOrderByTheirRank();
    
    /**
     *
     * @return List of defenders who has the biggest defenders rank
     */
    public List<Player> getDefendersOrderByTheirRank();
    
    /**
     * 
     * @param id
     * @return Player instance with this id
     */
    public Player getPlayerById(int id);
}
