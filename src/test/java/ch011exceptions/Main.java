package ch011exceptions;

import org.junit.Test;

public class Main {
    @Test(expected = IllegalArgumentException.class)
    public void exampleTryCatchFinally() {
        Integer age = null;
        
        try {
            System.out.println("1. generate a null pointer exception");
            System.out.println(age.toString());
        } catch (NullPointerException e) {
            System.out.println("2. handle null pointer exception");
            throw new IllegalArgumentException("Null pointer became Illegal", e);
        } finally {
            System.out.println("3. run code in finally section");
        }
    }
}
