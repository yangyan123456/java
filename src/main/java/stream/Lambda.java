package stream;

import lombok.extern.slf4j.Slf4j;

import java.util.function.IntBinaryOperator;

@Slf4j
public class Lambda {

    public static  int calculateNum(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a,b);
    }


    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("=======hello======");
            }
        });
        new Thread(() -> log.info("=======hello======")).start();
        calculateNum((left, right) -> left - right);
        int res = calculateNum((left, right) -> left * right);
        log.info("=======res = " + res + "===========");
    }
}
