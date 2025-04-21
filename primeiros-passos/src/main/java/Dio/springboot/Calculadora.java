package Dio.springboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component

public class Calculadora {
    public int somar (int num1, int num2) {
        return num1 + num2;
    }
}
