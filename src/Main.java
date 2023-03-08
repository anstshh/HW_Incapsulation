import java.util.Random;

public class Main {

    public static final Random RANDOM = new Random();
    public static void main(String[] args) {

        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent hermione = generateGryffindorStudent("Гермиона Грейнджер");
        RavenclawStudent padma = generateRavenclawStudent("Падма Патил");
        SlytherinStudent draco= generateSlytherinStudent("Драко Малфой");
        HufflepuffStudent zakharia = generateHufflepuffStudent("Захария Смит");

        harry.print();
        hermione.print();
        padma.print();
        draco.print();
        zakharia.print();

        harry.compareHogwarts(padma);
        harry.compareGryffindor(hermione);
    }

    private static GryffindorStudent generateGryffindorStudent (String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent (String name) {
        return new RavenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static SlytherinStudent generateSlytherinStudent (String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static HufflepuffStudent generateHufflepuffStudent (String name) {
        return new HufflepuffStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

}