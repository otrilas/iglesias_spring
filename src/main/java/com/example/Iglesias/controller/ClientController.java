package com.example.Iglesias.controller;

import com.example.Iglesias.model.ClientModel;
import com.example.Iglesias.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {
    @Autowired
    private ClientServices clientServices;

    @GetMapping("/{id}")
    public Optional<ClientModel> getClienteId(@PathVariable Long id) { return clientServices.getClienteId(id);}

    @GetMapping
    public List<ClientModel> getAllClient(){return clientServices.getAllClients();}

    @PostMapping
    public ClientModel saveClient(@RequestBody ClientModel clientModel){
        return clientServices.saveClient(clientModel);
    }

    @PutMapping(path = "/actualizar")
    public ResponseEntity<Void> updateClient(@RequestBody ClientModel clientModel){
        return clientServices.updateClient(clientModel);
    }

    @DeleteMapping(path = "/eliminar/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id){ return clientServices.deleteClient(id);}
}
