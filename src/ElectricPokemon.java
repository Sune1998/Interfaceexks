public class ElectricPokemon extends Pokemon implements EX, Canfly {
    public void spyild() {
        System.out.println("FireBall!");
    }

    @Override
    public void ex() {
        System.out.println("im cool bitch!");
    }
    public void fly() {
        System.out.println("i use my vings to fly");
    }
}
