package ru.job4j.search;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;

    public Person(String name1, String surname1, String phone1, String address1) {
        name = name1;
        surname = surname1;
        phone = phone1;
        address = address1;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(phone, person.phone) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phone, address);
    }
}