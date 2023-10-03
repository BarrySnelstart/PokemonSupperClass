public abstract class BasePokemon {
    private String name;
    private String sound;
    private String type;
    private int hitPoints;


    public BasePokemon(String name, String sound, String type, int hitPoints) {
        this.name = name;
        this.sound = sound;
        this.hitPoints = hitPoints;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {

        return type;
    }

    public void setHitpoints(int hitpoints) {
        this.hitPoints = hitpoints;
    }

    public void feedPokemon(String type, String berry) {
        switch (type) {
            case "fire":
                System.out.println(name + "currently has : " + hitPoints + "hitPoints  and eats a " + berry);
                if (berry.equals("fireberry")) {
                    System.out.println(berry + " grands 20 hitPoints");
                    hitPoints = hitPoints + 20;
                } else {
                    System.out.println(berry + " grands 10 hitPoints");
                    hitPoints = hitPoints + 10;
                }
            case "Water":
                System.out.println(name + "currently has : " + hitPoints + "hitPoints  and eats a " + berry);
                if (berry.equals("Waterberry")) {
                    System.out.println(berry + " grands 20 hitPoints");
                    hitPoints = hitPoints + 20;
                } else {
                    System.out.println(berry + " grands 10 hitPoints");
                    hitPoints = hitPoints + 10;
                }
                break;

            case "Grass":
                System.out.println(name + "currently has : " + hitPoints + "hitPoints  and eats a " + berry);
                if (berry.equals("Grassberry")) {
                    System.out.println(berry + " grands 20 hitPoints");
                    hitPoints = hitPoints + 20;
                } else {
                    System.out.println(berry + " grands 10 hitPoints");
                    hitPoints = hitPoints + 10;
                }
                break;
            case "Electric":
                System.out.println(name + "currently has : " + hitPoints + "hitPoints  and eats a " + berry);
                if (berry.equals("Electricberry")) {
                    System.out.println(berry + " grands 20 hitPoints");
                    hitPoints = hitPoints + 20;
                } else {
                    System.out.println(berry + " grands 10 hitPoints");
                    hitPoints = hitPoints + 10;

                }
                break;
            default:
                System.out.println("You killed your pokemon, you fed hem a wrong berry!");
                break;


        }
        System.out.println(name + " now has :" + hitPoints + " Total hitPoints");
    }

    public void printName() {
        System.out.println(name);
    }

    public void playSound() {
        System.out.println("The Pokemon  " + name + "makes the following sound " + sound);
    }

    public String getName() {
        return name;
    }

    public abstract void battleCry();

    public String getSound() {
        return sound;
    }

}
