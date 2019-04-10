package Domain;

public class Event extends Entity{
    private String name, day, duration, startTime;
    private int id;

    public Event(int id, String name, String day, String duration, String startTime) {
        super();
        this.name = name;
        this.day = day;
        this.duration = duration;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getDate() {
        return null;
    }

    public void setId(int id) {
        this.id = id;
    }
}
