package lesson7.interfases;

public class SecurityMonitoringSystem implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал");
    }
}
