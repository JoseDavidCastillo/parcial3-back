package eci.cvds.parcial3_back.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import eci.cvds.parcial3_back.service.CitasService;
import eci.cvds.parcial3_back.model.*;

@RestController
@CrossOrigin(origins = {"http://localhost:3000","http://127.0.0.1:5500","http://localhost:5500"})
@RequestMapping("/api/citas")
public class citasController {
    @Autowired
    private CitasService citasService;

    @GetMapping
    public List<Cita> getAll(){
        return citasService.getAll();
    }

    @GetMapping("/by-estado")
    public List<Cita> getByEstado(@RequestBody Estado estado){
        return citasService.getByEstado(estado.getEstado());
    }

    @GetMapping("/especialidad")
    public ArrayList<Espe> getEspes(){
        return citasService.getEspeList();
    }

    @PostMapping
    public Cita create(@RequestBody Cita cita){
        return citasService.create(cita);
    }

    @PutMapping("/{id}")
    public Cita update(@PathVariable String id,@RequestBody Cita cita){
        return citasService.update(id, cita);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        citasService.delete(id);
    }
}