package pr2;

import pr1.Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class sortPeople {
    private String[] firstNameArr = {"Jeff", "John", "Arthur", "Samuel", "Bob", "Nick", "Thom",
    "Britney", "Chris", "Miley", "Anna", "Kate", "Stacy"};
    private String[] lastNameArr = {"Marston", "Cena", "Morgan", "Jackson", "Builder", "Furry", "Yorke",
    "Spears", "Evans", "Cyrus", "Hathaway", "Leen", "Tzu"};

    private List<Human> setList(int size) {
        List<Human> finalList = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < size; ++i) {
            LocalDate date = LocalDate.of(random.nextInt(50) + 1970, random.nextInt(12) + 1,
                    random.nextInt(28) + 1);
            finalList.add(new Human(
                    random.nextInt(99),
                    firstNameArr[random.nextInt(firstNameArr.length)],
                    lastNameArr[random.nextInt(lastNameArr.length)],
                    date,
                    random.nextInt(60) + 60));
        }
        return finalList;
    }

    public void getList(int size) {
        List<Human> array = setList(size);
        Stream<Human> stream1 = array.stream();
        Stream<Human> stream2 = array.stream();
        Stream<Human> stream3 = array.stream();
        Stream<Human> stream4 = array.stream();
        Stream<Human> stream5 = array.stream();

        System.out.println("Список людей до применения функциональных потоков:");
        array.forEach(System.out::println);

        System.out.println("\nСписок людей после применения функциональных потоков:");

        System.out.println("Сортировка по возрасту в обратном порядке:");
        stream1.map(Human::getAge).sorted().forEach(System.out::println);

        System.out.println("\nФильтрация по имени 'Начинается с А':");
        stream2.filter(o -> o.getFirstName().charAt(0) == 'A').forEach(System.out::println);

        System.out.println("\nСортировка по дате рождения:");
        stream3.map(Human::getBirthDate).sorted().forEach(System.out::println);

        System.out.println("\nРасчет среднего веса:");
        int avgSum;
        long amount;
        avgSum = stream4.mapToInt(Human::getWeight).sum();
        amount = stream5.map(Human::getWeight).count();
        System.out.println(avgSum / amount);
    }

    public static void main(String[] args) {
        sortPeople hello = new sortPeople();
        hello.getList(10);
    }
}

