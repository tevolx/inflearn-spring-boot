package hello.pay;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LocalPayClient implements PayClient {
    @Override
    public void pay(int money) {
        log.info("로컬 결재 money={}", money);
    }
}
