package rest_api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import managers.TeamsManager;
import models.Team;

/**
 *
 * Class providing a teams data via RESTful api
 */
@ApplicationScoped
@Path("/team")
public class RestTeam {

    @Inject
    private TeamsManager teamsManager;
    
    /**
     * 
     * @return JSON representing a list of teams ordered by their name
     */
    @GET
    @Path("allTeams")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getAllTeams() {
        List<Team> teams = teamsManager.getTeamsOrderByName();
        return Response.ok(teams).build();
    }
    
    /**
     * 
     * @return JSON representing a list of teams ordered by their league position
     */
    @GET
    @Path("teamsOrderByLeaguePosition")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getTeamsOrderedByLeaguePosition() {
        List<Team> teams = teamsManager.getTeamsOrderByLeaguePosition();
        return Response.ok(teams).build();
    }
    
    /**
     *
     * @return JSON representing a list of teams ordered by their league
     * position home
     */
    @GET
    @Path("teamsOrderByLeaguePositionHome")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getTeamsOrderedByLeaguePositionHome() {
        List<Team> teams = teamsManager.getTeamsOrderByLeaguePositionHome();
        return Response.ok(teams).build();
    }
    
    /**
     *
     * @return JSON representing a list of teams ordered by their league 
     * position away
     */
    @GET
    @Path("teamsOrderByLeaguePositionAway")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getTeamsOrderedByLeaguePositionAway() {
        List<Team> teams = teamsManager.getTeamsOrderByLeaguePositionAway();
        return Response.ok(teams).build();
    }
    
    /**
     * 
     * @param name It is common name of team
     * @return JSON representing a team which has that name
     * 
     */
    @GET
    @Path("teamByName/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getTeamByName(@PathParam("name") String name) {
        Team team = teamsManager.getTeamByName(name);
        return Response.ok(team).build();
    }
    
    /**
     *
     * @param id It is id of team
     * @return JSON representing a team which has that name
     *
     */
    @GET
    @Path("teamById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getTeamById(@PathParam("id") int id) {
        Team team = teamsManager.getTeamById(id);
        return Response.ok(team).build();
    }
}
