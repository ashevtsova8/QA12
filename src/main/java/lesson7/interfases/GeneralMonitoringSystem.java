package lesson7.interfases;

public class GeneralMonitoringSystem implements MonitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общий стартовал");
    }
}
