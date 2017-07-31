package israel.animalsounds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackeru on 29/05/2017.
 */

public class AnimalDataSource {
    public static List<Animal> getAnimals() {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal(R.drawable.monkey, R.raw.monkey));
        animals.add(new Animal(R.drawable.monkey2, R.raw.monkey2));
        animals.add(new Animal(R.drawable.duck, R.raw.duck));
        animals.add(new Animal(R.drawable.duck2, R.raw.duck2));
        animals.add(new Animal(R.drawable.bear, R.raw.bear));
        animals.add(new Animal(R.drawable.bear2, R.raw.bear2));
        animals.add(new Animal(R.drawable.cat, R.raw.cat));
        animals.add(new Animal(R.drawable.cat2, R.raw.cat2));
        animals.add(new Animal(R.drawable.horse, R.raw.horse));
        animals.add(new Animal(R.drawable.horse2, R.raw.horse2));
        animals.add(new Animal(R.drawable.wolf, R.raw.wolf));
        animals.add(new Animal(R.drawable.wolf2, R.raw.wolf2));
        animals.add(new Animal(R.drawable.bunnie, R.raw.rabbit));
        animals.add(new Animal(R.drawable.bunnie2, R.raw.rabbit2));
        animals.add(new Animal(R.drawable.frog, R.raw.frog));
        animals.add(new Animal(R.drawable.frog2, R.raw.frog2));
        animals.add(new Animal(R.drawable.dolphin, R.raw.dolphins));
        animals.add(new Animal(R.drawable.dolphin2, R.raw.dolphins2));
        animals.add(new Animal(R.drawable.tiger, R.raw.tiger));
        animals.add(new Animal(R.drawable.tiger2, R.raw.tiger2));
        animals.add(new Animal(R.drawable.eagle, R.raw.eaglet));
        animals.add(new Animal(R.drawable.eagle2, R.raw.eaglet2));
        animals.add(new Animal(R.drawable.seal, R.raw.seal));
        animals.add(new Animal(R.drawable.seal2, R.raw.seal2));
        animals.add(new Animal(R.drawable.lion,R.raw.lion));
        animals.add(new Animal(R.drawable.lion2,R.raw.lion2));
        animals.add(new Animal(R.drawable.hawk,R.raw.hawk));
        animals.add(new Animal(R.drawable.hawk2,R.raw.hawk2));


        return animals;
    }
}
