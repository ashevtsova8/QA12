package lesson8.object;

public class ClassProject2 {
    public static void main(String[] args) {
        int[] array =  new int[4];

        printInfo(array.getClass());

        printInfo(Integer.class);
        printInfo(double.class);
        printInfo(int.class);


    }

    private static void printInfo(Class array) {
        System.out.println("Class name " + array.getName());
        System.out.println("Is Array " + array.isArray());
        System.out.println("Is Interface " + array.isInterface());
        System.out.println("Is Primitive " + array.isPrimitive());
    }
}
