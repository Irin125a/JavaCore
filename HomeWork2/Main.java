package JavaCore.HomeWork2;

public class Main {

    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"8", "0", "1", "80"},
                {"9", "2", "7", "98"},
                {"4", "7", "0", "32"},
                {"0", "2", "32", "11"}
        };
        String[][] otherSize = {
                {"8", "2", "34", "77"},
                {"16", "1"},
                {"32", "2", "7", "1"},
                {"0", "14", "7", "0"}
        };
        String[][] symbol = {
                {"0", "78", "44", "3"},
                {"1", "98", "@", "8"},
                {"0", "2", "71", "4"},
                {"2", "91", "87", "2"}
        };

        try {
            try {
                System.out.println("Массив 1");
                int result1 = method(arr);
                System.out.println(result1);
                System.out.println("--------------------------");
            } catch (MyArraySizeException e) {
                System.out.println("Что-то не так с массивом (мало/много значений)...");
                System.out.println("--------------------------");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Проблемка...");
            System.out.println("Ошибка в ячейке: " + e.i + "-" + e.j);
            System.out.println("--------------------------");
        }

        try {
            try {
                System.out.println("Массив 2");
                int result2 = method(otherSize);
                System.out.println(result2);
                System.out.println("--------------------------");
            } catch (MyArraySizeException e) {
                System.out.println("Что-то не так с массивом (мало/много значений)...");
                System.out.println("--------------------------");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Проблемка...");
            System.out.println("Ошибка в ячейке: " + e.i + "-" + e.j);
            System.out.println("--------------------------");
        }

        try {
            try {
                System.out.println("Массив 3");
                int result3 = method(symbol);
                System.out.println(result3);
                System.out.println("--------------------------");
            } catch (MyArraySizeException e) {
                System.out.println("Что-то не так с массивом (мало/много значений)...");
                System.out.println("--------------------------");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Проблемка...");
            System.out.println("Ошибка в ячейке: " + e.i + "-" + e.j);
            System.out.println("--------------------------");
        }
    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for ( int i = 0; i < arr.length; i++ ) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for ( int j = 0; j < arr[i].length; j++ ) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
