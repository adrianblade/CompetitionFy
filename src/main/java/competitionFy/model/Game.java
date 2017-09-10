package competitionFy.model;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private Date date;
    private String localTeam;
    private String visitorTeam;
    private String scoreLocalTeam;
    private String scoreVisitorTeam;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "GAME_ID", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(String localTeam) {
        this.localTeam = localTeam;
    }

    public String getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(String visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    public String getScoreLocalTeam() {
        return scoreLocalTeam;
    }

    public void setScoreLocalTeam(String scoreLocalTeam) {
        this.scoreLocalTeam = scoreLocalTeam;
    }

    public String getScoreVisitorTeam() {
        return scoreVisitorTeam;
    }

    public void setScoreVisitorTeam(String scoreVisitorTeam) {
        this.scoreVisitorTeam = scoreVisitorTeam;
    }
}
