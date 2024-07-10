package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/** 
 * Class representing football player
 * It is also Entity class for database
*/

@NamedQueries({
    @NamedQuery(
            name = "getAllPlayers",
            query = "SELECT p FROM Player p"
    ),
    @NamedQuery(
            name = "getTopScorers",
            query = "SELECT p FROM Player p ORDER BY p.overallGoals DESC"
    ),
    @NamedQuery(
            name = "getPlayersWithTheMostMinutesPlayed",
            query = "SELECT p FROM Player p ORDER BY p.overallPlayedMinutes DESC"
    ),
    @NamedQuery(
            name = "getTheOldestPlayers",
            query = "SELECT p FROM Player p ORDER BY p.age DESC"
    ),
    @NamedQuery(
            name = "getPlayersWithTheMostAssists",
            query = "SELECT p FROM Player p ORDER BY p.overallAssists DESC"
    ),
    @NamedQuery(
            name = "getGoalkeepersWithTheMostCleanSheets",
            query = "SELECT p FROM Player p WHERE p.position = 'Goalkeeper' ORDER BY p.overallCleanSheets DESC"
    ),
    @NamedQuery(
            name = "getPlayersOfTeam",
            query = "SELECT p FROM Player p WHERE p.club = :club"
    ),
    @NamedQuery(
            name = "getGoalkeepersOfTeam",
            query = "SELECT p FROM Player p WHERE p.club = :club AND "
                    + "p.position = 'Goalkeeper'"
    ),
    @NamedQuery(
            name = "getDefendersOfTeam",
            query = "SELECT p FROM Player p WHERE p.club = :club AND "
            + "p.position = 'Defender'"
    ),
    @NamedQuery(
            name = "getMidfieldersOfTeam",
            query = "SELECT p FROM Player p WHERE p.club = :club AND "
            + "p.position = 'Midfielder'"
    ),
    @NamedQuery(
            name = "getForwardsOfTeam",
            query = "SELECT p FROM Player p WHERE p.club = :club AND "
            + "p.position = 'Forward'"
    ),
    @NamedQuery(
            name ="getPlayersByCardsScore",
            query = "SELECT "
                    + "p.id, p.fullName, p.overallYellowCards, p.overallRedCards, "
                    + "((p.overallRedCards * 2) + p.overallYellowCards) AS cardsScore "
                    + "FROM Player p ORDER BY cardsScore DESC"
    ),
    @NamedQuery(
            name = "getAttackersOrderByTheirRank",
            query = "SELECT p FROM Player p WHERE p.position = 'Forward' AND p.rankInLeagueTopAttackers > 0 "
                    + "ORDER BY p.rankInLeagueTopAttackers ASC"
    ),
    @NamedQuery(
            name = "getMidfieldersOrderByTheirRank",
            query = "SELECT p FROM Player p WHERE p.position = 'Midfielder'AND p.rankInLeagueTopMidfielders > 0 "
                    + "ORDER BY p.rankInLeagueTopMidfielders ASC"
    ),
    @NamedQuery(
            name = "getDefendersOrderByTheirRank",
            query = "SELECT p FROM Player p WHERE p.position = 'Defender' AND p.rankInLeagueTopDefenders > 0 "
                    + "ORDER BY p.rankInLeagueTopDefenders ASC"
    ),
})

@Entity
@Table(name = "players")
public class Player {
    
    @Id
    private int id;
    
    @Column(name = "full_name")
    private String fullName;
   
    private int age;
    
    private String birthday;
    
    private String league;
    
    private String season;
    
    private String position;
    
    private String club;
    
    private String nationality;
    
    @Column(name = "overall_played_minutes")
    private int overallPlayedMinutes;
    
    @Column(name = "overall_appearances")
    private int overallAppearances;
    
    @Column(name = "overall_goals")
    private int overallGoals;
    
    @Column(name = "overall_assists")
    private int overallAssists;
    
    @Column(name = "penalty_goals")
    private int penaltyGoals;
    
    @Column(name = "penalty_misses")
    private int penaltyMisses;
    
    @Column(name = "overall_clean_sheets")
    private int overallCleanSheets;
    
    @Column(name = "overall_yellow_cards")
    private int overallYellowCards;
    
    @Column(name = "overall_red_cards")
    private int overallRedCards;
    
    @Column(name = "minutes_per_goal")
    private int minutesPerGoal;
    
    @Column(name = "minutes_per_match")
    private int minutesPerMatch;
    
    @Column(name = "minutes_per_card")
    private int minutesPerCard;
    
    @Column(name = "minutes_per_assist")
    private int minutesPerAssist;
    
    @Column(name = "rank_in_league_top_attackers")
    private int rankInLeagueTopAttackers;
    
    @Column(name = "rank_in_league_top_midfielders")
    private int rankInLeagueTopMidfielders;
    
    @Column(name = "rank_in_league_top_defenders")
    private int rankInLeagueTopDefenders;
    
    @Column(name = "rank_in_club_top_scorer")
    private int rankInClubTopScorer;

//    Constructors
    public Player() {
    }

    public Player(int id, String fullName, int age, String birthday, String league, String season, String position, String club, String nationality, int overallPlayedMinutes, int overallAppearances, int overallGoals, int overallAssists, int penaltyGoals, int penaltyMisses, int overallCleanSheets, int overallYellowCards, int overallRedCards, int minutesPerGoal, int minutesPerMatch, int minutesPerCard, int minutesPerAssist, int rankInLeagueTopAttackers, int rankInLeagueTopMidfielders, int rankInLeagueTopDefenders, int rankInClubTopScorer) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.birthday = birthday;
        this.league = league;
        this.season = season;
        this.position = position;
        this.club = club;
        this.nationality = nationality;
        this.overallPlayedMinutes = overallPlayedMinutes;
        this.overallAppearances = overallAppearances;
        this.overallGoals = overallGoals;
        this.overallAssists = overallAssists;
        this.penaltyGoals = penaltyGoals;
        this.penaltyMisses = penaltyMisses;
        this.overallCleanSheets = overallCleanSheets;
        this.overallYellowCards = overallYellowCards;
        this.overallRedCards = overallRedCards;
        this.minutesPerGoal = minutesPerGoal;
        this.minutesPerMatch = minutesPerMatch;
        this.minutesPerCard = minutesPerCard;
        this.minutesPerAssist = minutesPerAssist;
        this.rankInLeagueTopAttackers = rankInLeagueTopAttackers;
        this.rankInLeagueTopMidfielders = rankInLeagueTopMidfielders;
        this.rankInLeagueTopDefenders = rankInLeagueTopDefenders;
        this.rankInClubTopScorer = rankInClubTopScorer;
    }

   
    
//    Getters
    public int getId() {
        return id;
    }
    
    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getBirthday() {
        List<String> strings = Arrays.asList(birthday.split("/"));
        Collections.reverse(strings);
        String finalString = strings.get(0);
        for (String str : strings.subList(1, 3)) {
            finalString += "/" + str;
        }
        return finalString;
    }

    public String getLeague() {
        return league;
    }

    public String getSeason() {
        return season;
    }

    public String getPosition() {
        return position;
    }

    public String getClub() {
        return club;
    }

    public String getNationality() {
        return nationality;
    }

    public int getOverallPlayedMinutes() {
        return overallPlayedMinutes;
    }

    public int getOverallAppearances() {
        return overallAppearances;
    }

    public int getOverallGoals() {
        return overallGoals;
    }

    public int getOverallAssists() {
        return overallAssists;
    }

    public int getPenaltyGoals() {
        return penaltyGoals;
    }

    public int getPenaltyMisses() {
        return penaltyMisses;
    }

    public int getOverallCleanSheets() {
        return overallCleanSheets;
    }

    public int getOverallYellowCards() {
        return overallYellowCards;
    }

    public int getOverallRedCards() {
        return overallRedCards;
    }

    public int getMinutesPerGoal() {
        return minutesPerGoal;
    }

    public int getMinutesPerMatch() {
        return minutesPerMatch;
    }

    public int getMinutesPerCard() {
        return minutesPerCard;
    }

    public int getMinutesPerAssist() {
        return minutesPerAssist;
    }

    public int getRankInLeagueTopAttackers() {
        return rankInLeagueTopAttackers;
    }

    public int getRankInLeagueTopMidfielders() {
        return rankInLeagueTopMidfielders;
    }

    public int getRankInLeagueTopDefenders() {
        return rankInLeagueTopDefenders;
    }

    public int getRankInClubTopScorer() {
        return rankInClubTopScorer;
    }
    
//    Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setOverallPlayedMinutes(int overallPlayedMinutes) {
        this.overallPlayedMinutes = overallPlayedMinutes;
    }

    public void setOverallAppearances(int overallAppearances) {
        this.overallAppearances = overallAppearances;
    }

    public void setOverallGoals(int overallGoals) {
        this.overallGoals = overallGoals;
    }

    public void setOverallAssists(int overallAssists) {
        this.overallAssists = overallAssists;
    }

    public void setPenaltyGoals(int penaltyGoals) {
        this.penaltyGoals = penaltyGoals;
    }

    public void setPenaltyMisses(int penaltyMisses) {
        this.penaltyMisses = penaltyMisses;
    }

    public void setOverallCleanSheets(int overallCleanSheets) {
        this.overallCleanSheets = overallCleanSheets;
    }

    public void setOverallYellowCards(int overallYellowCards) {
        this.overallYellowCards = overallYellowCards;
    }

    public void setOverallRedCards(int overallRedCards) {
        this.overallRedCards = overallRedCards;
    }

    public void setMinutesPerGoal(int minutesPerGoal) {
        this.minutesPerGoal = minutesPerGoal;
    }

    public void setMinutesPerMatch(int minutesPerMatch) {
        this.minutesPerMatch = minutesPerMatch;
    }

    public void setMinutesPerCard(int minutesPerCard) {
        this.minutesPerCard = minutesPerCard;
    }

    public void setMinutesPerAssist(int minutesPerAssist) {
        this.minutesPerAssist = minutesPerAssist;
    }

    public void setRankInLeagueTopAttackers(int rankInLeagueTopAttackers) {
        this.rankInLeagueTopAttackers = rankInLeagueTopAttackers;
    }

    public void setRankInLeagueTopMidfielders(int rankInLeagueTopMidfielders) {
        this.rankInLeagueTopMidfielders = rankInLeagueTopMidfielders;
    }

    public void setRankInLeagueTopDefenders(int rankInLeagueTopDefenders) {
        this.rankInLeagueTopDefenders = rankInLeagueTopDefenders;
    }

    public void setRankInClubTopScorer(int rankInClubTopScorer) {
        this.rankInClubTopScorer = rankInClubTopScorer;
    }
    
//    Needed methods

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.fullName);
        hash = 67 * hash + this.age;
        hash = 67 * hash + Objects.hashCode(this.position);
        hash = 67 * hash + Objects.hashCode(this.club);
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
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.fullName, other.fullName)) {
            return false;
        }
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        return Objects.equals(this.club, other.club);
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", fullName=" + fullName + ", age=" + age + ", position=" + position + ", club=" + club + ", nationality=" + nationality + '}';
    }
    
    public int getRankByPosition() {
        return switch (position) {
            case "Defender" -> rankInLeagueTopDefenders;
            case "Midfielder" -> rankInLeagueTopMidfielders;
            case "Forward" -> rankInLeagueTopAttackers;
            default -> 0;
        };
    }
}
