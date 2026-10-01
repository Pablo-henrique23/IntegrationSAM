package org.example;

import java.util.ArrayList;
import java.util.List;

public class CentralMonitoramento {

    private static CentralMonitoramento instancia;

    private List<Monitoramento> monitoramentos;

    private CentralMonitoramento() {
        monitoramentos = new ArrayList<>();
    }

    public static CentralMonitoramento getInstance() {
        if (instancia == null) {
            instancia = new CentralMonitoramento();
        }

        return instancia;
    }

    public void adicionarMonitoramento(Monitoramento monitoramento) {
        monitoramentos.add(monitoramento);
    }

    public int quantidadeMonitoramentos() {
        return monitoramentos.size();
    }
}