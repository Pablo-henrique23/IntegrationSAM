package org.example;

public abstract class Monitoramento {

    protected Dispositivo dispositivo;

    public Monitoramento(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract String monitorar();
}