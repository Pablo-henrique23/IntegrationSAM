package org.example;

public class FabricaEnfermaria implements FabricaAbstrata {

    @Override
    public Monitoramento criarMonitoramento(Dispositivo dispositivo) {
        return new MonitoramentoSinaisVitais(dispositivo);
    }
}