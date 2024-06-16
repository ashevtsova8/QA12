package lesson7.interfases;

public class Main {
    private static final int ERROR_COUNT = 10;

//    startMonitoring();нельзя вызвать метод анонимного класса за пределами метода, в котором он
//    определен

    public static void main(String[] args) {
        Book book = new Book("ksdevn", "fjedbv", 2);
        book.print();
        System.out.println("___________");
        book.print1();

//        Printable printable = new Printable(); нельзя создать экземляр интерфейса

        Journal journal = new Journal("vsdns");
        journal.print();
        journal.print1();

        Printable.read();

        GeneralMonitoringSystem generalMonitoringSystem = new GeneralMonitoringSystem();
        ErrorMonitoringSystem errorMonitoringSystem = new ErrorMonitoringSystem();
        SecurityMonitoringSystem securityMonitoringSystem = new SecurityMonitoringSystem();
        generalMonitoringSystem.startMonitoring();
        errorMonitoringSystem.startMonitoring();
        securityMonitoringSystem.startMonitoring();

        MonitoringSystem general = new MonitoringSystem() {
            static int count;
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общий стартовал");
                invokeCounter();
                invokeCounter();
                invokeCounter();
            }

            static void invokeCounter() {
                count++;
                System.out.println("Текущее значение счётчика - " + count);
            }

        };

        MonitoringSystem error = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг ошибок стартовал");
            }
        };

        MonitoringSystem security = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал");
            }
        };
        general.startMonitoring();
        error.startMonitoring();
        security.startMonitoring();
        general.startMonitoring();


    }
}
