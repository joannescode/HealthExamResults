
import javax.swing.JOptionPane;

public class Colesterol extends Exame {

    private double quantidadeLDL;
    private double quantidadeHDL;

    public Colesterol(String nomePaciente, int anoNascimento, String tipoSanguineo) {
        super(nomePaciente, anoNascimento, tipoSanguineo);
        this.quantidadeLDL = 0.0; // Valor padrão ao criar a instância
        this.quantidadeHDL = 0.0; // Valor padrão ao criar a instância
    }

    public double getQuantidadeLDL() {
        return quantidadeLDL;
    }

    public void setQuantidadeLDL(double quantidadeLDL) {
        this.quantidadeLDL = quantidadeLDL;
    }

    public double getQuantidadeHDL() {
        return quantidadeHDL;
    }

    public void setQuantidadeHDL(double quantidadeHDL) {
        this.quantidadeHDL = quantidadeHDL;
    }

    public String ClassifLDL() {
        if (quantidadeLDL < 50) {
            return "Risco Alto";
        } else if (quantidadeLDL < 70) {
            return "Risco Médio";
        } else if (quantidadeLDL < 100) {
            return "Risco Baixo";
        } else {
            return "Sem Classificação";
        }
    }

    public String ClassifHDL() {
        int idade = 2023 - getAnoNascimento();

        if (idade <= 19 && quantidadeHDL > 45) {
            return "Bom";
        } else if (idade >= 20 && quantidadeHDL >= 40) {
            return "Bom";
        } else {
            return "Ruim";
        }
    }

    public static void main(String[] args) {
        String nomePaciente = JOptionPane.showInputDialog("Nome do Paciente:");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento:"));
        String tipoSanguineo = JOptionPane.showInputDialog("Tipo Sanguíneo:");
        double quantidadeLDL = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de LDL (mg/dL):"));
        double quantidadeHDL = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de HDL (mg/dL):"));

        Colesterol exameColesterol = new Colesterol(nomePaciente, anoNascimento, tipoSanguineo);
        exameColesterol.setQuantidadeLDL(quantidadeLDL);
        exameColesterol.setQuantidadeHDL(quantidadeHDL);

        String classificacaoLDL = exameColesterol.ClassifLDL();
        String classificacaoHDL = exameColesterol.ClassifHDL();

        JOptionPane.showMessageDialog(null, "Resultado do Exame:\n"
                + exameColesterol.toString()
                + "\nQuantidade de LDL: " + exameColesterol.getQuantidadeLDL() + " mg/dL"
                + "\nQuantidade de HDL: " + exameColesterol.getQuantidadeHDL() + " mg/dL"
                + "\nClassificação LDL: " + classificacaoLDL
                + "\nClassificação HDL: " + classificacaoHDL);
    }
    
    @Override
    public String toString() {
        return "Exame de Colesterol\n"
                + "Nome do Paciente: " + getNomePaciente()
                + "\nAno de Nascimento: " + getAnoNascimento()
                + "\nTipo Sanguíneo: " + getTipoSanguineo();
    }

}
