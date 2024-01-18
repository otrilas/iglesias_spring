package com.example.Iglesias.services;

import com.example.Iglesias.model.ReservaModel;
import com.example.Iglesias.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaServices {
    @Autowired
    private ReservaRepository reservaRepository;

    public ReservaModel saveReserva(ReservaModel reservaModel){return reservaRepository.save(reservaModel);}

    public Optional<ReservaModel> getReservaId(Long id){return reservaRepository.findById(id); }

    public List<ReservaModel> getAllReserva(){return reservaRepository.findAll();}

    public ResponseEntity<Void> updateReserva(ReservaModel reservaModel){
        if ( reservaModel.getId() != null ) {
            if (!reservaRepository.findById(reservaModel.getId()).isEmpty()) {
                reservaRepository.save(reservaModel);
                return new ResponseEntity<Void>(HttpStatus.OK);
            } else {
                return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        }else {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<Void> deleteReserva(Long id){
        if (id != null ){
            if (! reservaRepository.findById(id).isEmpty()){
                reservaRepository.deleteById(id);
                return new ResponseEntity<Void>(HttpStatus.OK);
            }else {
                return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        }else {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }
}
