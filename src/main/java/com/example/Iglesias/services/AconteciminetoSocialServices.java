package com.example.Iglesias.services;

import com.example.Iglesias.model.AcontecimientoSocialModel;
import com.example.Iglesias.repository.AconteciminetoSocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;
import java.util.PrimitiveIterator;

@Service
public class AconteciminetoSocialServices {
    @Autowired
    private AconteciminetoSocialRepository aconteciminetoSocialRepository;

    public AcontecimientoSocialModel saveAcontSocial(AcontecimientoSocialModel acontecimientoSocialModel){
        return aconteciminetoSocialRepository.save(acontecimientoSocialModel);
    }

    public Optional<AcontecimientoSocialModel> getAcontSocialId(Long id){
        return aconteciminetoSocialRepository.findById(id);
    }

    public List<AcontecimientoSocialModel> getAllAcontSocial(){
        return aconteciminetoSocialRepository.findAll();
    }

    public ResponseEntity<Void> updateAcontSocial(AcontecimientoSocialModel acontecimientoSocialModel){
        if (acontecimientoSocialModel.getId() != null ){
            if (!aconteciminetoSocialRepository.findById(acontecimientoSocialModel.getId()).isEmpty()){
                aconteciminetoSocialRepository.save(acontecimientoSocialModel);
                return new ResponseEntity<Void>(HttpStatus.OK);
            }else {
                return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        }else {
           return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<Void> deleteAcontSocial(Long id){
        if (id != null){
            if (! aconteciminetoSocialRepository.findById(id).isEmpty()){
                aconteciminetoSocialRepository.deleteById(id);
                return new ResponseEntity<Void>(HttpStatus.OK);
            }else {
                return  new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        }else{
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }
}
