package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    private String status;
    public String checkout(String status)
    {
        System.out.println("check_out method of shopping cart called" + status);
        return status;
    }


}
