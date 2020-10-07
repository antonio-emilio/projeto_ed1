package ifound.entity;

import ifound.entity.Componentes;
import ifound.entity.Projeto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T23:09:20")
@StaticMetamodel(ComponentesProjetos.class)
public class ComponentesProjetos_ { 

    public static volatile SingularAttribute<ComponentesProjetos, String> observacao;
    public static volatile SingularAttribute<ComponentesProjetos, Componentes> idComponentes;
    public static volatile SingularAttribute<ComponentesProjetos, Projeto> idProjeto;
    public static volatile SingularAttribute<ComponentesProjetos, Integer> id;
    public static volatile SingularAttribute<ComponentesProjetos, Integer> quantidade;

}