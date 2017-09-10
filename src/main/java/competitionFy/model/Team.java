package competitionFy.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by Adrian on 12/02/2017.
 */
@Entity
@Table(name = "team")
public class Team implements java.io.Serializable{
    private int teamId;
    private String longName;
    private Set<Player> players = new HashSet<Player>(0);

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "TEAM_ID", unique = true, nullable = false)
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "player_team", joinColumns = {
            @JoinColumn(name = "TEAM_ID", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "PLAYER_ID",
                    nullable = false, updatable = false) })
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
