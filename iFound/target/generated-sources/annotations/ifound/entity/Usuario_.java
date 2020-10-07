package ifound.entity;

import ifound.entity.Componentes;
import ifound.entity.Projeto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T23:09:20")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile CollectionAttribute<Usuario, Projeto> projetoCollection;
    public static volatile CollectionAttribute<Usuario, Componentes> componentesCollection;
    public static volatile SingularAttribute<Usuario, String> logo;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, String> login;
    public static volatile SingularAttribute<Usuario, String> empresa;

}