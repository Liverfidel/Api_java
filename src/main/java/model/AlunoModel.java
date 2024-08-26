package model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Estudante")
public class AlunoModel extends PessoaModel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEstudante;

    private String email;

    @OneToOne
    @JoinColumn(name = "idCurso")
    private CursoModel curso;

    public AlunoModel() {}

    public AlunoModel(String nome, String email, CursoModel curso) {
        super(nome);
        this.email = email;
        this.curso = curso;
    }

    public long getIdEstudante() {
        return idEstudante;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CursoModel getCurso() {
		return curso;
	}

	public void setCurso(CursoModel curso) {
		this.curso = curso;
	}
    
    

}
