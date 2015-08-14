package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SampleApplicationTest {

    @Test
    public void shouldReturnFalseWhenNameIsMoreThanTenCharacters() {
        String longName = "jjjjjjjjjjj";

        assertThat(SampleApplication.validateName(longName), is(false));
    }

}

