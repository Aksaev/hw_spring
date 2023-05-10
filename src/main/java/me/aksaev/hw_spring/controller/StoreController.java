package me.aksaev.hw_spring.controller;

import me.aksaev.hw_spring.model.Item;
import me.aksaev.hw_spring.service.StoreService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam Set<Integer> id) {
        storeService.add(id);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return storeService.get();
    }

}
