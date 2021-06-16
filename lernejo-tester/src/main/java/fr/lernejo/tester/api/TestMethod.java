package fr.lernejo.tester.api;
@Retention(RetentionPolicy.RUNTIME) // (1)
@Target(ElementType.METHOD) // (2)

public @interface TestMethod {
}
