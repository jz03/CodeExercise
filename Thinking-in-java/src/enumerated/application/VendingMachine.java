package enumerated.application;

import enumerated.enums.Input;
import util.Generator;

/**
 * 自动售货机
 * 状态机模式
 *
 * @author: 冀陆涛
 * @create: 2018-08-05 22:00
 **/
public class VendingMachine {
    //瞬态
    enum StateDuration {TRANSIENT}
    enum State{
        RESTING,ADDING_MONEY,DISPENSING,GIVING_CHANGE,TERMINAL;
        private boolean isTransient = false;
        State(){}
        State(StateDuration trans){
            isTransient = true;
        }
        void next(Input input){
            throw new RuntimeException("只对没有瞬态调用next(Input input)");
        }
        void next(){
            throw new RuntimeException("只对瞬态调用next()");
        }
        void output(){
            System.out.println(amount);
        }
    }
    private static State state = State.RESTING;
    private static int amount = 0;
    private static Input selection = null;

    static void run(Generator<Input> gen){
        while(state != State.TERMINAL){
            state.next(gen.next());
        }
        state.output();
    }

    public static void main(String[] args) {
        Generator<Input> gen = new RandomInputGenerator();
        if(args.length == 1){
            gen=new FileInputGenerator(args[0]);
        }
        run(gen);
    }

}
