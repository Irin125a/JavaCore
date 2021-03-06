package JavaCore.HomeWork7_2;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface implements IUserInterface {

    IController controller = new Controller();

    @Override
    public void showMenu() {

        while (true) {
            System.out.println("Введите название города на английском языке или 'exit' для выхода");
            Scanner scanner = new Scanner(System.in);

            String userResponse = scanner.nextLine();

            checkIsExit(userResponse);

            try{
                controller.onCityInput(userResponse);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("Введите команду\n2 - для получения погоды на 5 дней");

            int selectedCommand = scanner.nextInt();

            try {
                controller.onCommandChosen(selectedCommand);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void checkIsExit(String userResponse) {
        if (userResponse.equalsIgnoreCase("exit") ||
                userResponse.equalsIgnoreCase("выход")) {
            System.out.println("Пока-пока)");
            System.exit(0);
        }
    }
}
