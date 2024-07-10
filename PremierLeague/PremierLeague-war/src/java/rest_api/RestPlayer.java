package rest_api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import managers.PlayersManager;
import models.Player;

/**
 *
 * Class providing a players data via RESTful api
 */
@ApplicationScoped
@Path("/player")
public class RestPlayer {
    
    @Inject
    private  PlayersManager playersManager;
    
    /**
     * 
     * @return JSON representing list of all players in the league
     */
    @GET
    @Path("allPlayers")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getAllPlayers() {
        List<Player> players = playersManager.getPlayers();
        return Response.ok(players).build();
    }
    
    /**
     * 
     * @return JSON representing list of players with the most goal
     */
    @GET
    @Path("topScorers")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getTopScorers() {
        List<Player> scorers = playersManager.getTopScorers();
        return Response.ok(scorers).build();
    }
    
    /**
     * 
     * @return JSON representing list of players with the most minutes played
     */
    @GET
    @Path("playersWithTheMostMinutesPlayed")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getPlayersWithTheMostMinutesPlayed() {
        List<Player> players = playersManager.getPlayersWithTheMostMinutesPlayed();
        return Response.ok(players).build();
    }
    
    /**
     * 
     * @return JSON representing list of the oldest players
     * 
     */
    @GET
    @Path("theOldestPlayers")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getTheOldestPlayers() {
        List<Player> players = playersManager.getTheOldestPlayers();
        return Response.ok(players).build();
    }
    
    /**
     * 
     * @return JSON representing list of players with the most assists
     */
    @GET
    @Path("playersWithTheMostAssists")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getPlayersWithTheMostAssists() {
        List<Player> players = playersManager.getPlayersWithTheMostAssists();
        return Response.ok(players).build();
    }
    
    /**
     * 
     * @return JSON representing list of goalkeepers with the most clean sheets
     */
    @GET
    @Path("goalkeepersWithTheMostCleanSheets")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getGoalkeepersWithTheMostCleanSheets() {
        List<Player> players = playersManager.getGoalkeepersWithTheMostCleanSheets();
        return Response.ok(players).build();
    }
    
    /**
     *
     * @return JSON representing list of the most punished players by cards
     */
    @GET
    @Path("theMostPunishedPlayers")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getTheMostPunishedPlayers() {
        List<Object[]> objects = playersManager.getTheMostPunishedPlayers();
        List<Player> players = new ArrayList<>();
        for (Object[] objArray : objects) {
            Player p = playersManager.getPlayerById((int)objArray[0]);
            players.add(p);
        }
        return Response.ok(players).build();
    }

    /**
     * 
     * @return JSON representing list of attackers order by their league rank
     */
    @GET
    @Path("attackersOrderByTheirRank")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getAttackersOrderByTheirRank() {
        List<Player> players = playersManager.getAttackersOrderByTheirRank();
        return Response.ok(players).build();
    }
    
    /**
     *
     * @return JSON representing list of midfielders order by their league rank
     */
    @GET
    @Path("midfieldersOrderByTheirRank")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getMidfieldersOrderByTheirRank() {
        List<Player> players = playersManager.getMidfieldersOrderByTheirRank();
        return Response.ok(players).build();
    }
    
    /**
     *
     * @return JSON representing list of defenders order by their league rank
     */
    @GET
    @Path("defendersOrderByTheirRank")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getDefendersOrderByTheirRank() {
        List<Player> players = playersManager.getDefendersOrderByTheirRank();
        return Response.ok(players).build();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getPlayerById(@PathParam("id") int id) {
        Player p = playersManager.getPlayerById(id);
        return Response.ok(p).build();
    }
    
    /**
     * 
     * @param teamName is common name of the team (Arsenal, not Arsenal FC)
     * @return JSON representing list of players playing for the team with this name
     */
    @GET
    @Path("playersOfTeam/{teamName}")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getPlayersOfTeam(
            @PathParam("teamName") String teamName
    ) {
        List<Player> players = playersManager.getPlayersOfTeam(teamName);
        return Response.ok(players).build();
    }
    
    /**
     *
     * @param teamName is common name of the team (Arsenal, not Arsenal FC)
     *
     * @return JSON representing list of goalkeepers playing for the team with this
     * name
     */
    @GET
    @Path("goalkeepersOfTeam/{teamName}")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getGoalkeepersOfTeam(
            @PathParam("teamName") String teamName
    ) {
        List<Player> players = playersManager.getGoalkeepersOfTheTeam(teamName);
        return Response.ok(players).build();
    }
    
    /**
     *
     * @param teamName is common name of the team (Arsenal, not Arsenal FC)
     *
     * @return JSON representing list of defenders playing for the team with
     * this
     * name
     */
    @GET
    @Path("defendersOfTeam/{teamName}")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getDefendersOfTeam(
            @PathParam("teamName") String teamName
    ) {
        List<Player> players = playersManager.getDefendersOfTheTeam(teamName);
        return Response.ok(players).build();
    }
    
    /**
     *
     * @param teamName is common name of the team (Arsenal, not Arsenal FC)
     *
     * @return JSON representing list of midfielders playing for the team with
     * this
     * name
     */
    @GET
    @Path("midfieldersOfTeam/{teamName}")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getMidfieldersOfTeam(
            @PathParam("teamName") String teamName
    ) {
        List<Player> players = playersManager.getMidfieldersOfTheTeam(teamName);
        return Response.ok(players).build();
    }
    
    /**
     *
     * @param teamName is common name of the team (Arsenal, not Arsenal FC)
     *
     * @return JSON representing list of goalkeepers playing for the team with
     * this
     * name
     */
    @GET
    @Path("forwardsOfTeam/{teamName}")
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized Response getForwardsOfTeam(
            @PathParam("teamName") String teamName
    ) {
        List<Player> players = playersManager.getForwardsOfTheTeam(teamName);
        return Response.ok(players).build();
    }
}
