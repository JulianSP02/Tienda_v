package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import com.tienda.model.Cliente;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Se muestra la página index de templates");
        
        
        
        var clientes = clienteDao.findAll();
        
        model.addAttribute("clientes",clientes);
        
        return "index";
    }
}
