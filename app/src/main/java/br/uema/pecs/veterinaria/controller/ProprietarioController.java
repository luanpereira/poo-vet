package br.uema.pecs.veterinaria.controller;

import br.uema.pecs.veterinaria.dao.ProprietarioDao;
import br.uema.pecs.veterinaria.model.Proprietario;

import javax.inject.Inject;

public class ProprietarioController {
    @Inject
    private ProprietarioDao proprietarioDao;

    public void salvar(Proprietario proprietario){
        try {
            proprietarioDao = new ProprietarioDao();
            proprietarioDao.save(proprietario);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
