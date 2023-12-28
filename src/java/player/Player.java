import java.util.ArrayList;
import java.util.List;

public class Player {
    private int lives;
    private List<Weapon> weapons;
    private int windowSize;

    public Player() {
        this.lives = 3;
        this.weapons = new ArrayList<>();
        this.windowSize = 1;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public int getWindowSize() {
        return windowSize;
    }

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }
}