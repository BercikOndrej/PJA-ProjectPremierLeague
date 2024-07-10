package managers;

import api.IPremierLeagueInfoApi;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import models.PremierLeagueInfo;

/**
 * 
 * Class representing manager used for PremierLeague data manipulation
 */
@ApplicationScoped
@Named("leagueInfoManager")
public class PremierLeagueInfoManager {
    
    @EJB
    private IPremierLeagueInfoApi iPremierLeagueInfoApi;

    public PremierLeagueInfoManager() {
    }
    
    /**
     *
     * @return Instance of PremierLeagueInfo saved in the database
     */
    public PremierLeagueInfo getPremierLeagueInfo() {
        return iPremierLeagueInfoApi.getPremierLeagueInfo();
    }
}
