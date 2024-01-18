package com.example.Iglesias.services;

import com.example.Iglesias.model.HorarioModel;
import com.example.Iglesias.repository.HorarioRepository;
import com.example.Iglesias.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorarioServices {
    @Autowired
    HorarioRepository horarioRepository;

    public HorarioModel saveHorario(HorarioModel horarioModel){ return horarioRepository.save(horarioModel);}

    public Optional<HorarioModel> getHorario(Long id){
        return horarioRepository.findById(id);
    }

    public List<HorarioModel> getAllHorario(){ return horarioRepository.findAll();}

    public ResponseEntity<Void> updateHorario(HorarioModel horarioModel){
        if (horarioModel.getId() != null ){
            if (! horarioRepository.findById(horarioModel.getId()).isEmpty()){
                horarioRepository.save(horarioModel);
                return new ResponseEntity<Void>(HttpStatus.OK);
            }else {
                return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        }else {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<Void> deleteHorario(Long id){
        if (id != null ){
            if (! horarioRepository.findById(id).isEmpty()){
                horarioRepository.deleteById(id);
                return new ResponseEntity<Void>(HttpStatus.OK);
            }else{
                return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        }else {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }
}
