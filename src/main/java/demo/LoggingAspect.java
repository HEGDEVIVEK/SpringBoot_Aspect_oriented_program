package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforelogger()
    {

        System.out.println("BEFORE_LOGGERS ");
    }

    @After("execution ( * *.*.checkout(..))")
    public void afterlogger()
    {
        System.out.println("AFTER_LOGGER");
    }


    @AfterReturning("execution(* demo.ShoppingCart.checkout(..))")
    public void hello(JoinPoint jp)
    {
        String str=jp.getArgs()[0].toString();
        System.out.println("After return directly "+str);
    }


}
