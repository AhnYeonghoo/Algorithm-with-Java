package programmers.practice;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public final String name;
    private final List<PhoneNumber> numbers;

    public Person(String name) {
        this.name = name;
        numbers = new ArrayList<>();
    }

    public boolean addPhoneNumber(PhoneNumber number) {
        for (char c : number.toString().toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        numbers.add(number);
        return true;
    }

    @Override
    public String toString() {
        return "Person{"+
                "name=" + name + '\'' +
                ", numbers=" + numbers + '}';
    }

    public boolean hasPhoneNumber(PhoneNumber number) {
        return numbers.contains(number);
    }



    public static void main(String[] args) {

        Person person = new Person("홍길동");

        person.addPhoneNumber(new PhoneNumber("010-1234-5678"));
        person.addPhoneNumber(new PhoneNumber("010 1234 5678"));
        person.addPhoneNumber(new PhoneNumber("010-1234-5678"));
        System.out.println(person);
    }

}
