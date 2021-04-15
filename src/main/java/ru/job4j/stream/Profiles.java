package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
//        Comparator<Address> comparator =(left, right) -> left.getCity().compareTo(right.getCity());
//        List<Address> listAddress = profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
//        return listAddress.stream().sorted(comparator).distinct().collect(Collectors.toList());
        Comparator<Address> comparator = (left, right) -> left.getCity().compareTo(right.getCity());
        return profiles.stream().map(profile -> profile.getAddress()).sorted(comparator).distinct().collect(Collectors.toList());
    }
}
