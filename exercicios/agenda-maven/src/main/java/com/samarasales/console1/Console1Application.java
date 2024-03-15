package com.samarasales.console1;

import com.samarasales.console1.entidades.Contato;
import com.samarasales.console1.repositorios.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Console1Application implements CommandLineRunner {
    @Autowired
    private ContatoRepository contatoRepository;

    @Override
    public void run(String... args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        while (true) {

            System.out.println("MENU DE OPÇÕES:");
            System.out.println("1. Adicionar um contato");
            System.out.println("2. Listar os contatos");
            System.out.println("3. Excluir um contato");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");

            int opcao = Integer.parseInt(teclado.nextLine());

            if (opcao == 1) {
                System.out.print("Digite um nome: ");
                String nome = teclado.nextLine();
                System.out.print("Digite o telefone: ");
                String telefone = teclado.nextLine();
                System.out.print("Digite o email: ");
                String email = teclado.nextLine();

                Contato novo = new Contato();
                novo.setNome(nome);
                novo.setTelefone(telefone);
                novo.setEmail(email);

                contatoRepository.save(novo);
            } else if (opcao == 2) {
                System.out.println("ID | Nome | Telefone | Email");
                for (Contato c : contatoRepository.findAll()) {
                    System.out.println(c.getId() + " | " + c.getNome() + " | " + c.getTelefone() + " | " + c.getEmail());
                }
            } else if (opcao == 3) {
                System.out.print("Digite o ID do contato que deseja excluir: ");
                Long id = Long.parseLong(teclado.nextLine());
                if (contatoRepository.existsById(id)) {
                    contatoRepository.deleteById(id);
                    System.out.println("Contato excluído com sucesso!");
                } else {
                    System.out.println("Contato não encontrado.");
                }
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Console1Application.class, args);
    }
}
