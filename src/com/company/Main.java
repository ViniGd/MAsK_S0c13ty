package com.company;

import Membros.Membro;
import Membros.TiposDeMembros;
import Membros.TiposDeHorario;
import Membros.PostarMensagem;
import Sistema.Sistema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner menuInput = new Scanner(System.in);
        int escolhaMenuInicial;
        int escolhaMenuMembro;
        List<Membro> membros = new ArrayList<Membro>();
        String[] dadosTemps;
        String email,senha,nome;
        Membro membroTemp;

        do {
            menuInicial();
            escolhaMenuInicial = menuInput.nextInt();
            menuInput.nextLine();

            switch(escolhaMenuInicial) {
                case 1 -> { // Caso 1 realiza o login e avança para as funçoes do usuario
                    dadosTemps = menuLogin(menuInput);
                    email = dadosTemps[0];
                    senha = dadosTemps[1];
                    Arrays.fill(dadosTemps, null);
                    membroTemp = acharContaPorCredenciais(membros, email, senha);
                    if(membroTemp != null){
                        do{
                            menuMembro(membroTemp);
                            escolhaMenuMembro = menuInput.nextInt();
                            menuInput.nextLine();

                            switch (escolhaMenuMembro){
                                case 1:
                                    Sistema Sistema = new Sistema();
                                    Sistema.PostarMensagem();

                                    break;

                                case 2:
                                    Sistema Sistema = new Sistema();
                                    Sistema.TipoDeHorario();

                                    break;

                                case 3:
                                    System.out.println("Ate mais amigo");
                                    break;

                                default:
                                    System.out.println("Eu não to te entendendo");
                                    System.out.print("Precione enter para voltar");
                                    menuInput.nextLine();
                            }
                        } while (escolhaMenuMembro != 2);
                    }
                }


                case 2 -> { // Caso 2 realiza o cadastro de um novo membro
                    dadosTemps = menuCadastrar(menuInput);
                    email = dadosTemps[0];
                    senha = dadosTemps[1];
                    nome = dadosTemps[2];
                    TiposDeMembros = dadosTemps[3];

                    membros.add(new Membro(nome, senha, email, TiposDeMembros));
                    System.out.println("Voce foi cadastrado, agora so fazer login meu rei");
                    System.out.print("Precione enter para voltar");
                    menuInput.nextLine();
                    break;
                }
            }
        }while(escolhaMenuInicial = 2);


    }
    private static void menuInicial(){
        // Menu inicial do programa
        System.out.println("Seja bem vindo.\n" +
                "Deseja fazer login ou se cadastrar?\n" +
                "1- Login\n" +
                "2- Finalizar");

    }

    private static String[] menuLogin(Scanner userInput){
        // Função para realizar o login do usuario
        System.out.println(
                "=====================\n"+
                        "Por favor se identifique parceiro\n"+
                        "Email: "
        );
        String Email = userInput.nextLine();
        System.out.println(
                "Senha: "
        );
        String Senha = userInput.nextLine();

        return new String[]{Email, Senha};
    }

    private static String[] menuCadastrar(Scanner userInput){
        // Função para cadastrar os usuarios
        System.out.println(
                "=====================\n"+
                        "Bora se cadastrar\n"+
                        "Email: "
        );
        String Email = userInput.nextLine();
        System.out.println("Senha: ");
        String Senha = userInput.nextLine();
        System.out.println("Nome: ");
        String Nome = userInput.nextLine();
        System.out.println("Qual seu tipo de membro? ");
        TiposDeMembros TiposDeMembros = userInput.nextLine();

        return new String[]{Email, Senha, Nome, TiposDeMembros};
    }

    private static Membro acharContaPorCredenciais(List<Membro> membros, String email, String senha){
        // Procura no array se as credenciais são compativeis
        // Apagar esse coment dps: Montar as funçoes checar
        for (Membro membro : membros){
            if (Membro.checarDadosDeUsuario(email,senha)){
                return membro;
            }
        }
        return null;
    }

    private static String[] menuMembro(Membro membro) {
        // Menu após o login
        // Apagar esse coment dps: Montar as funções get
        System.out.println(
                "=====================\n" +
                        "Seja Bem Vindo " + membro.Nome() + "\n" +
                        "Voce esta em seu Horario " + Sistema.TipoDeHorario + "\n" +
                        "1 - Postar mensagem\n" +
                        "2 - Trocar Horario\n" +
                        "3 - Voltar ao menu inicial"
        );
    }


