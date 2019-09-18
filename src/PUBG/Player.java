package PUBG;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Player {
    private String playerName;
    private String userName;
    private String level;
    private int score;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player(String playerName, String userName, String level, int score) {
        this.playerName = playerName;
        this.userName = userName;
        this.level = level;
        this.score = score;
    }


    @Override
    public String toString() {
        return getPlayerName() + "\t" + getUserName() + "\t" + getLevel() + "\t" + getScore();
    }
}
class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine().trim();
        Player[] players = new Player[n];
        if(n>0 && n<=100)
        {
            for (int i = 0; i < n; i++) {
                String playerName = sc.nextLine();
                String userName = sc.nextLine();
                String level = sc.nextLine();
                int score = sc.nextInt();
                sc.nextLine().trim();
                players[i] = new Player(playerName, userName, level, score);
            }
            System.out.println("PlayerName\tUserName\tLevel\tScore");
            for (Player player: players) {
                System.out.println(player);

            }

            }
        sc.close();
        }
    }
