package model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "servidores")
public class ServidoresModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServidor;

    @ManyToOne
    @JoinColumn(name = "idPessoa", nullable = false)
    private PessoaModel pessoa;

    @ManyToOne
    @JoinColumn(name = "idCargo", nullable = false)
    private CargoModel cargo;

    @ManyToOne
    @JoinColumn(name = "idSetor", nullable = false)
    private SetorModel setor;

    @ManyToOne
    @JoinColumn(name = "idCampus", nullable = false)
    private CampusModel campus;

    public ServidoresModel() {}

    public ServidoresModel(PessoaModel pessoa, CargoModel cargo, SetorModel setor, CampusModel campus) {
        this.pessoa = pessoa;
        this.cargo = cargo;
        this.setor = setor;
        this.campus = campus;
    }

    // Getters and Setters
    public Long getIdServidor() {
        return idServidor;
    }

    public void setIdServidor(Long idServidor) {
        this.idServidor = idServidor;
    }

    public PessoaModel getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }

    public CargoModel getCargo() {
        return cargo;
    }

    public void setCargo(CargoModel cargo) {
        this.cargo = cargo;
    }

    public SetorModel getSetor() {
        return setor;
    }

    public void setSetor(SetorModel setor) {
        this.setor = setor;
    }

    public CampusModel getCampus() {
        return campus;
    }

    public void setCampus(CampusModel campus) {
        this.campus = campus;
    }
}