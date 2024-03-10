
import javax.swing.JOptionPane;

public class Triglicerideos extends Exame {

    private double quantidadeTriglicerideos;

    public Triglicerideos(String nomePaciente, int anoNascimento, String tipoSanguineo) {
        super(nomePaciente, anoNascimento, tipoSanguineo);
        this.quantidadeTriglicerideos = 0.0; // Valor padrão ao criar a instância
    }

    public double getQuantidadeTriglicerideos() {
        return quantidadeTriglicerideos;
    }

    public void setQuantidadeTriglicerideos(double quantidadeTriglicerideos) {
        this.quantidadeTriglicerideos = quantidadeTriglicerideos;
    }

    public String ClassifTrig() {
        int idade = 2023 - getAnoNascimento();
        boolean emJejum = JOptionPane.showConfirmDialog(null, "O paciente estava em jejum?", "Jejum", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        if (idade >= 0 && idade <= 9 && emJejum && quantidadeTriglicerideos < 75) {
            return "Inferior a 75mg/dL - Bom";
        } else if (idade >= 10 && idade <= 19 && emJejum && quantidadeTriglicerideos < 90) {
            return "Inferior a 90mg/dL - Bom";
        } else if (idade >= 20 && emJejum && quantidadeTriglicerideos < 150) {
            return "Inferior a 150mg/dL - Bom";
        } else {
            return "Não Bom";
        }
    }

    public static void main(String[] args) {
        String nomePaciente = JOptionPane.showInputDialog("Nome do Paciente:");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento:"));
        String tipoSanguineo = JOptionPane.showInputDialog("Tipo Sanguíneo:");
        double quantidadeTriglicerideos = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de Triglicerídeos (mg/dL):"));

        Triglicerideos exameTriglicerideos = new Triglicerideos(nomePaciente, anoNascimento, tipoSanguineo);
        exameTriglicerideos.setQuantidadeTriglicerideos(quantidadeTriglicerideos);

        String classificacaoTrig = exameTriglicerideos.ClassifTrig();

        JOptionPane.showMessageDialog(null, "Resultado do Exame:\n"
                + exameTriglicerideos.toString()
                + "\nQuantidade de Triglicerídeos: " + exameTriglicerideos.getQuantidadeTriglicerideos() + " mg/dL"
                + "\nClassificação Triglicerídeos: " + classificacaoTrig);
    }

    @Override
    public String toString() {
        return "Exame de Triglicerídeos\n"
                + "Nome do Paciente: " + getNomePaciente()
                + "\nAno de Nascimento: " + getAnoNascimento()
                + "\nTipo Sanguíneo: " + getTipoSanguineo();
    }

}
