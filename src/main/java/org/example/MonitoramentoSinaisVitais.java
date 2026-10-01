package org.example;

public class MonitoramentoSinaisVitais extends Monitoramento {

    public MonitoramentoSinaisVitais(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public String monitorar() {
        return "Monitoramento de sinais vitais: " + dispositivo.monitorar();
    }
}