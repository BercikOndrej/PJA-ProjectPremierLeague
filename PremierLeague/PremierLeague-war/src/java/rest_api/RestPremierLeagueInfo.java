package rest_api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import managers.PremierLeagueInfoManager;
import models.PremierLeagueInfo;

/**
 * 
 * Class providing a league info data via RESTful api
 */
@ApplicationScoped
@Path("/leagueInfo")
public class RestPremierLeagueInfo {
    
    @Inject
    private PremierLeagueInfoManager premierLeagueInfoManager;
    
    /**
     * 
     * @return Response with PremierLeagueInfo instance in JSON format
     * 
     */
    @GET
    @Path("get")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getInfo() {
        PremierLeagueInfo info = premierLeagueInfoManager.getPremierLeagueInfo();
        return Response.ok(info).build();
    }
}
