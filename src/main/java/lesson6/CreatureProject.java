package lesson6;

public class CreatureProject {
    public static void main(String[] args) {
        Creature creature = new Creature();//существо
        Human human = new Human();//человек
        Cat cat = new Cat();//кот

        System.out.println(creature instanceof Creature);
        System.out.println(human instanceof Creature);
        System.out.println(creature instanceof Human);
        System.out.println(cat instanceof Object);
//        System.out.println(human instanceof Cat);//классы-потомки не связаны друг с другом

        creature.identifyCreature(cat);
    }
}
