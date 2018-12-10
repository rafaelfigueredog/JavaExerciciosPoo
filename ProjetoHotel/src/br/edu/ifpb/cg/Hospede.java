package br.edu.ifpb.cg;

import java.util.Date;

public class Hospede extends Pessoa {

    private Date dataNascimento;

    public Hospede(Long id, String nome, String cpf, Date dataNascimento) {
        super(id, nome, cpf);
        this.dataNascimento = dataNascimento;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    @Override
    public String toString() {
        return "Hospede{" +
                "dataNascimento=" + dataNascimento +
                '}';
    }
}
