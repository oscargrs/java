package school.sptech;

import javax.swing.JOptionPane;

public class teste2 {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        nome = nome.toLowerCase();
        String resultado = "Você é ";

        if (nome.equals("samara")) {
            resultado += "safada";
        } else if ("gan".equalsIgnoreCase(nome) || "garban".equalsIgnoreCase(nome) || "vini".equalsIgnoreCase(nome) || "vinicius".equalsIgnoreCase(nome) || "vinícius".equalsIgnoreCase(nome) || "vinicíus".equalsIgnoreCase(nome) || "vinícius sales garban".equalsIgnoreCase(nome) || "vinicius sales garban".equalsIgnoreCase(nome)) {
            resultado += "gay";
        } else if ("cauã".equalsIgnoreCase(nome) || "caua".equalsIgnoreCase(nome)) {
            resultado += "minininho";
        } else if ("oscar".equalsIgnoreCase(nome) || "óscar".equalsIgnoreCase(nome)) {
            resultado += "minininho";
        } else if ("camila".equalsIgnoreCase(nome) || "nefertite".equalsIgnoreCase(nome)) {
            resultado += "loba";
        } else if ("nicolas".equalsIgnoreCase(nome)) {
            resultado += "imortal";
        } else if ("kris".equalsIgnoreCase(nome)) {
            resultado += "escoteiro";
        } else if ("pietro".equalsIgnoreCase(nome)) {
            resultado += "bagulhado";
        } else if ("felps".equalsIgnoreCase(nome)) {
            resultado += "um amante de gordas";
        } else if ("elisandro".equalsIgnoreCase(nome)) {
            resultado += "o GOAT";
        } else if ("manoel".equalsIgnoreCase(nome)) {
            resultado += "comedor de garrafas";
        } else if ("tawan".equalsIgnoreCase(nome)) {
            resultado = "Vai se foder Tawan!!!";
        } else {
            resultado += "normal";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
