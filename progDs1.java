import java.util.HashMap;
import java.util.List;

public class progDs1
{
    public static void main(String[] args) 
    {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        phoneBook.put("Иванов И.И.",  List.of("+7(111)111-11-11", "+7(222)222-22-22", "+7(200)200-20-20"));
        phoneBook.put("Смирнов С.С.", List.of("+7(444)444-44-44", "+7(333)333-33-33"));
        phoneBook.put("Петров П.П.",  List.of("+7(888)888-88-88", "+7(400)400-40-40", "+7(999)999-99-99"));
        phoneBook.put("Соколов С.С.", List.of("+7(777)777-77-77"));
        phoneBook.put("Сидоров С.С.", List.of("+7(555)555-55-55", "+7(666)666-66-66"));

        System.out.println("Пользователи:");
        for (var entry : phoneBook.entrySet()) 
        {
            System.out.print(entry.getKey() + " Номера телефонов: ");
            List<String> phones = entry.getValue();
            for (int i = 0; i < phones.size(); i++) 
            {
                if (i > 0)  System.out.print(", ");
                System.out.print(phones.get(i));
            }
            System.out.println();
        }
    }
}
