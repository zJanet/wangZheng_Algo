package chper02_puringCoding.parttenFinding;

public class BeerBottleAndCap {
public static void main(final String[] args) {
    System.out.println("++++++++");

    System.out.println(beerCanDrink(5));
    System.out.println("---------");

}

public static int beerCanDrink(final int x) {
    // number of beer one can drank
    int count = x;
    // number of bear bottle
    int bottle = x;
    // number of bear cap
    int cap = x;

    while (bottle >= 3 || cap >= 7) {
        // check how many beer can get by bear bottle
        while (bottle >= 3) {
            final int newBeer = bottle / 3;
            // reduce used beer bottle
            // bottle -= newBeer * 3;
            bottle %= 3;
            // increase bear can drink
            count += newBeer;
            // increase number of bottle
            bottle += newBeer;
            // increase number of cap
            cap += newBeer;
        }

        // check how many beer can get by beer cap
        while (cap >= 7) {
            final int newBeer = cap / 7;
            // deduct used beer cap
            // cap -= newBeer * 7;
            cap %= 7;
            // increase bear can drink
            count += newBeer;
            // increase number of bottle
            bottle += newBeer;
            // increase number of cap
            cap += newBeer;

        }
    }
    return count;

}
}