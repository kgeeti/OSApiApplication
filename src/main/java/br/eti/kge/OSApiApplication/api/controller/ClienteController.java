/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.kge.OSApiApplication.api.controller;

import br.eti.kge.OSApiApplication.domain.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KGe
 */

@RestController
public class ClienteController {
 
    @PersistenceContext
    private EntityManager manager;
    
    
    @GetMapping("/clientes")
    public List<Cliente> listas() {
        
        // Linguagem JPQL (tipo SQL só que do Jakarta)
        return manager.createQuery("from Cliente", Cliente.class)
                .getResultList();
    }
    
}

