public class Fire extends BasePokemon {
    private String nameOfFireAttack;
    private String fireWeakness;


    public Fire(String name,String type, int hitPoints,  String sound, String nameOfFireAttack, String fireWeakness) {
        super(name, sound, type,hitPoints);
        this.fireWeakness = fireWeakness;
        this. nameOfFireAttack = nameOfFireAttack;
    }

    public String getNameOfFireAttack() {
        return nameOfFireAttack;
    }

    @Override
    public void playSound(){
        System.out.println("This Fire Pokemon " + getName() +" makes the following " +getSound());
    }
    public void battleCry (){
        System.out.println(getName() + " main attack is "+getNameOfFireAttack() + " And when it charges it makes this sound : " + getSound());
    }
// ** Not in Use
//    public void setNameOfFireAttack(String nameOfFireAttack) {
//        this.nameOfFireAttack = nameOfFireAttack;
//    }
//
//    public String getFireWeakness() {
//        return fireWeakness;
//    }
//
//    public void setFireWeakness(String fireWeakness) {
//        this.fireWeakness = fireWeakness;
//    }
}
