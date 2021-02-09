package JavaCore.HomeWork4.Task2;

import java.util.*;

public class PhoneDirectory {

    private final Map <String, List<String>> directory = new HashMap<>();

    public void add(String surname, String phone) {
        List<String> phoneList;
        if (directory.containsKey(surname)) {
            phoneList = directory.get(surname);
        } else {
            phoneList = new ArrayList<>();
        }
        phoneList.add(phone);
        directory.put(surname, phoneList);
    }

    public List<String> get(String surname) {
        return directory.get(surname);
    }
}
