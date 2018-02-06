package kg.iceknight.service.impl;

import org.springframework.stereotype.Service;
import kg.iceknight.service.Summator;

@Service
public class DefaultSummator implements Summator {

    public int sum(int a, int b) {
        return a + b;
    }
}
