package israel.animalsounds;

/**
 * Created by hackeru on 29/05/2017.
 */

public class Animal {
    private int imageResID;
    private int soundResID;

    public Animal(int imageResID, int soundResID) {
        this.imageResID = imageResID;
        this.soundResID = soundResID;
    }

    public int getImageResID() {
        return imageResID;
    }

    public int getSoundResID() {
        return soundResID;
    }
}
