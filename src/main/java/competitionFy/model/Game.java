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
    private int localTeam;
    private int visitorTeam;
    private int scoreLocalTeam;
    private int scoreVisitorTeam;
    private int schedulerPointLocalTeam;
    private int schedulerPointVisitorTeam;

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

    public int getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(int localTeam) {
        this.localTeam = localTeam;
    }

    public int getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(int visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    public int getScoreLocalTeam() {
        return scoreLocalTeam;
    }

    public void setScoreLocalTeam(int scoreLocalTeam) {
        this.scoreLocalTeam = scoreLocalTeam;
    }

    public int getScoreVisitorTeam() {
        return scoreVisitorTeam;
    }

    public void setScoreVisitorTeam(int scoreVisitorTeam) {
        this.scoreVisitorTeam = scoreVisitorTeam;
    }

    public int getSchedulerPointLocalTeam() {
        return schedulerPointLocalTeam;
    }

    public void setSchedulerPointLocalTeam(int schedulerPointLocalTeam) {
        this.schedulerPointLocalTeam = schedulerPointLocalTeam;
    }

    public int getSchedulerPointVisitorTeam() {
        return schedulerPointVisitorTeam;
    }

    public void setSchedulerPointVisitorTeam(int schedulerPointVisitorTeam) {
        this.schedulerPointVisitorTeam = schedulerPointVisitorTeam;
    }
}
