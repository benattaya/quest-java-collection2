import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        Collections.sort(heroes);
        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)


        System.out.println("\nOrder by name:");
        showList(heroes);


        Comparator<Hero> comparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero h1, Hero h2) {
                return h1.getAge() - h2.getAge();
            }
        };
        Collections.sort(heroes, comparator);
        // TODO 2: Add a Comparator and sort by age (descending)


        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}