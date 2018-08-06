package enumerated.enums;

import enumerated.Enums;

import java.util.Iterator;

/**
 * 邮件
 *
 * @author: 冀陆涛
 * @create: 2018-08-05 16:02
 **/
public class Mail {
    //一般发送
    public enum GeneralDelivery{YES,NO1,NO2,NO3,NO4,NO5}
    //扫描
    public enum Scannability{UNSCANNABLE,YES1,YES2,YES3,YES4}
    //可读性
    public enum Readability{ILLEGIBLE,YES1,YES2,YES3,YES4}
    //地址
    public enum Address{INCORRECT,OK1,OK2,OK3,OK4,OK5,OK6}
    //返回地址
    public enum ReturnAddress{MISSING,OK1,OK2,OK3,OK4,OK5}
    public GeneralDelivery generalDelivery;
    public Scannability scannability;
    public Readability readability;
    public Address address;
    public ReturnAddress returnAddress;
    static long counter =0;
    long id = counter++;
    public String toString(){return "Mail "+id;}
    public String details(){
        return toString()+
                ", General Delivery: " + generalDelivery +
                ", Address scannability: " + scannability +
                ", Address readability: " + readability +
                ", Address address: " + address +
                ", Return  Delivery: " + returnAddress ;
    }

    public static Mail randomMail(){
        Mail m = new Mail();
        m.generalDelivery = Enums.random(GeneralDelivery.class);
        m.scannability = Enums.random(Scannability.class);
        m.readability = Enums.random(Readability.class);
        m.address = Enums.random(Address.class);
        m.returnAddress = Enums.random(ReturnAddress.class);
        return m;
    }

    //生成迭代器
    public static Iterable<Mail> generator(final int count){
        return new Iterable<Mail>() {
            int n = count;
            @Override
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }
                    @Override
                    public Mail next(){return randomMail();}

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

}
