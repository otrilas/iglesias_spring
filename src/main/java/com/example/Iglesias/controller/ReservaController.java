package com.example.Iglesias.controller;

import com.example.Iglesias.model.HorarioModel;
import com.example.Iglesias.model.ReservaModel;
import com.example.Iglesias.services.ReservaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/reserva")
public class ReservaController {
    @Autowired
    private ReservaServices reservaServices;

    @GetMapping("/{id}")
    public Optional<ReservaModel> getReservaId(@PathVariable Long id){return reservaServices.getReservaId(id);}

    @GetMapping
    public List<ReservaModel> getAllreserva(){return reservaServices.getAllReserva();}

    @PostMapping
    public ReservaModel saveReserva(@RequestBody ReservaModel reservaModel){
        return reservaServices.saveReserva(reservaModel);
    }

    @PutMapping(path = "/actualizar")
    public ResponseEntity<Void> updateReserva(@RequestBody ReservaModel reservaModel){
        return reservaServices.updateReserva(reservaModel);
    }

    @DeleteMapping(path = "eliminar/{id}")
    public ResponseEntity<Void> deleteReserva(@PathVariable Long id){ return reservaServices.deleteReserva(id);}
}
