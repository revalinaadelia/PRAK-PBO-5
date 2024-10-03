public class Cat extends Animal implements Pet {
    private String name;

    public Cat() {
        super(4);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Sedang bermain tali.");
    }

    @Override
    public void eat() {
        System.out.println("Sedang makan ikan.");
    }
}
