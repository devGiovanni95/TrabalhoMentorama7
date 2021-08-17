package br.com.sistema.hospitalar.dto;

public class ProfissionalSaudeDTO {

        private long id;
        private int matricula;
        private String nome;
        private String departamento;
        private String telefoneProfissional;

        public ProfissionalSaudeDTO(){

        }

    public ProfissionalSaudeDTO(long id, int matricula, String nome, String departamento, String telefoneProfissional) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.telefoneProfissional = telefoneProfissional;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTelefoneProfissional() {
        return telefoneProfissional;
    }

    public void setTelefoneProfissional(String telefoneProfissional) {
        this.telefoneProfissional = telefoneProfissional;
    }
}
