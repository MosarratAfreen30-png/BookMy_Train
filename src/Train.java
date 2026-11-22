public class Train {
    private int trainId;
    private String name;
    private String source;
    private String destination;
    private int totalseats;
    private int availableSeats;


    public Train(int trainId, String name, String source,
                 String destination, int totalseats) {
        this.trainId = trainId;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.totalseats = totalseats;
        this.availableSeats = totalseats;
    }

    public int getTrainId()
    {
        return trainId;
    }

    public void setTrainId(int trainId)
    {
        this.trainId = trainId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public int getTotalseats()
    {
        return totalseats;
    }

    public void setTotalseats(int totalseats)
    {
        this.totalseats = totalseats;
    }

    public int getAvailableSeats()
    {
        return availableSeats;
    }

    public void setAvailableSeat(int availableSeat) {
        this.availableSeats = availableSeats;
    }
    public boolean bookSeats( int count)
        {
            if (count <= availableSeats) {
                availableSeats -= count;
                return true;
            }
            return false;
        }
        public void cancelSeats( int count)
        {
            availableSeats += count;
        }
        @Override
        public String toString () {
            return trainId + " | " + name + " | " + source + " -> " + destination + " Seats Avilable: " + availableSeats;

        }

    }

