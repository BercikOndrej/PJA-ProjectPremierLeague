package beans;

import api.ITeamApi;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import models.Team;

/**
 *
 * Java bean used to for database manipulation
 */
@Stateless
public class TeamBean implements ITeamApi {

    @PersistenceContext(unitName = "PremierLeague-PU")
    private EntityManager entityManager;
    
    /**
     *
     * @return List of teams order by it's name
     */
    @Override
    public List<Team> getTeamsOrderByName() {
        return entityManager.createNamedQuery("getAllTeams").getResultList();
    }

    /**
     *
     * @return List of teams order by it's position at league
     */
    @Override
    public List<Team> getTeamsOrderByLeaguePosition() {
        return entityManager.createNamedQuery("getTeamsOrderByLeaguePosition").getResultList();
    }

    /**
     *
     * @return List of teams order by it's position at league in home matches
     */
    @Override
    public List<Team> getTeamsOrderByLeaguePositionHome() {
        return entityManager.createNamedQuery("getTeamsOrderByLeaguePositionHome").getResultList();
    }

    /**
     *
     * @return List of teams order by it's position at league in away matches
     */
    @Override
    public List<Team> getTeamsOrderByLeaguePositionAway() {
        return entityManager.createNamedQuery("getTeamsOrderByLeaguePositionAway").getResultList();
    }

    /**
     *
     * @param name name of team. It doesn't mean common name of team
     *
     * @return Team instance of team with this name. Otherwise return null
     */
    @Override
    public Team getTeamByName(String name) {
        return (Team) entityManager.createNamedQuery("getTeamByName")
                .setParameter("teamName", name)
                .getSingleResult();
    }
    
    /**
     *
     * @param id
     *
     * @return Team with this id
     */
    @Override
    public Team getTeamById(int id) {
        return entityManager.find(Team.class, id);
    }
}
