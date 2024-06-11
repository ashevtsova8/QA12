package lesson7.interfases;

public class ErrorMonitoringSystem implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг ошибок стартовал");
    }
}
