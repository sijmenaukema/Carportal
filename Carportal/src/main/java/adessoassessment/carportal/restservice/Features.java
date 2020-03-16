package adessoassessment.carportal.restservice;

public class Features {
    private final long id;
    private final String name;
    private int cost;
    private String models;

    public Features(long id, String name, int cost, String models) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.models = models;
    }


    public long getId() {
        return id;
    }

    public String getFeatures() {
        return name;
    }
    public String getModels() {
        return models;
    }
}
