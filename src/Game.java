import java.util.ArrayList;

public class Game {
    private String schedule;
    private String venue;
    private String time;
    private ArrayList<Team> participatingTeams;

    public Game() {
        participatingTeams = new ArrayList<>();
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Team> getParticipatingTeams() {
        return participatingTeams;
    }

    public void addParticipatingTeam(Team team) {
        this.participatingTeams.add(team);
    }

    public void removeParticipatingTeam(Team team) {
        this.participatingTeams.remove(team);
    }
}