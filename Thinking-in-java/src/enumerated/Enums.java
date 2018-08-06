package enumerated;

import enumerated.enums.Signal;

import java.util.Random;

/**
 * 生成随机枚举实例
 *
 * @author: 冀陆涛
 * @create: 2018-08-04 21:32
 **/
public class Enums {
    private static Random rand = new Random();

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Enums.random(Signal.class) + " ");
        }
    }
}
