package br.exemplo.arrays;

public class Presenca {
    private String data;
    private boolean presente;

    public Presenca(String data, boolean presente){
        setData(data);
        setPresente(presente);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
}
