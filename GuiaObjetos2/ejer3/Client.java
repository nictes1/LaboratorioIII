package GuiaObjetos2.ejer3;

import java.util.UUID;

public class Client {

    private UUID idClient;
    private char gender;
    private String name;

    public Client() {
    }

    public Client(char gender, String name) {
        this.idClient = UUID.randomUUID();
        this.gender = gender;
        this.name = name;
    }

    public UUID getIdClient() {
        return idClient;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
