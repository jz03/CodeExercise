package enumerated;

import enumerated.enums.Signal;

/**
 * 交通信号灯
 *
 * @author: 冀陆涛
 * @create: 2018-08-04 20:17
 **/
public class TrrafficLight {
    Signal color = Signal.RED;
    public void change(){
        switch(color){
            case RED: color = Signal.GREEN;break;
            case GREEN:color =Signal.YELLOW;break;
            case YELLOW:color=Signal.RED;break;
        }
    }

    @Override
    public String toString() {
        return "当前的信号灯是：" + color;
    }

    public static void main(String[] args) {
        TrrafficLight t = new TrrafficLight();
        for(int i=0;i<7;i++){
            System.out.println(t);
            t.change();
        }
    }
}
