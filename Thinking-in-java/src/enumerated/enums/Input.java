package enumerated.enums;

import java.util.Random;

/**
 * 投入
 *
 * @author: 冀陆涛
 * @create: 2018-08-05 21:24
 **/
public enum Input {
    NICKEL(5), DIME(10), QUARTER(25), DOLLAR(100), TOOTHOASTE(200), CHIPS(75), SODA(100), SOAP(50),
    //异常中止事务
    ABORT_TRANSACTION{
        public int amount(){
            throw new RuntimeException("ABORT.amount()");
        }
    },
    STOP{
        public int amount(){
            throw new RuntimeException("SHUT_DOWN.amount()");
        }
    };
    int value;
    Input(int value){
        this.value=value;
    }
    Input(){}
    int amount(){return value;}
    static Random rand =new Random();
    public static Input randomSelection(){
        return values()[rand.nextInt(values().length-1)];
    }
}
