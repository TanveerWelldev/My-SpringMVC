package io.welldev.app.controller;

import io.welldev.app.model.Boop;
import io.welldev.app.model.BoopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/boops", headers = {"Accept=application/xml", "Accept=application/json"},
produces = "application/xml")
public class HomeController {

    @Autowired
    private BoopService boopService;
    @GetMapping(headers = {"Accept=application/xml"},
            produces = "application/xml")
    public ResponseEntity<List<Boop>> findAll() {
        List<Boop> result = boopService.getBoopList();
        return new ResponseEntity<>(result, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(headers = "Accept=application/json")
    public List<Boop> findALLJSON() {
        return boopService.getBoopList();
    }

    @GetMapping(value = "/{id}")
    public Boop findById(@PathVariable("id") Long id) {
        return boopService.getBoop(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Boop resource) {
        boopService.addBoop(resource);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") Long id, @RequestBody Boop resource) {
        boopService.updateBoop(resource, id);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        boopService.deleteBoop(id);
    }
}
