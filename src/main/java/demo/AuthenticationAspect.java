package demo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {


    ///This Author method act as named method. where ever we can use it.
    @Pointcut("execution(* demo.ShoppingCart.checkout(..))")
    public void Author(){}

    @Pointcut("execution(* demo.ShoppingCart.checkout(..))")
    public void afterReturningPointCut(){}


    @Before("Author()")
    public void authour()
    {
        System.out.println("BEFORE AuthenticationAspect");
    }


    @After("Author()")
    public void authour1()
    {
        System.out.println("AFTER AuthenticationAspect");
    }


    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "val")
    public void afterReturning(String val)
    {
        System.out.println("After return by point cut "+val);
    }


}
