public class Pokemon {
    private String navn;
    private int numPokedex;
   private short dmg;
   private String type;
    private String sex;
    private String evolvedfrom;
    private String evovedto;
public Pokemon() {}
public boolean atack() { return false;}
@Override
public String toString() {
    String description =
            "Pokemon" + navn + "nr." + numPokedex + "er en" + sex + ".";
    return description;
}
    public String  getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public short getDmg() {
        return dmg;
    }

    public void setDmg(short dmg) {
        this.dmg = dmg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEvolvedfrom() {
        return evolvedfrom;
    }

    public void setEvolvedfrom(String evolvedfrom) {
        this.evolvedfrom = evolvedfrom;
    }

    public String getEvovedto() {
        return evovedto;
    }

    public void setEvovedto(String evovedto) {
        this.evovedto = evovedto;
    }



}
