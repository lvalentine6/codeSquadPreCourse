package mission6.problem1;

public class MainBoard {

    public static void main(String[] args) {

        Player player = new Player(new BeginnerLevel());
        player.play(1);
        player.upgradeLevel(new AdvancedLevel());
        player.play(2);
        player.upgradeLevel(new SuperLevel());
        player.play(3);

    }
}
