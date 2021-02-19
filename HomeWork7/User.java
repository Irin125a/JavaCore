package JavaCore.HomeWork7;

import java.io.IOException;
import java.util.Scanner;

public class User implements UserI {

    RegulatorI regulator = new Regulator();

    @Override
    public void showMenu() {

        while (true) {
            System.out.println("Введите название города на английском языке или 'exit' для выхода");
            Scanner scanner = new Scanner(System.in);
            String userResponse = scanner.nextLine();
            checkIsExit(userResponse);

            System.out.println("\n1 - погода сегодня");
            System.out.println("\n2 - погода на 5 дней");
            int selectedCommand = scanner.nextInt();

            try {
                regulator.onCommandChosen(selectedCommand);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void checkIsExit(String userResponse) {
        if (userResponse.equalsIgnoreCase("exit") ||
                userResponse.equalsIgnoreCase("Пока-пока)")) {
            System.out.println("Пока-пока)");
            System.exit(0);
        }
    }
}