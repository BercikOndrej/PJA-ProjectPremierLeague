package beans;

import api.IPremierLeagueInfoApi;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import models.PremierLeagueInfo;

/**
 * 
 * Java bean used to for database manipulation
 */
@Stateless
public class PremierLeagueInfoBean  implements IPremierLeagueInfoApi {

    @PersistenceContext(unitName = "PremierLeague-PU")
    private EntityManager entityManager;
    
    /**
     *
     * @return Instance of PremierLeagueInfo saved in the database
     */
    @Override
    public PremierLeagueInfo getPremierLeagueInfo() {
        return (PremierLeagueInfo) entityManager.createQuery("SELECT i from PremierLeagueInfo i")
                    .getResultList()
                    .get(0);
    }
}
