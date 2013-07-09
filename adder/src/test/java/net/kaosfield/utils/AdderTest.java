package net.kaosfield.utils;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class AdderTest {
  @Test
  public void execute() {
    Adder adder = new Adder(1, 2);
    assertThat(adder.execute(), is(3));
  }
}
