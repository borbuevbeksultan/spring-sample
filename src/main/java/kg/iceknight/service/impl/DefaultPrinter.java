package kg.iceknight.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import kg.iceknight.service.Printer;
import kg.iceknight.service.Summator;

@Service("defaultPrinter")
public class DefaultPrinter implements Printer{

    private final Summator summator;

    @Autowired
    public DefaultPrinter(@Qualifier(value = "defaultSummator") Summator summator) {
        this.summator = summator;
    }

    public void print() {
        System.out.println(summator.sum(10, 2) + " Suka");
    }
}
