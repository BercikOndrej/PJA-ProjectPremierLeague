package api;

import jakarta.ejb.Local;
import models.PremierLeagueInfo;

/**
 * Interface for access to database via EJB.
 * It is intended for clients.
 * This interface provides Premier league data.
 */
@Local
public interface IPremierLeagueInfoApi {
    
    /**
     * 
     * @return Instance of PremierLeagueInfo saved in the database
     */
    public PremierLeagueInfo getPremierLeagueInfo();
}
