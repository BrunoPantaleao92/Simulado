package br.edu.up;

import br.edu.up.Controller.ControleDePessoas;
import br.edu.up.View.TelaPrincipal;

public class Programa {
    public static void main(String[] args) {
        // Inicializa os arquivos de Dados.
        ControleDePessoas controleDePessoas = new ControleDePessoas();
        TelaPrincipal tela = new TelaPrincipal();
        tela.mostrarMenuPrincipal();
    }
}
