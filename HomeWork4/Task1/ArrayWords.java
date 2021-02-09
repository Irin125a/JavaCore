package JavaCore.HomeWork4.Task1;

import java.util.*;

public class ArrayWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "я", "помню", "жуткое", "мгновенье",
                "мгновенье", "это", "не", "забыть",
                "хочу", "я", "кушать", "как", "бродяга",
                "вот", "только", "дома", "нет", "еды"
        );

        Set<String> task = new HashSet<>(words);

        System.out.println("   ***");
        System.out.println("Что было: ");
        System.out.println(words.toString());
        System.out.println("-----------------");
        System.out.println("Что стало: ");
        System.out.println(task.toString());
        System.out.println("-----------------");
        System.out.println("Какие слова повторились: ");
        for ( String key : task ) {
            if (Collections.frequency(words, key) > 1)
                System.out.println(key + ": " + Collections.frequency(words, key));
        }
        System.out.println("   ***");
    }
}
