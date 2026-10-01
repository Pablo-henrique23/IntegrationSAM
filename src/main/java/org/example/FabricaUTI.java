package org.example;

public class FabricaUTI implements FabricaAbstrata {

    @Override
    public Monitoramento criarMonitoramento(Dispositivo dispositivo) {
        return new MonitoramentoCardiaco(dispositivo);
    }
}