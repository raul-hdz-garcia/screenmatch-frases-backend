package com.aluracursos.screenmatch_frases.service;

import com.aluracursos.screenmatch_frases.model.Frase;
import com.aluracursos.screenmatch_frases.odt.FraseODT;
import com.aluracursos.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseODT obtenerFraseAleatoria() {
        Frase f = repository.obtenerFraseAleatoria();
        return new FraseODT(f.getTitulo(), f.getPoster(), f.getFrase(), f.getPersonaje());
    }
}
