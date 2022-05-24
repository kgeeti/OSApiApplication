/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.kge.OSApiApplication.api.controller;

import br.eti.kge.OSApiApplication.domain.model.Cliente;
import br.eti.kge.OSApiApplication.domain.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KGe
 */

@RestController
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @GetMapping("/clientes")
    public List<Cliente> listas() {
        // return clienteRepository.findAll();
         return clienteRepository.findByNome("KGe");
        //return clienteRepository.findByNomeContaining("Silva");
    }
    
    @GetMapping("/clientes/{clienteId}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long clienteID) {
        Optional<Cliente> cliente = clienteRepository.findById(clienteID);
        
        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente.get());
        } else {
            return ResponseEntity.notFound().build();
        }
        
    }
    
}
