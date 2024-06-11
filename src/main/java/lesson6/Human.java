package lesson6;

public class Human extends Creature {
    private String job;

    public Human(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public Human(){
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    //перегрузка методов(2 метода с одинаковым названием)
    public void work() {
        System.out.println("I'm " + getName() + ", i'm working as " + job);
    }

    public void work(String x) {
        System.out.println("I'm " + getName() + ", i'm working as " + job);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating like a gentleman!");
    }
}
