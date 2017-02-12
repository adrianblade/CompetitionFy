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
    private Set<Person> persons = new HashSet<Person>(0);

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "TEAM_ID", unique = true, nullable = false)
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "person_team", joinColumns = {
            @JoinColumn(name = "TEAM_ID", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "PERSON_ID",
                    nullable = false, updatable = false) })
    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }
}
