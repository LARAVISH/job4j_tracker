package ru.job4j.stream;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;


class ProfilesTest {

    @Test
    void collect() {
        List<Address> expect = List.of(new Address("Moscow", "Lenina", 20, 199),
                new Address("Moscow", "Mira", 68, 857),
                new Address("Moscow", "Vtoray", 3, 888));
        Profiles profiles = new Profiles();

        List<Profile> profileList = List.of(new Profile
                        (new Address("Moscow", "Lenina", 20, 199)),
                new Profile(new Address("Moscow", "Mira", 68, 857)),
                new Profile(new Address("Moscow", "Vtoray", 3, 888)));
        List<Address> res = profiles.collect(profileList);
        MatcherAssert.assertThat(res, is(expect));
    }
}