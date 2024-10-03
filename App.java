public class App {
    public static void main(String[] args) throws Exception {
        Spider Spiderman = new Spider();
        Spiderman.eat();;

        Dog Hery = new Dog();
        Hery.setName("Hery");
        System.out.println("Saya adalah " + " " + Hery.getName());
        Hery.play();
        Hery.eat();
        Hery.walk();
        
        Cat Miaw = new Cat();
        Miaw.setName("Miaw");
        System.out.println("Saya adalah " + " " + Miaw.getName());
        Miaw.play();
        Miaw.eat();
        Miaw.walk();
    }
}
