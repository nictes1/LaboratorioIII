package GuiaObjetos2.ejer2;

import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private String email;
    private double percentage;

    public Client() {
    }


    public Client(String name, String email, double percentage) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.percentage = percentage;
    }

    public String getId() {
        return id.toString();
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
