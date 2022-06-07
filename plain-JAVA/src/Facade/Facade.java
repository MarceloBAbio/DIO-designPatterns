package Facade;

public class Facade {
    public void migrateClient(String name, String cep) {

        String city = CepApi.getInstance().getCity(cep);
        String state = CepApi.getInstance().getState(cep);
        CrmService.saveClient(name, cep, state, city);
    }
}
