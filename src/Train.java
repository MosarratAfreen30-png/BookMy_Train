public class Train {
    private int trainId;
    private String name;
    private String source;
    private String destination;
    private int totalseats;
    private int availableSeat;

    public Train(int trainId, String name, String source, String destination, int totalseats, int availableSeat) {
        this.trainId = trainId;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.totalseats = totalseats;
        this.availableSeat = availableSeat;
    }
}
