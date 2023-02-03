package statesandcapitals;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class statesAndCapitalsTest {
    @Test
    void Test_states_and_capitals() throws IOException {
        StatesAndCapitals sut = new StatesAndCapitals();
        sut.testStatesAndCapitals();
    }
}
