package space.forloop.nativeapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public ResponseEntity<String> greetings() {
        return ResponseEntity.ok(
                "Hello World"
        );
    }

}
