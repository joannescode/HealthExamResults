
public class Exame {

    private String nomePaciente;
    private int anoNascimento;
    private String tipoSanguineo;

    public Exame(String nomePaciente, int anoNascimento, String tipoSanguineo) {
        this.nomePaciente = nomePaciente;
        this.anoNascimento = anoNascimento;
        this.tipoSanguineo = tipoSanguineo;
    }

    // Métodos getters e setters
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
}
