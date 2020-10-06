package ifound.entity;

import ifound.entity.Categoria;
import ifound.entity.ComponentesProjetos;
import ifound.entity.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T16:51:25")
@StaticMetamodel(Componentes.class)
public class Componentes_ { 

    public static volatile SingularAttribute<Componentes, String> infoAdicional;
    public static volatile SingularAttribute<Componentes, String> endereco;
    public static volatile SingularAttribute<Componentes, String> foto;
    public static volatile SingularAttribute<Componentes, Usuario> idUsuario;
    public static volatile SingularAttribute<Componentes, Double> valor;
    public static volatile SingularAttribute<Componentes, String> nome;
    public static volatile SingularAttribute<Componentes, Integer> id;
    public static volatile SingularAttribute<Componentes, Categoria> idCategoria;
    public static volatile CollectionAttribute<Componentes, ComponentesProjetos> componentesProjetosCollection;
    public static volatile SingularAttribute<Componentes, Integer> quantidade;
    public static volatile SingularAttribute<Componentes, String> url;

}