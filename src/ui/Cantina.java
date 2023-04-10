package ui;
import br.newtonpaiva.Ingrediente;
import br.newtonpaiva.Pedido;
import br.newtonpaiva.Cliente;
import br.newtonpaiva.Massa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.concurrent.Callable;

public class Cantina {

    public static void main(String[] args) {

        String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente: ");

        String nomeMassa = JOptionPane.showInputDialog("Informe o nome da massa: ");

        Double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa: "));

        Integer ingredienteEscolhido = 0;

        int opcao = 0;


        Pedido p1 = new Pedido();
        p1.setLista(new ArrayList<>());
        Cliente c1 = new Cliente();
        c1.nome = nomeCliente;
        Massa massa1 = new Massa();
        massa1.setTipo(nomeMassa);
        massa1.setValor(valorMassa);


        while (ingredienteEscolhido != 5) {
            ingredienteEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Informe os ingredientes escolhidos: \n 1-Bacon \n 2-Mussarela \n 3-Tomate \n 4-Queijo \n 5- Sair \n \n *Cada ingrediente terá um acréscimo de 2 reais"));

            switch (ingredienteEscolhido) {
                case 1:
                    Ingrediente ingr1 = new Ingrediente();
                    ingr1.setNome("Bacon");
                    p1.getLista().add(ingr1);
                    break;

                case 2:
                    Ingrediente ingr2 = new Ingrediente();
                    ingr2.setNome("Mussarela");
                    p1.getLista().add(ingr2);
                    break;

                case 3:
                    Ingrediente ingr3 = new Ingrediente();
                    ingr3.setNome("Tomate");
                    p1.getLista().add(ingr3);
                    break;

                case 4:
                    Ingrediente ingr4 = new Ingrediente();
                    ingr4.setNome("Queijo");
                    p1.getLista().add(ingr4);
                    break;

            }
        }

        String mensagem = "";
        int posicao = 0;

        for (Ingrediente item : p1.getLista()){
            if (posicao == p1.getLista().size() - 2){
                mensagem += item.getNome() + " e ";
            }
            else if (posicao == p1.getLista().size() - 1){
                mensagem += item.getNome() + ".";
            }
            else {
                mensagem += item.getNome() + ", ";
            }
            posicao ++;

        }
        p1.calculaValor(massa1);
        JOptionPane.showMessageDialog(null, "O pedido feito para " + c1.nome + "\n" + massa1.getTipo() + " com " + mensagem + "\nValor:  " + p1.getValorTotal(), "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
}