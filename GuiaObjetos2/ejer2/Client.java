package GuiaObjetos2.ejer2;

public class Client {
    private String id; //compuesto por letras y numero
    private String name;
    private String email;
    private double percentage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public Client() {
    }


    public Client(String id, String name, String email, double percentage) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.percentage = percentage;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
