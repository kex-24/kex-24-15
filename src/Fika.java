import java.util.ArrayList;

public class Fika {
    private String location;
    private String time;
    private boolean isCoffeeAvailable;
    private boolean isSnackAvailable;
    private int numberOfParticipants;
    private ArrayList<Participant> part;
    private Invatation i;

    public Fika(String location, String time, boolean isCoffeeAvailable, boolean isSnackAvailable, int numberOfParticipants) {
        this.location = location;
        this.time = time;
        this.isCoffeeAvailable = isCoffeeAvailable;
        this.isSnackAvailable = isSnackAvailable;
        this.numberOfParticipants = numberOfParticipants;
        this.part = new ArrayList<>();
        
    }

    public void addParticipant(Participant a){
        if(!part.contains(a)){
            part.add(a);
        }
    }

    public void removeParticipant(Participant a){
        if(part.contains(a)){
            part.remove(a);
        }
    }

    public void showFikaDetails(){
        System.out.println("Location: " + location);
        System.out.println("Start time: " + time);
        System.out.println("There is coffee: " + isCoffeeAvailable);
        System.out.println("There will be snacks: " + isSnackAvailable);
        System.out.println("Number of people present: " + numberOfParticipants);
        System.out.println("All participants: ");
        for (Participant p : part) {
            System.out.println("\t" + p.toString());
        }
    }

    public void sendInvatations(){
        for (Participant p : part) {
            p.getInvatation(i);
        }
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public boolean isCoffeeAvailable() {
        return isCoffeeAvailable;
    }

    public boolean isSnackAvailable() {
        return isSnackAvailable;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public ArrayList<Participant> getPart() {
        return part;
    }

    public Invatation getI() {
        return i;
    }
    
    
}
