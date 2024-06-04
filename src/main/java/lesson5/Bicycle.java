package lesson5;

public class Bicycle {
    private String model;
    private int weight;
    private int seatPostDiameter;

    Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    //этот код не скомпилируется, т.к. в статическом методе внешнего класса нельзя создать объект
    // внутреннего класса
//    public static Seat createSeat() {
//        return new Seat();
//    }

    public Seat createSeat() {
        return new Seat();
    }

    public class SteetingWheel {
        public void right(){
            System.out.println("Руль вправо");
        }

        public void left(){
            System.out.println("Руль влево");
        }
    }

    public class Seat {
//        public static String x = "";//нельзя создавать статические переменные и методы во
//        внутреннем классе до Java16

        public void up(){
            System.out.println("Сидение поднято выше.");
        }

        public void down(){
            System.out.println("Сидение опущено ниже.");
        }

        public void getSeatParameter(){
            //у внутреннего класса есть доступ к переменным внешнего класса(даже private)
            System.out.println("Параметр сидения: " + Bicycle.this.seatPostDiameter);
        }
    }
}
