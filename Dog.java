public class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
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
        System.out.println("Sedang bermain bola.");
    }

    @Override
    public void eat() {
        System.out.println("Sedang makan tulang.");
    }
}
