package calledmethods;

import lombok.Builder;
import lombok.NonNull;

import java.util.List;

@Builder
public class TestC {
    @NonNull List<String> test;

    static TestC testMethod() {
        return TestC.builder().build();
    }
}