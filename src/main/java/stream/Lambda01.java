package stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Lambda01 {
    public static void main(String[] args) {
        new Thread(() -> log.info("=======hello======")).start();
    }
}
