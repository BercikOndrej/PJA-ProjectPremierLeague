package beans;

import api.IPlayerApi;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import models.Player;

/**
 *
 * Java bean used to for database manipulation
 */
@Stateless
public class PlayerBean implements IPlayerApi {

    @PersistenceContext(unitName = "PremierLeague-PU")
    private EntityManager entityManager;

    
    /**
     *
     * @return List of all players saved in the database
     */
    @Override
    public List<Player> getPlayers() {
        return entityManager.createNamedQuery("getAllPlayers").getResultList();
    }

    /**
     *
     * @return List of best scorers over all teams. Players with 0 goals are not
     * included
     */
    @Override
    public List<Player> getTopScorers() {
        return entityManager.createNamedQuery("getTopScorers").getResultList();
    }

    /**
     *
     * @return List of players who played the most minutes for a season
     */
    @Override
    public List<Player> getPlayersWithTheMostMinutesPlayed() {
        return entityManager.createNamedQuery("getPlayersWithTheMostMinutesPlayed").getResultList();
    }

    /**
     *
     * @return List of the oldest players in the league
     */
    @Override
    public List<Player> getTheOldestPlayers() {
        return entityManager.createNamedQuery("getTheOldestPlayers").getResultList();
    }

    /**
     *
     * @return List of players who has the most assist. Players with 0 assist
     * are not included.
     */
    @Override
    public List<Player> getPlayersWithTheMostAssists() {
        return entityManager.createNamedQuery("getPlayersWithTheMostAssists").getResultList();
    }

    /**
     *
     * @return Only goalkeepers who has the most clean sheets for a season
     */
    @Override
    public List<Player> getGoalkeepersWithTheMostCleanSheets() {
        return entityManager.createNamedQuery("getGoalkeepersWithTheMostCleanSheets").getResultList();
    }

    /**
     *
     * @return List of objects witch represent more detail information about
     * players cards
     */
    @Override
    public List<Object[]> getTheMostPunishedPlayers() {
        return entityManager.createNamedQuery("getPlayersByCardsScore").getResultList();
    }
    
    /**
     *
     * @param teamCommonName name of team which it's players played for. It is it's common name
     *
     * @return List of players who played for this team
     */
    @Override
    public List<Player> getPlayersOfTeam(String teamCommonName) {
        return entityManager.createNamedQuery("getPlayersOfTeam")
               .setParameter("club", teamCommonName)
                .getResultList();
    }
    
    /**
     *
     * @param teamName name of team which it's players played for (common name)
     *
     * @return List of goalkeepers who played for this team
     */
    @Override
    public List<Player> getGoalkeepersOfTheTeam(String teamName) {
        return entityManager.createNamedQuery("getGoalkeepersOfTeam")
                .setParameter("club", teamName)
                .getResultList();
    }

    /**
     *
     * @param teamName name of team which it's players played for (common name)
     *
     * @return List of defenders who played for this team
     */
    @Override
    public List<Player> getDefendersOfTheTeam(String teamName) {
        return entityManager.createNamedQuery("getDefendersOfTeam")
                .setParameter("club", teamName)
                .getResultList();
    }

    /**
     *
     * @param teamName name of team which it's players played for (common name)
     *
     * @return List of midfielders who played for this team
     */
    @Override
    public List<Player> getMidfieldersOfTheTeam(String teamName) {
        return entityManager.createNamedQuery("getMidfieldersOfTeam")
                .setParameter("club", teamName)
                .getResultList();
    }

    /**
     *
     * @param teamName name of team which it's players played for (common name)
     *
     * @return List of forwards who played for this team
     */
    @Override
    public List<Player> getForwardsOfTheTeam(String teamName) {
        return entityManager.createNamedQuery("getForwardsOfTeam")
                .setParameter("club", teamName)
                .getResultList();
    }

    /**
     *
     * @return List of attackers who has the biggest attackers rank
     */
    @Override
    public List<Player> getAttackersOrderByTheirRank() {
        return entityManager.createNamedQuery("getAttackersOrderByTheirRank").getResultList();
    }

    /**
     *
     * @return List of midfielders who has the biggest midfielders rank
     */
    @Override
    public List<Player> getMidfieldersOrderByTheirRank() {
        return entityManager.createNamedQuery("getMidfieldersOrderByTheirRank").getResultList();
    }

    /**
     *
     * @return List of defenders who has the biggest defenders rank
     */
    @Override
    public List<Player> getDefendersOrderByTheirRank() {
        return entityManager.createNamedQuery("getDefendersOrderByTheirRank").getResultList();
    }

    /**
     *
     * @param id
     *
     * @return Player instance with this id
     */
    @Override
    public Player getPlayerById(int id) {
        return entityManager.find(Player.class, id);
    }
}
