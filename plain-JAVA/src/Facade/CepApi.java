package Facade;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCity(String cep) {
        return "This City";
    }

    public String getState(String cep) {
        return "This State";
    }
}