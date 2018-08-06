package enumerated;

import enumerated.enums.Cycle;

import java.util.EnumSet;

/**
 * 洗车
 *
 * @author: 冀陆涛
 * @create: 2018-08-05 13:54
 **/
public class CarWash {
    EnumSet<Cycle> cycles = EnumSet.of(Cycle.BASIC,Cycle.RINSE);
    public void add(Cycle cycle){
        cycles.add(cycle);
    }
    public void washCar(){
        for(Cycle c :cycles){
            c.action();
        }
    }
    public String toString(){
        return cycles.toString();
    }

    public static void main(String[] args) {
        CarWash wash = new CarWash();
        System.out.println(wash);
        wash.washCar();
        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.RINSE);
        wash.add(Cycle.HOTWAX);
        System.out.println(wash);
        wash.washCar();
    }
}
