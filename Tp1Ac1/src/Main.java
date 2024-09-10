public class Main {
    public static void main(String[] args) {
        Spot s1 = new Spot(10, 10);
        Spot s2 = new Spot(20, 20);

        s1.add(2);
        System.out.println("Después de sumar 2: " + s1.getX() + " " + s1.getY());

        s1.addSpot(s2);
        System.out.println("Después de sumar el punto s2: " + s1.getX() + " " + s1.getY());

        System.out.println("DIstacia : "  + s1.distance(s2));
    }
}