/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifound.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Conta
 */
@Entity
@Table(name = "componentes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Componentes.findAll", query = "SELECT c FROM Componentes c"),
    @NamedQuery(name = "Componentes.findById", query = "SELECT c FROM Componentes c WHERE c.id = :id"),
    @NamedQuery(name = "Componentes.findByNome", query = "SELECT c FROM Componentes c WHERE c.nome = :nome"),
    @NamedQuery(name = "Componentes.findByValor", query = "SELECT c FROM Componentes c WHERE c.valor = :valor"),
    @NamedQuery(name = "Componentes.findByInfoAdicional", query = "SELECT c FROM Componentes c WHERE c.infoAdicional = :infoAdicional"),
    @NamedQuery(name = "Componentes.findByUrl", query = "SELECT c FROM Componentes c WHERE c.url = :url"),
    @NamedQuery(name = "Componentes.findByQuantidade", query = "SELECT c FROM Componentes c WHERE c.quantidade = :quantidade"),
    @NamedQuery(name = "Componentes.findByEndereco", query = "SELECT c FROM Componentes c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Componentes.findByFoto", query = "SELECT c FROM Componentes c WHERE c.foto = :foto")})
public class Componentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nome")
    private String nome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Double valor;
    @Size(max = 2147483647)
    @Column(name = "info_adicional")
    private String infoAdicional;
    @Size(max = 2147483647)
    @Column(name = "url")
    private String url;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Size(max = 2147483647)
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 2147483647)
    @Column(name = "foto")
    private String foto;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    @ManyToOne
    private Categoria idCategoria;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario idUsuario;
    @OneToMany(mappedBy = "idComponentes")
    private Collection<ComponentesProjetos> componentesProjetosCollection;

    public Componentes() {
    }

    public Componentes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @XmlTransient
    public Collection<ComponentesProjetos> getComponentesProjetosCollection() {
        return componentesProjetosCollection;
    }

    public void setComponentesProjetosCollection(Collection<ComponentesProjetos> componentesProjetosCollection) {
        this.componentesProjetosCollection = componentesProjetosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Componentes)) {
            return false;
        }
        Componentes other = (Componentes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + " - " + nome;
    }
    
}
