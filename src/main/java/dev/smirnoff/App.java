package dev.smirnoff;

import dev.smirnoff.model.Sex;
import dev.smirnoff.model.TestAutocloseble;
import dev.smirnoff.model.User;
import lombok.SneakyThrows;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @author pavelsmirnov
 * @version 1.0
 * дата создания 21.03.2021
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(List.class.getMethods()));
boolean bbb = new Boolean(String.valueOf(1));
        System.out.println(bbb);
        boolean b = false;
        Boolean b1 = false;
        String str = "H";
        String sss = "";
        System.out.println(sss);
        str = "G";

//        try{
//            throw new Exception("try");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw new Exception("catch");
//        } finally {
//            throw new Exception("finally");
//        }
        try(TestAutocloseble testAutocloseble = new TestAutocloseble()){
            System.out.println("TRY");
            throw new Exception("try");
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw new Exception("catch");
        }
    }

}
