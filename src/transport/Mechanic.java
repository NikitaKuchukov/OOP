package transport;


public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void passTheDiagnostic() {
        System.out.println("Pass the diagnostic");
    }

    public void fixTheCar() {
        System.out.println("Car Under repair");
    }

    @Override
    public String toString() {
        return "{Mechanic: " +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
