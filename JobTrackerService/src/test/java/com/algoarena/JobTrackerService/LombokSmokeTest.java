package com.algoarena.JobTrackerService;

import lombok.Builder;

@Builder
class Foo { int x; }
public class LombokSmokeTest {
    public static void main(String[] args) {
        Foo f = Foo.builder().x(42).build();
        System.out.println("OK " + f);
    }
}
