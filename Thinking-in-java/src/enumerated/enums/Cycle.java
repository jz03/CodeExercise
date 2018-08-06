package enumerated.enums;

/**
 * @author: 冀陆涛
 * @create: 2018-08-05 13:55
 **/
public enum Cycle {
    UNDERBODY {
        @Override
        public void action() {
            System.out.println("车身下部");
        }
    },
    WHEELWASH {
        @Override
        public void action() {
            System.out.println("轮洗");
        }
    },
    PREWASH {
        @Override
        public void action() {
            System.out.println("预洗");
        }
    },
    BASIC {
        @Override
        public void action() {
            System.out.println("基本");
        }
    },
    HOTWAX {
        @Override
        public void action() {
            System.out.println("打蜡");
        }
    },
    RINSE {
        @Override
        public void action() {
            System.out.println("漂洗");
        }
    },
    BLOWDRY {
        @Override
        public void action() {
            System.out.println("吹风");
        }
    };
    public abstract void action();
}
