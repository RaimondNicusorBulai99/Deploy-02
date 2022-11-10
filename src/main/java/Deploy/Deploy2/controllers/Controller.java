package Deploy.Deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

public class Controller  {

    @GetMapping
    public long sumRandomIntegers(){
        Random random = new Random();
        return random.nextInt(100) + random.nextInt(100);
    }
}