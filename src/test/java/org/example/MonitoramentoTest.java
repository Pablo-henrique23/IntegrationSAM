package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class MonitoramentoTest {

    @Test
    public void deveSerSingleton() {
        CentralMonitoramento central1 = CentralMonitoramento.getInstance();

        CentralMonitoramento central2 = CentralMonitoramento.getInstance();

        assertSame(central1, central2);
    }

    @Test
    public void deveCriarMonitoramentoCardiaco() {
        FabricaAbstrata fabrica = new FabricaUTI();

        Dispositivo dispositivo = new Monitor();

        Monitoramento monitoramento = fabrica.criarMonitoramento(dispositivo);

        assertEquals("Monitoramento cardíaco: Monitorando através de monitor hospitalar", monitoramento.monitorar());
    }

    @Test
    public void deveCriarMonitoramentoCardiacoComTelemetria() {
        FabricaAbstrata fabrica = new FabricaUTI();

        Dispositivo dispositivo = new Telemetria();

        Monitoramento monitoramento = fabrica.criarMonitoramento(dispositivo);

        assertEquals("Monitoramento cardíaco: Monitorando através de telemetria", monitoramento.monitorar());
    }

    @Test
    public void deveCriarMonitoramentoSinaisVitais() {
        FabricaAbstrata fabrica = new FabricaEnfermaria();

        Dispositivo dispositivo = new Monitor();

        Monitoramento monitoramento = fabrica.criarMonitoramento(dispositivo);

        assertEquals("Monitoramento de sinais vitais: Monitorando através de monitor hospitalar", monitoramento.monitorar());
    }

    @Test
    public void deveCriarMonitoramentoSinaisVitaisComTelemetria() {
        FabricaAbstrata fabrica = new FabricaEnfermaria();

        Dispositivo dispositivo = new Telemetria();

        Monitoramento monitoramento = fabrica.criarMonitoramento(dispositivo);

        assertEquals("Monitoramento de sinais vitais: Monitorando através de telemetria", monitoramento.monitorar());
    }

    @Test
    public void deveAdicionarMonitoramentoNaCentral() {
        CentralMonitoramento central = CentralMonitoramento.getInstance();

        int quantidadeInicial = central.quantidadeMonitoramentos();

        FabricaAbstrata fabrica = new FabricaUTI();

        Monitoramento monitoramento = fabrica.criarMonitoramento(new Monitor());

        central.adicionarMonitoramento(monitoramento);

        assertEquals(quantidadeInicial + 1, central.quantidadeMonitoramentos());
    }
}