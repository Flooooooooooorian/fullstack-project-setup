package de.neuefische.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    @GetMapping
    List<Todo> getTodos() {
        return List.of(
            new Todo("1", "Buy milk"),
            new Todo("2", "Buy coffee"),
            new Todo("3", "Buy tea")
        );
    }
}
