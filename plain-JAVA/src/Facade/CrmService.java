package Facade;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void saveClient(String name, String cep, String state, String city) {
        System.out.println("Name: " + name);
        System.out.println("Cep: " + cep);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Client saved.");
    }
}
