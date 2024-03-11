package web.Model;

public class Car {

    private Long id;
    private String model;
    private int year;
    private int horsepower;

    public Car() {
    }

    public Car(Long id, String model, int year, int horsepower) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.horsepower = horsepower;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Car:" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", horsepower=" + horsepower;
    }
}