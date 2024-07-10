package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 * Class representing Premier league info
 * It is also Entity class for database
 */
@Entity
@Table(name = "premier_league_info")
public class PremierLeagueInfo {

    @Id
    private String name;
    
    private String season;
    
    @Column(name = "number_of_clubs")
    private int numberOfClubs;
    
    @Column(name = "total_matches")
    private int totalMatches;
    
    @Column(name = "total_game_week")
    private int totalGameWeek;
    
    @Column(name = "average_goals_per_match")
    private double averageGoalsPerMatch;
    
    @Column(name = "average_corners_per_match")
    private double averageCornersPerMatch;
    
    @Column(name = "total_corners_for_season")
    private int totalCornersForSeason;
    
    @Column(name = "average_cards_per_match")
    private double averageCardsPerMatch;
    
    @Column(name = "total_cards_for_season")
    private int totalCardsForSeason;
    
    @Column(name = "logo_url")
    private String logoUrl;

//    Constructors
    public PremierLeagueInfo() {
    }

    public PremierLeagueInfo(String name, String season, int numberOfClubs, int totalMatches, int totalGameWeek, double averageGoalsPerMatch, double averageCornersPerMatch, int totalCornersForSeason, double averageCardsPerMatch, int totalCardsForSeason, String logoUrl) {
        this.name = name;
        this.season = season;
        this.numberOfClubs = numberOfClubs;
        this.totalMatches = totalMatches;
        this.totalGameWeek = totalGameWeek;
        this.averageGoalsPerMatch = averageGoalsPerMatch;
        this.averageCornersPerMatch = averageCornersPerMatch;
        this.totalCornersForSeason = totalCornersForSeason;
        this.averageCardsPerMatch = averageCardsPerMatch;
        this.totalCardsForSeason = totalCardsForSeason;
        this.logoUrl = logoUrl;
    }
    
    
//    Getters
    public String getName() {
        return name;
    }

    public String getSeason() {
        return season;
    }

    public int getNumberOfClubs() {
        return numberOfClubs;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    public int getTotalGameWeek() {
        return totalGameWeek;
    }

    public double getAverageGoalsPerMatch() {
        return averageGoalsPerMatch;
    }

    public double getAverageCornersPerMatch() {
        return averageCornersPerMatch;
    }

    public int getTotalCornersForSeason() {
        return totalCornersForSeason;
    }

    public double getAverageCardsPerMatch() {
        return averageCardsPerMatch;
    }

    public int getTotalCardsForSeason() {
        return totalCardsForSeason;
    }

    public String getLogoUrl() {
        return logoUrl;
    }
    
//    Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setNumberOfClubs(int numberOfClubs) {
        this.numberOfClubs = numberOfClubs;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }

    public void setTotalGameWeek(int totalGameWeek) {
        this.totalGameWeek = totalGameWeek;
    }

    public void setAverageGoalsPerMatch(double averageGoalsPerMatch) {
        this.averageGoalsPerMatch = averageGoalsPerMatch;
    }

    public void setAverageCornersPerMatch(double averageCornersPerMatch) {
        this.averageCornersPerMatch = averageCornersPerMatch;
    }

    public void setTotalCornersForSeason(int totalCornersForSeason) {
        this.totalCornersForSeason = totalCornersForSeason;
    }

    public void setAverageCardsPerMatch(double averageCardsPerMatch) {
        this.averageCardsPerMatch = averageCardsPerMatch;
    }

    public void setTotalCardsForSeason(int totalCardsForSeason) {
        this.totalCardsForSeason = totalCardsForSeason;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

//    Needed methods
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.season);
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
        final PremierLeagueInfo other = (PremierLeagueInfo) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.season, other.season);
    }

    @Override
    public String toString() {
        return "PremierLeagueInfoSingleton{" + "name=" + name + ", season=" + season + ", numberOfClubs=" + numberOfClubs + ", totalMatches=" + totalMatches + '}';
    }
}
