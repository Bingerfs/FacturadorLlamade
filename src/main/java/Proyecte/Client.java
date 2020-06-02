package Proyecte;

public class Client {
    public String name;
    public String ci;
    public String address;


    public Client() {
    }


    public Client(String name, String ci, String address) {
        this.name = name;
        this.ci = ci;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getCi(){
        return ci;
    }
}
