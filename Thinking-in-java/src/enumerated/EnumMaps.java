package enumerated;

import enumerated.enums.AlarmPoints;

import java.util.EnumMap;
import java.util.Map;

import static enumerated.enums.AlarmPoints.BATHROOM;
import static enumerated.enums.AlarmPoints.KITCHEN;
import static enumerated.enums.AlarmPoints.STATR2;

/**
 * EnumMaps
 * 命令设计模式
 *
 * @author: 冀陆涛
 * @create: 2018-08-05 10:14
 **/
public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints,Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("厨房着火了!");
            }
        });
        em.put(BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("浴室报警了!");
            }
        });

        for(Map.Entry<AlarmPoints,Command> e : em.entrySet()){
            System.out.print(e.getKey() + ": ");
            e.getValue().action();
        }

        try {
            em.get(STATR2).action();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
