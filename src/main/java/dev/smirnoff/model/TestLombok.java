package dev.smirnoff.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Method;
import java.util.List;

/**
 * This write description
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 22.03.2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestLombok {
    int id;
    String name;
    long num;
    List<String> tests;

    Method[] getMetods(){
        return List.class.getMethods();
    }
}
