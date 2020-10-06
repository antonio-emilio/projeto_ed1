package ifound.entity;

import ifound.entity.ComponentesProjetos;
import ifound.entity.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T16:51:25")
@StaticMetamodel(Projeto.class)
public class Projeto_ { 

    public static volatile SingularAttribute<Projeto, String> foto;
    public static volatile SingularAttribute<Projeto, Usuario> idUsuario;
    public static volatile SingularAttribute<Projeto, Integer> id;
    public static volatile CollectionAttribute<Projeto, ComponentesProjetos> componentesProjetosCollection;

}