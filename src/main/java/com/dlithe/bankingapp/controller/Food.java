package com.dlithe.bankingapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Food {

    @GetMapping("fetch-food/{itemName}")
    public String searchingFoodItems(@PathVariable String itemName) {
        switch (itemName) {

            case "deathbychocolate":
                return deathbychocolate();
            case "butterscoch":
                return butterscoch();
            case "vennila":
                return vennila();
            default:
                return "Your searching item is not found";

        }

    }

    private String vennila() {
        return "Buy one get one free";
    }

    private String butterscoch() {
        return "Only one left";
    }

    public String deathbychocolate() {
        return "It is tasty";
    }
}
