package programmers.practice;

public class PhoneNumber {
    public final String phoneNumber;

    public PhoneNumber(String rawPhoneNumber) {
        this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]", "");
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber=" + phoneNumber + '\''+ '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PhoneNumber)) return false;
        return phoneNumber.equals(((PhoneNumber) o).phoneNumber);
    }

    public static void main(String[] args) {
        System.out.println(new PhoneNumber("010-1234-5678"));
        System.out.println(new PhoneNumber("010 1234 5678"));
        System.out.println(new PhoneNumber("010-1234-5678"));
    }
}
