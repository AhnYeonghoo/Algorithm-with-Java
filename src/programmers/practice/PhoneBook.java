package programmers.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhoneBook {
    private final Set<Person> people;

    private PhoneBook() {
        people = new HashSet<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public Person search(PhoneNumber number) {
        return people.stream()
                .filter(p -> p.hasPhoneNumber(number))
                .findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        return "PhoneBook{"+
                "people="+people+'}';
    }

    public static void main(String[] args) {

        Person person1 = new Person("홍길동");
        person1.addPhoneNumber(new PhoneNumber("010-1234-5678"));
        person1.addPhoneNumber(new PhoneNumber("010-2345-6789"));

        Person person2 = new Person("김철수");
        person2.addPhoneNumber(new PhoneNumber("010-2468-0246"));

        Person person3 = new Person("이영희");
        person3.addPhoneNumber(new PhoneNumber("010-1357-9135"));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson(person1);
        phoneBook.addPerson(person2);
        phoneBook.addPerson(person3);

        System.out.println(phoneBook);
    }
}
