package dev.smirnoff.model;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 22.04.2021
 */
public class TestAutocloseble implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("AUTOCLOSE");
        throw new Exception("TestAutocloseble-close()");
    }
}
