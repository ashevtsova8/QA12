package lesson15;

public interface Printable {
    void print(String s);

    public static void main(String[] args) {
        Printable printable = s -> System.out.println(s);
        printable.print("vdsknvsv");
        printable.print("vdskne");
        printable.print("vdssv");
    }
}
