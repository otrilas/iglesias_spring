package com.example.Iglesias.services;

import com.example.Iglesias.model.IglesiaModel;
import com.example.Iglesias.repository.IglesiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IglesiaServices {
    @Autowired
    IglesiaRepository iglesiaRepository;

    public IglesiaModel saveIglesia(IglesiaModel iglesiaModel){return iglesiaRepository.save(iglesiaModel);}

    public Optional <IglesiaModel> getIglesiaId(Long id){return iglesiaRepository.findById(id);}

    public List<IglesiaModel> getAllIglesia(){ return iglesiaRepository.findAll();}

    public ResponseEntity<Void> updateIglesia(IglesiaModel iglesiaModel){
        if (iglesiaModel.getId() != null){
            if (! iglesiaRepository.findById(iglesiaModel.getId()).isEmpty()){
                iglesiaRepository.save(iglesiaModel);
                return new ResponseEntity<Void>(HttpStatus.OK);
            }else {
                return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        }else {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<Void> deleteIglesia(Long id){
        if( id != null) {
            if (!iglesiaRepository.findById(id).isEmpty()){
                iglesiaRepository.deleteById(id);
                return new ResponseEntity<Void>(HttpStatus.OK);
            }else {
                return  new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        }else {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }

}
