package stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Lambda01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("=======hello======");
            }
        }).start();
    }
}
