package org.example;

public class Telemetria implements Dispositivo {

    @Override
    public String monitorar() {
        return "Monitorando através de telemetria";
    }
}