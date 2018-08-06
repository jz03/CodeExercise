package enumerated;

import enumerated.enums.Explore;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * 分析values()
 * @author: 冀陆涛
 * @create: 2018-08-04 20:35
 **/
public class Reflection {
    public static Set<String> analyze(Class<?> enumClass){
        for(Type t : enumClass.getGenericInterfaces()){
            System.out.println(t);
        }
        Set<String> methods = new TreeSet<String>();
        for(Method m : enumClass.getMethods()){
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println(exploreMethods.containsAll(enumMethods));

        exploreMethods.removeAll(enumMethods);
        System.out.println(exploreMethods);
    }
}
