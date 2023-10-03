public class Electric extends BasePokemon {
    private String nameOfElectricAttack;
    private String ElectricWeakness;
    private String secondType;

    public String getNameOfElectricAttack() {
        return nameOfElectricAttack;
    }

    public Electric(String name,String type,int hitPoints,String sound, String nameOfElectricAttack, String ElectricWeakness) {
        super(name, sound, type,hitPoints);
    }
    public Electric(String name,String type,int hitPoints,String sound, String nameOfElectricAttack, String ElectricWeakness, String secondType) {
        super(name, sound, type,hitPoints);
        this.secondType = secondType;
    }
    @Override
    public void playSound(){
        System.out.println("This Electric Pokemon " + getName() +" makes the following sound" +getSound());
    }
    public void battleCry (){
        System.out.println(getName() + " main attack is "+getNameOfElectricAttack() + " And when it charges it makes this sound : " + getSound());
    }

    public String getSecondType() {
        return secondType;
    }
    // *** Not in User
//    public void setNameOfElectricAttack(String nameOfElectricAttack) {
//        this.nameOfElectricAttack = nameOfElectricAttack;
//    }
//
//    public String getElectricWeakness() {
//        return ElectricWeakness;
//    }
//
//    public void setElectricWeakness(String electricWeakness) {
//        ElectricWeakness = electricWeakness;
//    }
}

