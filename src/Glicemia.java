
import javax.swing.JOptionPane;

public class Glicemia extends Exame {

    private double quantidadeGlicose;

    public Glicemia(String nomePaciente, int anoNascimento, String tipoSanguineo) {
        super(nomePaciente, anoNascimento, tipoSanguineo);
        this.quantidadeGlicose = 0.0; // Valor padrão ao criar a instância
    }

    public double getQuantidadeGlicose() {
        return quantidadeGlicose;
    }

    public void setQuantidadeGlicose(double quantidadeGlicose) {
        this.quantidadeGlicose = quantidadeGlicose;
    }

    public String ClassifGlice() {
        if (quantidadeGlicose < 100) {
            return "Normoglicemia";
        } else if (quantidadeGlicose >= 100 && quantidadeGlicose < 126) {
            return "Pré-diabete";
        } else {
            return "Diabete";
        }
    }

    public static void main(String[] args) {
        String nomePaciente = JOptionPane.showInputDialog("Nome do Paciente:");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento:"));
        String tipoSanguineo = JOptionPane.showInputDialog("Tipo Sanguíneo:");
        double quantidadeGlicose = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de Glicose (mg/dl):"));

        Glicemia exameGlicemia = new Glicemia(nomePaciente, anoNascimento, tipoSanguineo);
        exameGlicemia.setQuantidadeGlicose(quantidadeGlicose);

        String classificacao = exameGlicemia.ClassifGlice();

        JOptionPane.showMessageDialog(null, "Resultado do Exame:\n"
                + exameGlicemia.toString()
                + "\nQuantidade de Glicose: " + exameGlicemia.getQuantidadeGlicose() + " mg/dl"
                + "\nClassificação: " + classificacao);
    }

    @Override
    public String toString() {
        return "Exame de Glicemia\n"
                + "Nome do Paciente: " + getNomePaciente()
                + "\nAno de Nascimento: " + getAnoNascimento()
                + "\nTipo Sanguíneo: " + getTipoSanguineo();
    }

}
