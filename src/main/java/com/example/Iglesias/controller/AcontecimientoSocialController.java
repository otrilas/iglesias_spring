package com.example.Iglesias.controller;

import com.example.Iglesias.model.AcontecimientoSocialModel;
import com.example.Iglesias.services.AconteciminetoSocialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/acontecimintos_social")
public class AcontecimientoSocialController {
    @Autowired
    private AconteciminetoSocialServices aconteciminetoSocialServices;

    @GetMapping("/{id}")
    public Optional<AcontecimientoSocialModel> getAcontSocial(Long id){
        return aconteciminetoSocialServices.getAcontSocialId(id);
    }

    @GetMapping
    public List<AcontecimientoSocialModel> getAllAcontSocial(){
        return aconteciminetoSocialServices.getAllAcontSocial();
    }

    @PostMapping
    public AcontecimientoSocialModel saveAcontSocial(@RequestBody AcontecimientoSocialModel acontecimientoSocialModel){
        return aconteciminetoSocialServices.saveAcontSocial(acontecimientoSocialModel);
    }

    @PutMapping(path = "/actualizar")
    public ResponseEntity<Void> updateAcontSocial(@RequestBody AcontecimientoSocialModel acontecimientoSocialModel){
        return aconteciminetoSocialServices.updateAcontSocial(acontecimientoSocialModel);
    }

    @DeleteMapping(path = "eliminar/{id}")
    public ResponseEntity<Void> deleteAcontSocial(@PathVariable Long id){
        return aconteciminetoSocialServices.deleteAcontSocial(id);
    }
}
