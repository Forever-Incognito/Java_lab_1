package Task11;

public class Task11 {
    public static void main(final String[] args) {

        final Driver[] drivers = new Driver[2];
        drivers[0] = new Driver("Andrii", "+380961100321");
        drivers[1] = new Driver("Mark", "+380671155583");
        final Taxi taxi = new Taxi("Tesla", "AA4567MH", drivers, "666");
        final Order order = new Order(taxi, 123, 4, 25);

        System.out.println(order);
    }
}
