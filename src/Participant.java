public class Participant {
    private String name, favoriteFikaSnack;
    private Invatation i;

    public Participant(String name, String favoriteFikaSnack) {
        this.name = name;
        this.favoriteFikaSnack = favoriteFikaSnack;
    }

    public void getInvatation(Invatation i){
        this.i = i;
    }

    @Override
    public String toString() {
        return "Name: " + name + "     Favorite snack: " + favoriteFikaSnack;
    }

    
}
