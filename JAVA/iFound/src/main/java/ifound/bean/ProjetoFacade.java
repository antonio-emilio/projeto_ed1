/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifound.bean;

import ifound.entity.Projeto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Conta
 */
@Stateless
public class ProjetoFacade extends AbstractFacade<Projeto> {

    @PersistenceContext(unitName = "iFound_iFound_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProjetoFacade() {
        super(Projeto.class);
    }
    
}
