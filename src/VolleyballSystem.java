import java.util.ArrayList;
import java.util.Scanner;

public class VolleyballSystem {
    private ArrayList<User> users;
    private ArrayList<Team> teams;
    private ArrayList<Game> games;
    private Scanner scanner;
    private boolean isLoggedIn; 

    public VolleyballSystem() {
        users = new ArrayList<>();
        teams = new ArrayList<>();
        games = new ArrayList<>();  
        scanner = new Scanner(System.in);
        isLoggedIn = false;  
        initializeTeams();  
        initializeGames();  
    }

    private void initializeTeams() {
        Team team1 = new Team();
        team1.setTeamName("Hipass");
        team1.setCoach("김종민");
        team1.setHomeStadium("김천 실내체육관");
        initializePlayersForTeam(team1);
        teams.add(team1);

        Team team2 = new Team();
        team2.setTeamName("PinkSpiders");
        team2.setCoach("아본단자");
        team2.setHomeStadium("인천 삼산체육관");
        initializePlayersForTeam(team2);
        teams.add(team2);

        Team team3 = new Team();
        team3.setTeamName("Hillstates");
        team3.setCoach("강성형");
        team3.setHomeStadium("수원 실내체육관");
        initializePlayersForTeam(team3);
        teams.add(team3);

        Team team4 = new Team();
        team4.setTeamName("KGC");
        team4.setCoach("고희진");
        team4.setHomeStadium("대전 충무체육관");
        initializePlayersForTeam(team4);
        teams.add(team4);

        Team team5 = new Team();
        team5.setTeamName("GS");
        team5.setCoach("차상현");
        team5.setHomeStadium("서울 장충체육관");
        initializePlayersForTeam(team5);
        teams.add(team5);

        Team team6 = new Team();
        team6.setTeamName("IBK");
        team6.setCoach("김호철");
        team6.setHomeStadium("화성 실내체육관");
        initializePlayersForTeam(team6);
        teams.add(team6);

        Team team7 = new Team();
        team7.setTeamName("Peppers");
        team7.setCoach("아헨 킴");
        team7.setHomeStadium("광주 페퍼스타디움");
        initializePlayersForTeam(team7);
        teams.add(team7);
    }
    
    private void initializePlayersForTeam(Team team) {
        if (team.getTeamName().equals("Hipass")) {
            Player parkJungAh = new Player();  
            parkJungAh.setPlayerName("박정아");
            parkJungAh.setJerseyNumber(9);
            parkJungAh.setPosition("OH");
            parkJungAh.setTeam(team);
            team.addPlayer(parkJungAh);  
            
            Player baeYuna = new Player();  
            baeYuna.setPlayerName("배유나");
            baeYuna.setJerseyNumber(10);
            baeYuna.setPosition("MB");
            baeYuna.setTeam(team);
            team.addPlayer(baeYuna); 
        } else if (team.getTeamName().equals("PinkSpiders")) {
        	Player leeJuah = new Player();  
            leeJuah.setPlayerName("이주아");
            leeJuah.setJerseyNumber(4);
            leeJuah.setPosition("MB");
            leeJuah.setTeam(team);
            team.addPlayer(leeJuah);
            
            Player kimYeonKyung = new Player();  
            kimYeonKyung.setPlayerName("김연경");
            kimYeonKyung.setJerseyNumber(10);
            kimYeonKyung.setPosition("OH");
            kimYeonKyung.setTeam(team);
            team.addPlayer(kimYeonKyung); 
        }else if (team.getTeamName().equals("Hillstates")) {
            Player jeongJiyoon = new Player(); 
            jeongJiyoon.setPlayerName("정지윤");
            jeongJiyoon.setJerseyNumber(13);
            jeongJiyoon.setPosition("OH");
            jeongJiyoon.setTeam(team);
            team.addPlayer(jeongJiyoon);  
        }else if (team.getTeamName().equals("KGC")) {
            Player leeSoyeong = new Player();  
            leeSoyeong.setPlayerName("이소영");
            leeSoyeong.setJerseyNumber(1);
            leeSoyeong.setPosition("OH");
            leeSoyeong.setTeam(team);
            team.addPlayer(leeSoyeong); 
        }else if (team.getTeamName().equals("IBK")) {
            Player kimHeejin = new Player();  
            kimHeejin.setPlayerName("김희진");
            kimHeejin.setJerseyNumber(4);
            kimHeejin.setPosition("OH");
            kimHeejin.setTeam(team);
            team.addPlayer(kimHeejin); 
        }else if (team.getTeamName().equals("GS")) {
        	Player AnHyejin = new Player();  
            AnHyejin.setPlayerName("안혜진");
            AnHyejin.setJerseyNumber(7);
            AnHyejin.setPosition("S");
            AnHyejin.setTeam(team);
            team.addPlayer(AnHyejin);
            
            Player kangSoHwi = new Player();  
            kangSoHwi.setPlayerName("강소휘");
            kangSoHwi.setJerseyNumber(10);
            kangSoHwi.setPosition("OH");
            kangSoHwi.setTeam(team);
            team.addPlayer(kangSoHwi);  
        }else if (team.getTeamName().equals("Peppers")) {
            Player leeHanbi = new Player();  
            leeHanbi.setPlayerName("이한비");
            leeHanbi.setJerseyNumber(16);
            leeHanbi.setPosition("OH");
            leeHanbi.setTeam(team);
            team.addPlayer(leeHanbi);  
        }    
    }
    
    private void initializeGames() {
        Game game1 = new Game();
        game1.setSchedule("2023-07-10");
        game1.setVenue("김천 실내체육관");
        game1.setTime("14:00");
        game1.addParticipatingTeam(teams.get(0));  
        game1.addParticipatingTeam(teams.get(1));  
        games.add(game1);

        Game game2 = new Game();
        game2.setSchedule("2023-07-15");
        game2.setVenue("인천 삼산체육관");
        game2.setTime("16:00");
        game2.addParticipatingTeam(teams.get(2));  
        game2.addParticipatingTeam(teams.get(3));  
        games.add(game2);
    }


    public void start() {
        while (true) {
            if (!isLoggedIn) {  
                System.out.println("1. Log-in");
                System.out.println("2. Join");
                System.out.print("Enter your choice (1, 2): ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    User user = login();
                    if (user != null) {
                        isLoggedIn = true;  
                        menu();
                    }
                } else if (choice == 2) {
                    join();
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {  
                User user = getCurrentUser();
                if (user == null) {
                    isLoggedIn = false;
                } else {
                    menu();
                }
            }
        }
    }

    private User login() {
    	System.out.println("\n[Log-in]");
        System.out.print("Enter your ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getId().equals(id) && user.getPassword().equals(password)) {
                System.out.println("Login successful. Welcome, " + user.getUsername() + "!");
                return user;
            }
        }

        System.out.println("Invalid ID or password. Please try again.");
        System.out.println();

        return null;
    }

    private void join() {
        User newUser = new User();
        System.out.println("\n[Join]");
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        newUser.setUsername(username);

        System.out.print("Enter an ID: ");
        String id = scanner.nextLine();
        newUser.setId(id);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        newUser.setPassword(password);

        System.out.print("Enter your favorite team: ");
        String favoriteTeam = scanner.nextLine();
        newUser.setFavoriteTeam(favoriteTeam);

        users.add(newUser);

        System.out.println("Registration successful. Welcome, " + newUser.getUsername() + "!");
        System.out.println();
    }

    private User getCurrentUser() {
        System.out.print("Enter your ID: ");
        String id = scanner.nextLine();

        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }

        System.out.println("User not found.");
        System.out.println();

        return null;
    }

    private void menu() {
        while (true) {
            int choice = displayMainMenu();

            if (!processMenuChoice(choice)) {
                break;
            }
        }
    }

    private int displayMainMenu() {
    	System.out.println("\n[Main]");
        System.out.println("1. Team");
        System.out.println("2. Match Schedule");
        System.out.println("3. Ticket");
        System.out.println("4. Logout");
        System.out.print("Enter your choice (1, 2, 3, 4): ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    private boolean processMenuChoice(int choice) {
        switch (choice) {
            case 1:
                displayTeamMenu();
                return true;
            case 2:
            	displayMatchSchedule();
                return true;
            case 3:
            	System.out.println("\n[Ticket]");
            	System.out.println("(티켓 예매페이지로 이동)");
                return true;
            case 4:
            	System.out.println("\n[Log-out!]");
                isLoggedIn = false;  
                System.out.println();
                return false;
            default:
                System.out.println("Invalid choice. Please try again.");
                return true;
        }
    }

    private void displayTeamMenu() {
        while (true) {
            System.out.println("\n[Team]");

            for (int i = 0; i < teams.size(); i++) {
                Team team = teams.get(i);
                System.out.println((i + 1) + ". " + team.getTeamName());
            }

            System.out.println("0. Return to the main screen");
            System.out.println();

            System.out.print("Enter the team number: ");
            int teamNumber = scanner.nextInt();
            scanner.nextLine();

            if (teamNumber >= 1 && teamNumber <= teams.size()) {
                Team selectedTeam = teams.get(teamNumber - 1);

                System.out.println("\n[Team Information]");
                System.out.println("Team: " + selectedTeam.getTeamName());
                System.out.println("Coach: " + selectedTeam.getCoach());
                System.out.println("Home Stadium: " + selectedTeam.getHomeStadium());
                System.out.println();

                ArrayList<Player> players = selectedTeam.getPlayers();

                System.out.println("[Players]");
                for (Player player : players) {
                    System.out.println("Name: " + player.getPlayerName());
                    System.out.println("Jersey Number: " + player.getJerseyNumber());
                    System.out.println("Position: " + player.getPosition());
                    System.out.println();
                }
            } else if (teamNumber == 0) {
                System.out.println();
                break;
            } else {
                System.out.println("Invalid team number. Please try again.");
            }
        }
    }
    
    private void displayMatchSchedule() {
    	System.out.println("\n[Match Schedule]");
        for (int i = 0; i < games.size(); i++) {
            Game game = games.get(i);
            System.out.println("Match " + (i+1) + ":");
            System.out.println("Schedule: " + game.getSchedule());
            System.out.println("Venue: " + game.getVenue());
            System.out.println("Time: " + game.getTime());
            System.out.print("Teams: ");
            for (int j = 0; j < game.getParticipatingTeams().size(); j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(game.getParticipatingTeams().get(j).getTeamName());
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        VolleyballSystem volleyballSystem = new VolleyballSystem();
        volleyballSystem.start();
    }
}
