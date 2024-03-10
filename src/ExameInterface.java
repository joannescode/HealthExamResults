
import javax.swing.JOptionPane;

public class ExameInterface {

    public static void main(String[] args) {
        int escolhaExame = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha o exame:\n"
                + "1. Colesterol\n"
                + "2. Glicemia\n"
                + "3. Triglicerídeos"));

        String nomePaciente = JOptionPane.showInputDialog("Nome do Paciente:");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento:"));
        String tipoSanguineo = JOptionPane.showInputDialog("Tipo Sanguíneo:");

        switch (escolhaExame) {
            case 1:
                realizarExameColesterol(nomePaciente, anoNascimento, tipoSanguineo);
                break;

            case 2:
                realizarExameGlicemia(nomePaciente, anoNascimento, tipoSanguineo);
                break;

            case 3:
                realizarExameTriglicerideos(nomePaciente, anoNascimento, tipoSanguineo);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }

    private static void realizarExameColesterol(String nomePaciente, int anoNascimento, String tipoSanguineo) {
        double quantidadeLDL = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de LDL (mg/dL):"));
        double quantidadeHDL = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de HDL (mg/dL):"));
        Colesterol exameColesterol = new Colesterol(nomePaciente, anoNascimento, tipoSanguineo);
        exameColesterol.setQuantidadeLDL(quantidadeLDL);
        exameColesterol.setQuantidadeHDL(quantidadeHDL);
        String classificacaoLDL = exameColesterol.ClassifLDL();
        String classificacaoHDL = exameColesterol.ClassifHDL();
        String resultadosColesterol = "Exame de Colesterol:\n"
                + "\nQuantidade de LDL: " + exameColesterol.getQuantidadeLDL() + " mg/dL"
                + "\nQuantidade de HDL: " + exameColesterol.getQuantidadeHDL() + " mg/dL"
                + "\nClassificação LDL: " + classificacaoLDL
                + "\nClassificação HDL: " + classificacaoHDL;
        JOptionPane.showMessageDialog(null, resultadosColesterol);
    }

    private static void realizarExameGlicemia(String nomePaciente, int anoNascimento, String tipoSanguineo) {
        double quantidadeGlicose = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de Glicose (mg/dL):"));
        Glicemia exameGlicemia = new Glicemia(nomePaciente, anoNascimento, tipoSanguineo);
        exameGlicemia.setQuantidadeGlicose(quantidadeGlicose);
        String classificacaoGlicose = exameGlicemia.ClassifGlice();
        String resultadosGlicemia = "Exame de Glicemia:\n"
                + "\nQuantidade de Glicose: " + exameGlicemia.getQuantidadeGlicose() + " mg/dL"
                + "\nClassificação Glicemia: " + classificacaoGlicose;
        JOptionPane.showMessageDialog(null, resultadosGlicemia);
    }

    private static void realizarExameTriglicerideos(String nomePaciente, int anoNascimento, String tipoSanguineo) {
        double quantidadeTriglicerideos = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de Triglicerídeos (mg/dL):"));
        Triglicerideos exameTriglicerideos = new Triglicerideos(nomePaciente, anoNascimento, tipoSanguineo);
        exameTriglicerideos.setQuantidadeTriglicerideos(quantidadeTriglicerideos);
        String classificacaoTriglicerideos = exameTriglicerideos.ClassifTrig();
        String resultadosTriglicerideos = "Exame de Triglicerídeos:\n"
                + "\nQuantidade de Triglicerídeos: " + exameTriglicerideos.getQuantidadeTriglicerideos() + " mg/dL"
                + "\nClassificação Triglicerídeos: " + classificacaoTriglicerideos;
        JOptionPane.showMessageDialog(null, resultadosTriglicerideos);
    }
}
