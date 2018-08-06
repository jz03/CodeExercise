package enumerated;

import enumerated.enums.AlarmPoints;

import java.util.EnumSet;

import static enumerated.enums.AlarmPoints.*;

/**
 * @author: 冀陆涛
 * @create: 2018-08-05 09:35
 **/
public class EnumSets {
    public static void main(String[] args) {
        //创建一个具有指定元素类型的空枚举 set。
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        //添加枚举实例
        points.add(BATHROOM);
        System.out.println(points);
        //EnumSet.of 创建一个最初包含指定元素的枚举 set。
        points.addAll(EnumSet.of(STATR1,STATR2,KITCHEN));
        System.out.println(points);
        //创建一个包含指定元素类型的所有元素的枚举 set。
        points=EnumSet.allOf(AlarmPoints.class);
        System.out.println(points);
        points.removeAll(EnumSet.of(STATR1,STATR2,KITCHEN));
        System.out.println(points);
        points.removeAll(EnumSet.range(OFFICE1,OFFICE4));
        System.out.println(points);
        //最初包含指定 set 中所不 包含的此类型的所有元素。(相当于取反)
        points = EnumSet.complementOf(points);
        System.out.println(points);

    }
}
