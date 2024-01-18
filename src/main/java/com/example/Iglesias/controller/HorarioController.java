package com.example.Iglesias.controller;

import com.example.Iglesias.model.HorarioModel;
import com.example.Iglesias.services.HorarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/horarios")
public class HorarioController {
    @Autowired
    private HorarioServices horarioServices;

    @GetMapping("/{id}")
    public Optional<HorarioModel> getHorario(@PathVariable Long id){ return horarioServices.getHorario(id);}

    @GetMapping
    public List<HorarioModel> getAllHorario(){return horarioServices.getAllHorario();}

    @PostMapping
    public HorarioModel saveHorario(@RequestBody HorarioModel horarioModel){
        return horarioServices.saveHorario(horarioModel);
    }

    @PutMapping(path = "/actualizar")
    public ResponseEntity<Void> updateHorario(@RequestBody HorarioModel horarioModel){
        return horarioServices.updateHorario(horarioModel);
    }

    @DeleteMapping(path = "/eliminar/{id}")
    public ResponseEntity<Void> deleteHorario(@PathVariable Long id){return horarioServices.deleteHorario(id);}
}
