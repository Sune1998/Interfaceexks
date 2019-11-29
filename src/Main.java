public class Main {

    public static void main(String[] args) {
       Pokemon pikachu =  new Pokemon();
       pikachu.setNavn("Pikachu");
       pikachu.setNumPokedex(82);
       pikachu.setSex("han");
       pikachu.setDmg((short)80);

        System.out.println(pikachu.toString());

    }
}

