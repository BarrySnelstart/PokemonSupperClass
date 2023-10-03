public class Grass extends BasePokemon {
    private String nameOfGrassAttack;
    private String grassWeaknes;


    public Grass(String name,String type,int hitPoints, String sound, String nameOfGrassAttack, String Grassweaknes) {
        super(name, sound, type, hitPoints);
        this.nameOfGrassAttack = nameOfGrassAttack;
        this.grassWeaknes = grassWeaknes;
    }
    public String getNameOfGrassAttack() {
        return nameOfGrassAttack;
    }
    @Override
    public void playSound(){
        System.out.println("This Grass Pokemon " + getName() +" makes the following " +getSound());
    }
    public void battleCry (){
        System.out.println(getName() + " main attack is "+getNameOfGrassAttack() + " And when it charges it makes this sound : " + getSound());
    }

    // ** Not In Use
//    public void setNameOfGrassAttack(String nameOfGrassAttack) {
//        this.nameOfGrassAttack = nameOfGrassAttack;
//    }
//
//    public String getGrassWeaknes() {
//        return grassWeaknes;
//    }
//
//    public void setGrassWeaknes(String grassWeaknes) {
//        this.grassWeaknes = grassWeaknes;
//    }
}


