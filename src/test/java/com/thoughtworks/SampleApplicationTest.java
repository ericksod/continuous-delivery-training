package com.thoughtworks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleApplicationTest {
    @Test
    public void shouldTestSomething() {
        assertThat(true).isEqualTo(true);
    }

    @Test
    public void shouldAddOnePlusOne() {
        assertThat(1+1).isEqualTo(2);
    }
}

