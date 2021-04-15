package ru.job4j.stream;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void whenGetAddress() {
        List<Profile> listProfiles = List.of(
                new Profile(new Address("Bryansk", "Pushkina", 10, 77)),
                new Profile(new Address("Moskva", "Lenina", 12, 4)),
                new Profile(new Address("Bryansk", "Pushkina", 10, 77)));

        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(listProfiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Bryansk", "Pushkina", 10, 77));
        expected.add(new Address("Moskva", "Lenina", 12, 4));
        assertThat(rsl, is(expected));
    }
}