package com.example.Iglesias.controller;

import com.example.Iglesias.model.IglesiaModel;
import com.example.Iglesias.services.IglesiaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/iglesias")
public class IglesiaController {
    @Autowired
    private IglesiaServices iglesiaServices;

    @GetMapping("/{id}")
    public Optional<IglesiaModel> getIglesia(@PathVariable Long id){ return iglesiaServices.getIglesiaId(id);}

    @GetMapping
    public List<IglesiaModel> getAllIglesia(){ return iglesiaServices.getAllIglesia();}

    @PostMapping
    public IglesiaModel saveIglesia(@RequestBody IglesiaModel iglesiaModel){
        return  iglesiaServices.saveIglesia(iglesiaModel);
    }

    @PutMapping(path = "/actualizar")
    public ResponseEntity<Void> UpdateIglesia(@RequestBody IglesiaModel iglesiaModel){
        return iglesiaServices.updateIglesia(iglesiaModel);
    }

    @DeleteMapping(path = "/eliminar/{id}")
    public ResponseEntity<Void> deleteIglesia(@PathVariable Long id){
        return iglesiaServices.deleteIglesia(id);
    }
}
