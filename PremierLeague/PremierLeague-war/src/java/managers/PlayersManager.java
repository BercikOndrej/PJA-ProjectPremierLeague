package managers;

import api.IPlayerApi;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;
import models.Player;

/**
 *
 * Class representing manager used for Players data manipulation
 */
@ApplicationScoped
@Named("playersManager")
public class PlayersManager {

    @EJB
    private IPlayerApi iPlayerApi;

    public PlayersManager() {
    }
    
    /**
     *
     * @return List of all players saved in the database
     */
    public List<Player> getPlayers() {
        return iPlayerApi.getPlayers();
    }

    /**
     *
     * @return List of best scorers over all teams. Players with 0 goals are not
     * included
     */
    public List<Player> getTopScorers() {
        return iPlayerApi.getTopScorers();
    }

    /**
     *
     * @return List of players who played the most minutes for a season
     */
    public List<Player> getPlayersWithTheMostMinutesPlayed() {
        return iPlayerApi.getPlayersWithTheMostMinutesPlayed();
    }

    /**
     *
     * @return List of the oldest players in the league
     */
    public List<Player> getTheOldestPlayers() {
        return iPlayerApi.getTheOldestPlayers();
    }

    /**
     *
     * @return List of players who has the most assist. Players with 0 assist
     * are not included.
     */
    public List<Player> getPlayersWithTheMostAssists() {
        return iPlayerApi.getPlayersWithTheMostAssists();
    }

    /**
     *
     * @return Only goalkeepers who has the most clean sheets for a season
     */
    public List<Player> getGoalkeepersWithTheMostCleanSheets() {
        return iPlayerApi.getGoalkeepersWithTheMostCleanSheets();
    }

    /**
     *
     * @param teamName name of team which it's players played for
     *
     * @return List of players who played for this team
     */
    public List<Player> getPlayersOfTeam(String teamName) {
        return iPlayerApi.getPlayersOfTeam(teamName);
    }
    
    /**
     *
     * @param teamName name of team which it's players played for (common name)
     *
     * @return List of goalkeepers who played for this team
     */
    public List<Player> getGoalkeepersOfTheTeam(String teamName) {
        return iPlayerApi.getGoalkeepersOfTheTeam(teamName);
    }

    /**
     *
     * @param teamName name of team which it's players played for (common name)
     *
     * @return List of defenders who played for this team
     */
    public List<Player> getDefendersOfTheTeam(String teamName) {
        return iPlayerApi.getDefendersOfTheTeam(teamName);
    }

    /**
     *
     * @param teamName name of team which it's players played for (common name)
     *
     * @return List of midfielders who played for this team
     */
    public List<Player> getMidfieldersOfTheTeam(String teamName) {
        return iPlayerApi.getMidfieldersOfTheTeam(teamName);
    }

    /**
     *
     * @param teamName name of team which it's players played for (common name)
     *
     * @return List of forwards who played for this team
     */
    public List<Player> getForwardsOfTheTeam(String teamName) {
        return iPlayerApi.getForwardsOfTheTeam(teamName);
    }

    /**
     *
     * @return List of players who has the most red cards (2 points) and yellow
     * cards (1 point)
     */
    public List<Object[]> getTheMostPunishedPlayers() {
        return iPlayerApi.getTheMostPunishedPlayers();
    }

    /**
     *
     * @return List of attackers who has the biggest attackers rank
     */
    public List<Player> getAttackersOrderByTheirRank() {
        return iPlayerApi.getAttackersOrderByTheirRank();
    }

    /**
     *
     * @return List of midfielders who has the biggest midfielders rank
     */
    public List<Player> getMidfieldersOrderByTheirRank() {
        return iPlayerApi.getMidfieldersOrderByTheirRank();
    }

    /**
     *
     * @return List of defenders who has the biggest defenders rank
     */
    public List<Player> getDefendersOrderByTheirRank() {
        return iPlayerApi.getDefendersOrderByTheirRank();
    }

    /**
     *
     * @param id
     *
     * @return Player instance with this id
     */
    public Player getPlayerById(int id) {
        return iPlayerApi.getPlayerById(id);
    }
    
    public List<Object[]> getEditedPlayers() {
        List<Object[]> result = new ArrayList<>();
        List<Object[]> objects = getTheMostPunishedPlayers();
        
        for (int firstIndex = 0; firstIndex < objects.size(); firstIndex++) {
            Object[] newItem = new Object[6];
            Object[] objectArray = objects.get(firstIndex);
            System.arraycopy(objectArray, 0, newItem, 0, objectArray.length);
            newItem[5] = (firstIndex + 1);
            result.add(newItem);
        }
        
        return result;
    }
}
