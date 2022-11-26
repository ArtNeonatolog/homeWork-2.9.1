import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> phoneBook = new HashMap<>();

    public void addPhoneAndPrint () {
        phoneBook.put("Сафуанов Артем", "89274399449");
        phoneBook.put("Сафуанов Андрей", "89274378446");
        phoneBook.put("Сафуанов Николай", "89274395459");
        phoneBook.put("Сафуанов Петр", "89275399669");
        phoneBook.put("Сафуанова Анна", "89174379449");
        phoneBook.put("Сафуанова Ольга", "89274399449");
        phoneBook.put("Сафуанова Кира", "89174697949");
        phoneBook.put("Сафуанов Кирилл", "89284397449");
        phoneBook.put("Сафуанов Иван", "89634399449");
        phoneBook.put("Сафуанова Яна", "89274111449");
        phoneBook.put("Сафуанова Полина", "89274222449");
        phoneBook.put("Сафуанов Денис", "89274399449");
        phoneBook.put("Сафуанов Арслан", "89874399449");
        phoneBook.put("Сафуанов Роман", "89055399449");
        phoneBook.put("Сафуанов Аркадий", "89377399448");
        phoneBook.put("Сафуанов Мстислав", "89276399449");
        phoneBook.put("Сафуанов Максим", "89274339449");
        phoneBook.put("Сафуанов Армен", "89174399449");
        phoneBook.put("Сафуанов Артур", "89274369789");
        phoneBook.put("Сафуанов Константин", "89274349449");

        for (Map.Entry<String, String> contact : phoneBook.entrySet()) {
            System.out.println("Контакт: " + contact.getKey() + ": " + contact.getValue());
        }
    }
}
