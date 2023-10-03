public class Water extends BasePokemon {
    private String nameOfWaterAttack;
    private String WaterWeakness;

    public String getNameOfWaterAttack() {
        return nameOfWaterAttack;
    }
    public Water(String name,String type, int hitPoints,  String sound, String nameOfWaterAttack, String WaterWeakness) {
        super(name, sound, type, hitPoints);
    }
    @Override
    public void playSound(){
        System.out.println("This Water Pokemon " + getName() +" makes the following " +getSound());
    }
    public void battleCry (){
        System.out.println(getName() + "main attack is "+getNameOfWaterAttack() + "And when it charges it makes this sound : " + getSound());
    }

        // ** Not in User
//    public void setNameOfWaterAttack(String nameOfWaterAttack) {
//        this.nameOfWaterAttack = nameOfWaterAttack;
//    }
//
//    public String getWaterWeakness() {
//        return WaterWeakness;
//    }
//
//    public void setWaterWeakness(String waterWeakness) {
//        WaterWeakness = waterWeakness;
//    }
}
