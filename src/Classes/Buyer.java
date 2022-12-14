package Classes;

public class Buyer {
    private String name;
    private double budget;

    //Constructor


    public Buyer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }
    public Buyer(){

    }
    //Getter&Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget -= budget;
    }
}
