package lesson9.exception;

public class Main {
    public static void main(String[] args) throws DogIsNotReadyException {
        Dog dog = new Dog("Мухтар");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение. Ошейник надет? " + dog.isCollarPutOn() +
                    "\nПоводок надет? " + dog.isLeashPutOn() +
                    "\nНамордник надет? " + dog.isMuzzlePutOn());
        }
        dog.putLeash();
        dog.walk();
    }
}
