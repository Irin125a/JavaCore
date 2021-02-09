package JavaCore.HomeWork4.Task2;

public class Main {
    public static void main(String[] args) {

        PhoneDirectory directory = new PhoneDirectory();

        directory.add("Ленин", "003");
        directory.add("Ульянов", "112");
        directory.add("Сталин", "666");
        directory.add("Петросян", "010");
        directory.add("Петросян", "890");
        directory.add("Ломонов", "1711");
        directory.add("Маск", "007");
        directory.add("Маск", "001100");
        directory.add("Сталин", "13");

        System.out.println("----------------------");
        System.out.println("Номер(а) Ленина: ");
        System.out.println(directory.get("Ленин"));
        System.out.println("----------------------");
        System.out.println("Номер(а) Ульянова: ");
        System.out.println(directory.get("Ульянов"));
        System.out.println("----------------------");
        System.out.println("Номер(а) Сталина: ");
        System.out.println(directory.get("Сталин"));
        System.out.println("----------------------");
        System.out.println("Номер(а) Петросяна: ");
        System.out.println(directory.get("Петросян"));
        System.out.println("----------------------");
        System.out.println("Номер(а) Ломонова: ");
        System.out.println(directory.get("Ломонов"));
        System.out.println("----------------------");
        System.out.println("Номер(а) Маска: ");
        System.out.println(directory.get("Маск"));
    }
}
