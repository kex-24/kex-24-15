public class Main {


    public static void main(String[] args) {
        Fika f = new Fika("Nils Enlund", "10:00", true, true, 10);

        f.addParticipant(new Participant("Stella", "rainbowCookie"));
        f.addParticipant(new Participant("Johanna", "chokladBollar"));
        f.addParticipant(new Participant("Meya", "muffins"));
        f.addParticipant(new Participant("Anne", "gifflar"));

        f.sendInvatations();

        f.showFikaDetails();

    }
}
