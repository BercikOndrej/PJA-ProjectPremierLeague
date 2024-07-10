package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.util.Objects;

@NamedQueries({
    @NamedQuery(
            name = "getAllTeams",
            query = "SELECT t FROM Team t"
    ),
    @NamedQuery(
            name = "getTeamsOrderByLeaguePosition",
            query = "SELECT t FROM Team t ORDER BY t.leaguePosition"
    ),
    @NamedQuery(
            name = "getTeamsOrderByLeaguePositionHome",
            query = "SELECT t FROM Team t ORDER BY t.leaguePositionHome"
    ),
    @NamedQuery(
            name = "getTeamsOrderByLeaguePositionAway",
            query = "SELECT t FROM Team t ORDER BY t.leaguePositionAway"
    ),
    @NamedQuery(
            name = "getTeamByName",
            query = "SELECT t FROM Team t WHERE t.commonName = :teamName"
    )
    
})

/**
 * Class representing a football team
 * It is also Entity class for a database
 */
@Entity
@Table(name = "teams")
public class Team {

    @Id
    private int id;
    
    @Column(name = "team_name")
    private String teamName;
    
    @Column(name = "common_name")
    private String commonName;
    
    private String season;
    
    private String country;
    
    @Column(name = "matches_played")
    private int matchesPlayed;
    
    @Column(name = "matches_played_home")
    private int matchesPlayedHome;
    
    @Column(name = "matches_played_away")
    private int matchesPlayedAway;
    
    private int wins;
    
    @Column(name = "wins_home")
    private int winsHome;
    
    @Column(name = "wins_away")
    private int winsAway;
    
    private int draws;
    
    @Column(name = "draws_home")
    private int drawsHome;
    
    @Column(name = "draws_away")
    private int drawsAway;
    
    private int losses;
    
    @Column(name = "losses_home")
    private int lossesHome;
    
    @Column(name = "losses_away")
    private int lossesAway;
    
    @Column(name = "points_per_game")
    private double pointsPerGame;
    
    @Column(name = "league_position")
    private int leaguePosition;
    
    @Column(name = "league_position_home")
    private int leaguePositionHome;
    
    @Column(name = "league_position_away")
    private int leaguePositionAway;
    
    @Column(name = "goals_scored")
    private int goalsScored;
    
    @Column(name = "goals_scored_home")
    private int goalsScoredHome;
    
    @Column(name = "goals_scored_away")
    private int goalsScoredAway;
    
    @Column(name = "goals_conceded")
    private int goalsConceded;
    
    @Column(name = "goals_conceded_home")
    private int goalsConcededHome;
    
    @Column(name = "goals_conceded_away")
    private int goalsConcededAway;
    
    @Column(name = "minutes_per_goal_scored")
    private int minutesPerGoalScored;
    
    @Column(name = "minutes_per_goal_scored_home")
    private int minutesPerGoalScoredHome;

    @Column(name = "minutes_per_goal_scored_away")
    private int minutesPerGoalScoredAway;

    @Column(name = "minutes_per_goal_conceded")
    private int minutesPerGoalConceded;
    
    @Column(name = "minutes_per_goal_conceded_home")
    private int minutesPerGoalConcededHome;
    
    @Column(name = "minutes_per_goal_conceded_away")
    private int minutesPerGoalConcededAway;
    
    @Column(name = "clean_sheets")
    private int cleanSheets;
    
    @Column(name = "clean_sheets_home")
    private int cleanSheetsHome;
    
    @Column(name = "clean_sheets_away")
    private int cleanSheetsAway;
    
    @Column(name = "total_corners")
    private int totalCorners;
    
    @Column(name = "total_corners_home")
    private int totalCornersHome;
    
    @Column(name = "total_corners_away")
    private int totalCornersAway;
    
    @Column(name = "total_cards")
    private int totalCards;
    
    @Column(name = "total_cards_home")
    private int totalCardsHome;
    
    @Column(name = "total_cards_away")
    private int totalCardsAway;
    
    @Column(name = "average_possession")
    private int averagePossession;
    
    @Column(name = "average_possession_home")
    private int averagePossessionHome;
    
    @Column(name = "average_possession_away")
    private int averagePossessionAway;
   
    private int shots;
    
    @Column(name = "shots_home")
    private int shotsHome;
    
    @Column(name = "shots_away")
    private int shotsAway;
    
    @Column(name = "shots_on_target")
    private int shotsOnTarget;
    
    @Column(name = "shots_on_target_home")
    private int shotsOnTargetHome;
    
    @Column(name = "shots_on_target_away")
    private int shotsOnTargetAway;
    
    private int fouls;
    
    @Column(name = "fouls_home")
    private int foulsHome;
    
    @Column(name = "fouls_away")
    private int foulsAway;
    
    @Column(name = "total_attendance")
    private int totalAttendance;
    
//    Constructors

    public Team() {
    }

    public Team(int id, String teamName, String commonName, String season, String country, int matchesPlayed, int matchesPlayedHome, int matchesPlayedAway, int wins, int winsHome, int winsAway, int draws, int drawsHome, int drawsAway, int losses, int lossesHome, int lossesAway, double pointsPerGame, int leaguePosition, int leaguePositionHome, int leaguePositionAway, int goalsScored, int goalsScoredHome, int goalsScoredAway, int goalsConceded, int goalsConcededHome, int goalsConcededAway, int minutesPerGoalScored, int minutesPerGoalScoredHome, int minutesPerGoalScoredAway, int minutesPerGoalConceded, int minutesPerGoalConcededHome, int minutesPerGoalConcededAway, int cleanSheets, int cleanSheetsHome, int cleanSheetsAway, int totalCorners, int totalCornersHome, int totalCornersAway, int totalCards, int totalCardsHome, int totalCardsAway, int averagePossession, int averagePossessionHome, int averagePossessionAway, int shots, int shotsHome, int shotsAway, int shotsOnTarget, int shotsOnTargetHome, int shotsOnTargetAway, int fouls, int foulsHome, int foulsAway, int totalAttendance) {
        this.id = id;
        this.teamName = teamName;
        this.commonName = commonName;
        this.season = season;
        this.country = country;
        this.matchesPlayed = matchesPlayed;
        this.matchesPlayedHome = matchesPlayedHome;
        this.matchesPlayedAway = matchesPlayedAway;
        this.wins = wins;
        this.winsHome = winsHome;
        this.winsAway = winsAway;
        this.draws = draws;
        this.drawsHome = drawsHome;
        this.drawsAway = drawsAway;
        this.losses = losses;
        this.lossesHome = lossesHome;
        this.lossesAway = lossesAway;
        this.pointsPerGame = pointsPerGame;
        this.leaguePosition = leaguePosition;
        this.leaguePositionHome = leaguePositionHome;
        this.leaguePositionAway = leaguePositionAway;
        this.goalsScored = goalsScored;
        this.goalsScoredHome = goalsScoredHome;
        this.goalsScoredAway = goalsScoredAway;
        this.goalsConceded = goalsConceded;
        this.goalsConcededHome = goalsConcededHome;
        this.goalsConcededAway = goalsConcededAway;
        this.minutesPerGoalScored = minutesPerGoalScored;
        this.minutesPerGoalScoredHome = minutesPerGoalScoredHome;
        this.minutesPerGoalScoredAway = minutesPerGoalScoredAway;
        this.minutesPerGoalConceded = minutesPerGoalConceded;
        this.minutesPerGoalConcededHome = minutesPerGoalConcededHome;
        this.minutesPerGoalConcededAway = minutesPerGoalConcededAway;
        this.cleanSheets = cleanSheets;
        this.cleanSheetsHome = cleanSheetsHome;
        this.cleanSheetsAway = cleanSheetsAway;
        this.totalCorners = totalCorners;
        this.totalCornersHome = totalCornersHome;
        this.totalCornersAway = totalCornersAway;
        this.totalCards = totalCards;
        this.totalCardsHome = totalCardsHome;
        this.totalCardsAway = totalCardsAway;
        this.averagePossession = averagePossession;
        this.averagePossessionHome = averagePossessionHome;
        this.averagePossessionAway = averagePossessionAway;
        this.shots = shots;
        this.shotsHome = shotsHome;
        this.shotsAway = shotsAway;
        this.shotsOnTarget = shotsOnTarget;
        this.shotsOnTargetHome = shotsOnTargetHome;
        this.shotsOnTargetAway = shotsOnTargetAway;
        this.fouls = fouls;
        this.foulsHome = foulsHome;
        this.foulsAway = foulsAway;
        this.totalAttendance = totalAttendance;
    }

    
    
//    Getters

    public int getId() {
        return id;
    }
    
    public String getTeamName() {
        return teamName;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getSeason() {
        return season;
    }

    public String getCountry() {
        return country;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getMatchesPlayedHome() {
        return matchesPlayedHome;
    }

    public int getMatchesPlayedAway() {
        return matchesPlayedAway;
    }

    public int getWins() {
        return wins;
    }

    public int getWinsHome() {
        return winsHome;
    }

    public int getWinsAway() {
        return winsAway;
    }

    public int getDraws() {
        return draws;
    }

    public int getDrawsHome() {
        return drawsHome;
    }

    public int getDrawsAway() {
        return drawsAway;
    }

    public int getLosses() {
        return losses;
    }

    public int getLossesHome() {
        return lossesHome;
    }

    public int getLossesAway() {
        return lossesAway;
    }

    public double getPointsPerGame() {
        return pointsPerGame;
    }

    public int getLeaguePosition() {
        return leaguePosition;
    }

    public int getLeaguePositionHome() {
        return leaguePositionHome;
    }

    public int getLeaguePositionAway() {
        return leaguePositionAway;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getGoalsScoredHome() {
        return goalsScoredHome;
    }

    public int getGoalsScoredAway() {
        return goalsScoredAway;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public int getGoalsConcededHome() {
        return goalsConcededHome;
    }

    public int getGoalsConcededAway() {
        return goalsConcededAway;
    }

    public int getMinutesPerGoalScored() {
        return minutesPerGoalScored;
    }

    public int getMinutesPerGoalScoredHome() {
        return minutesPerGoalScoredHome;
    }

    public int getMinutesPerGoalScoredAway() {
        return minutesPerGoalScoredAway;
    }

    public int getMinutesPerGoalConceded() {
        return minutesPerGoalConceded;
    }

    public int getMinutesPerGoalConcededHome() {
        return minutesPerGoalConcededHome;
    }

    public int getMinutesPerGoalConcededAway() {
        return minutesPerGoalConcededAway;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    public int getCleanSheetsHome() {
        return cleanSheetsHome;
    }

    public int getCleanSheetsAway() {
        return cleanSheetsAway;
    }

    public int getTotalCorners() {
        return totalCorners;
    }

    public int getTotalCornersHome() {
        return totalCornersHome;
    }

    public int getTotalCornersAway() {
        return totalCornersAway;
    }

    public int getTotalCards() {
        return totalCards;
    }

    public int getTotalCardsHome() {
        return totalCardsHome;
    }

    public int getTotalCardsAway() {
        return totalCardsAway;
    }

    public int getAveragePossession() {
        return averagePossession;
    }

    public int getAveragePossessionHome() {
        return averagePossessionHome;
    }

    public int getAveragePossessionAway() {
        return averagePossessionAway;
    }

    public int getShots() {
        return shots;
    }

    public int getShotsHome() {
        return shotsHome;
    }

    public int getShotsAway() {
        return shotsAway;
    }

    public int getShotsOnTarget() {
        return shotsOnTarget;
    }

    public int getShotsOnTargetHome() {
        return shotsOnTargetHome;
    }

    public int getShotsOnTargetAway() {
        return shotsOnTargetAway;
    }

    public int getFouls() {
        return fouls;
    }

    public int getFoulsHome() {
        return foulsHome;
    }

    public int getFoulsAway() {
        return foulsAway;
    }

    public int getTotalAttendance() {
        return totalAttendance;
    }
    
//    Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setMatchesPlayedHome(int matchesPlayedHome) {
        this.matchesPlayedHome = matchesPlayedHome;
    }

    public void setMatchesPlayedAway(int matchesPlayedAway) {
        this.matchesPlayedAway = matchesPlayedAway;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setWinsHome(int winsHome) {
        this.winsHome = winsHome;
    }

    public void setWinsAway(int winsAway) {
        this.winsAway = winsAway;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void setDrawsHome(int drawsHome) {
        this.drawsHome = drawsHome;
    }

    public void setDrawsAway(int drawsAway) {
        this.drawsAway = drawsAway;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setLossesHome(int lossesHome) {
        this.lossesHome = lossesHome;
    }

    public void setLossesAway(int lossesAway) {
        this.lossesAway = lossesAway;
    }

    public void setPointsPerGame(double pointPerGame) {
        this.pointsPerGame = pointPerGame;
    }

    public void setLeaguePosition(int leaguePosition) {
        this.leaguePosition = leaguePosition;
    }

    public void setLeaguePositionHome(int leaguePositionHome) {
        this.leaguePositionHome = leaguePositionHome;
    }

    public void setLeaguePositionAway(int leaguePositionAway) {
        this.leaguePositionAway = leaguePositionAway;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public void setGoalsScoredHome(int goalsScoredHome) {
        this.goalsScoredHome = goalsScoredHome;
    }

    public void setGoalsScoredAway(int goalsScoredAway) {
        this.goalsScoredAway = goalsScoredAway;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public void setGoalsConcededHome(int goalsConcededHome) {
        this.goalsConcededHome = goalsConcededHome;
    }

    public void setGoalsConcededAway(int goalsConcededAway) {
        this.goalsConcededAway = goalsConcededAway;
    }

    public void setMinutesPerGoalScored(int minutesPerGoalScored) {
        this.minutesPerGoalScored = minutesPerGoalScored;
    }

    public void setMinutesPerGoalScoredHome(int minutesPerGoalScoredHome) {
        this.minutesPerGoalScoredHome = minutesPerGoalScoredHome;
    }

    public void setMinutesPerGoalScoredAway(int minutesPerGoalScoredAway) {
        this.minutesPerGoalScoredAway = minutesPerGoalScoredAway;
    }

    public void setMinutesPerGoalConceded(int minutesPerGoalConceded) {
        this.minutesPerGoalConceded = minutesPerGoalConceded;
    }

    public void setMinutesPerGoalConcededHome(int minutesPerGoalConcededHome) {
        this.minutesPerGoalConcededHome = minutesPerGoalConcededHome;
    }

    public void setMinutesPerGoalConcededAway(int minutesPerGoalConcededAway) {
        this.minutesPerGoalConcededAway = minutesPerGoalConcededAway;
    }

    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public void setCleanSheetsHome(int cleanSheetsHome) {
        this.cleanSheetsHome = cleanSheetsHome;
    }

    public void setCleanSheetsAway(int cleanSheetsAway) {
        this.cleanSheetsAway = cleanSheetsAway;
    }

    public void setTotalCorners(int totalCorners) {
        this.totalCorners = totalCorners;
    }

    public void setTotalCornersHome(int totalCornersHome) {
        this.totalCornersHome = totalCornersHome;
    }

    public void setTotalCornersAway(int totalCornersAway) {
        this.totalCornersAway = totalCornersAway;
    }

    public void setTotalCards(int totalCards) {
        this.totalCards = totalCards;
    }

    public void setTotalCardsHome(int totalCardsHome) {
        this.totalCardsHome = totalCardsHome;
    }

    public void setTotalCardsAway(int totalCardsAway) {
        this.totalCardsAway = totalCardsAway;
    }

    public void setAveragePossession(int averagePossession) {
        this.averagePossession = averagePossession;
    }

    public void setAveragePossessionHome(int averagePossessionHome) {
        this.averagePossessionHome = averagePossessionHome;
    }

    public void setAveragePossessionAway(int averagePossessionAway) {
        this.averagePossessionAway = averagePossessionAway;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public void setShotsHome(int shotsHome) {
        this.shotsHome = shotsHome;
    }

    public void setShotsAway(int shotsAway) {
        this.shotsAway = shotsAway;
    }

    public void setShotsOnTarget(int shotsOnTarget) {
        this.shotsOnTarget = shotsOnTarget;
    }

    public void setShotsOnTargetHome(int shotsOnTargetHome) {
        this.shotsOnTargetHome = shotsOnTargetHome;
    }

    public void setShotsOnTargetAway(int shotsOnTargetAway) {
        this.shotsOnTargetAway = shotsOnTargetAway;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    public void setFoulsHome(int foulsHome) {
        this.foulsHome = foulsHome;
    }

    public void setFoulsAway(int foulsAway) {
        this.foulsAway = foulsAway;
    }

    public void setTotalAttendance(int totalAttendance) {
        this.totalAttendance = totalAttendance;
    }
    
//    Needed methods

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.id;
        hash = 31 * hash + Objects.hashCode(this.teamName);
        hash = 31 * hash + Objects.hashCode(this.commonName);
        hash = 31 * hash + Objects.hashCode(this.country);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Team other = (Team) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.teamName, other.teamName)) {
            return false;
        }
        if (!Objects.equals(this.commonName, other.commonName)) {
            return false;
        }
        return Objects.equals(this.country, other.country);
    }

    @Override
    public String toString() {
        return "Team{" + "id=" + id + ", teamName=" + teamName + ", commonName=" + commonName + ", leaguePosition=" + leaguePosition + '}';
    }
    
//    Other methods
    public int getGoalsDiference() {
        return goalsScored - goalsConceded;
    }
    
    public int getGoalsDiferenceHome() {
        return goalsScoredHome - goalsConcededHome;
    }
    
    public int getGoalsDiferenceAway() {
        return goalsScoredAway - goalsConcededAway;
    }
    
    public int getPoints() {
        return (wins * 3) + draws;
    }
    
    public int getPointsHome() {
        return (winsHome * 3) + drawsHome;
    }
    
    public int getPointsAway() {
        return (winsAway * 3) + drawsAway;
    }
}