package br.uema.pecs.veterinaria.dao;

import br.uema.pecs.veterinaria.model.Proprietario;

public class ProprietarioDao extends GenericDao<Proprietario> {

    public ProprietarioDao() {
        super(Proprietario.class);
    }

    @Override
    public void save(Proprietario entity) {
        super.save(entity);
    }

    @Override
    public void update(Proprietario entity) {
        super.update(entity);
    }

    @Override
    public void delete(Proprietario entity) {
        super.delete(entity);
    }
}
