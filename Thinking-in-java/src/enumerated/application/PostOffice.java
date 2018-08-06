package enumerated.application;

import enumerated.enums.Mail;

/**
 * 邮局
 * 职责链模式
 *
 * @author: 冀陆涛
 * @create: 2018-08-05 17:11
 **/
public class PostOffice {
    enum MailHandler{
        //普通方式发送
        GENERAL_DELIVERY {
            @Override
            boolean handle(Mail m) {
                switch(m.generalDelivery){
                    case YES:
                        System.out.println("使用一般发送 "+m);
                        return true;
                    default: return false;
                }
            }
        },
        //自动发送
        MACHINE_SCAN {
            @Override
            boolean handle(Mail m) {
                switch(m.scannability){
                    case UNSCANNABLE:
                        return false;
                    default:
                        switch(m.address){
                            case INCORRECT:return false;
                            default:
                                System.out.println("自动发送 " + m);
                                return true;
                        }
                }
            }
        },
        //手动发送
        VISUAL_INSPECTION {
            @Override
            boolean handle(Mail m) {
                switch(m.readability){
                    case ILLEGIBLE: return false;
                    default:
                        switch (m.address){
                            case INCORRECT:return false;
                            default:
                                System.out.println("手动发送 " + m);
                                return true;
                        }
                }
            }
        },
        //返回发送人
        RETURN_TO_SENDER {
            @Override
            boolean handle(Mail m) {
                switch (m.returnAddress){
                    case MISSING: return false;
                    default:
                        System.out.println("返回发件人 " + m);
                        return true;
                }
            }
        };
        abstract boolean handle(Mail m);
    }

    static void handle(Mail m){
        for(MailHandler handler : MailHandler.values()){
            if(handler.handle(m)){
                return;
            }
        }
        System.out.println(m + "是一封错误的邮件");
    }

    public static void main(String[] args) {
        for(Mail mail:Mail.generator(10)){
            System.out.println(mail.details());
            handle(mail);
            System.out.println("*******************************");
        }
    }

}
