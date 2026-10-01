package org.example;

public class MonitoramentoCardiaco extends Monitoramento {

    public MonitoramentoCardiaco(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public String monitorar() {
        return "Monitoramento cardíaco: " + dispositivo.monitorar();
    }
}