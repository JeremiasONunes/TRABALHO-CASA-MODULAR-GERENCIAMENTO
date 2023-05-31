package Models;

import services.Personalizacao;
import services.Relatorio;

public class Main {
    public static void main(String[] args) {
        // Criar objeto de Endereco
        Endereco endereco = new Endereco("Rua Exemplo", "Bairro Exemplo", "Cidade Exemplo", "12345-678", 123);

        // Criar objeto de Cliente
        Cliente cliente = new Cliente("Fulano", "fulano@example.com", 123456789);
        cliente.setEndereco(endereco);

        // Criar objeto de Modulo
        Modulo modulo = new Modulo("Módulo Exemplo", "Tipo Exemplo");

        // Criar objeto de Orcamento
        Orcamento orcamento = new Orcamento(1000.0, 500.0);

        
        

        // Adicionar personalizacoes ao modulo
        Personalizacao personalizacao1 = new Personalizacao("Personalizacao 1");
        Personalizacao personalizacao2 = new Personalizacao("Personalizacao 2");
        
     // Criar objeto de Projeto e adicionar o modulo
        Projeto projeto = new Projeto("Projeto Exemplo", cliente, orcamento, modulo);
        modulo.adicionarPersonalizacao(personalizacao1);
        modulo.adicionarPersonalizacao(personalizacao2);

        // Criar objeto de Relatorio e exibir todas as informações
        Relatorio relatorio = new Relatorio(projeto);
        System.out.println(relatorio.toString());
    }
}