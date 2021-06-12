
package imoveis;

import java.util.Scanner;


public  class Imoveis{

    
    public static void main(String[] args) {
        
        Scanner input;
        int opcao;
        double area;
        boolean wcLojas; 
        int numeroporta; 
        boolean cidade;
        LojasComerciais lojascomerciais;
        
        int tipoMoradias; 
        double areaImpla;
        double areaTotalCoberta; 
        double areaTerrenoEnvolvente;
        int quartos; 
        int wc;
        Moradias moradia;
        
        
        int tipoApart;
        double areaTotalApart;  
        int andarApart;
        boolean garagemApart;
        Apartamentos apartamentos;
        
        
         
        boolean construcaoHabitacao; 
        boolean construcaoArmazens; 
        double canalizacoes;
        double redeEletrica;
        boolean esgotos;
        Terreno terrenos;
        
        double precoMin;
        String endereco;
        
        
        double totalAPagar;
        String classificaImovel;
        
        
        input = new Scanner(System.in);
        do {
        System.out.println("==================================================");
        System.out.println("=============       「 MENU 」        =============");
        System.out.println("==================================================");
        System.out.println("=============      「 Moradias 」[1]     ==========");
        System.out.println("==================================================");
        System.out.println("=============    「 Apartamentos 」[2]   ==========");
        System.out.println("==================================================");
        System.out.println("=============  「 Lojas Comerciais 」[3] ==========");
        System.out.println("==================================================");
        System.out.println("=============     「 Terrenos 」[4]     ===========");
        System.out.println("==================================================");
        System.out.println("=============     「 Fechar 」[0]     =============");
        System.out.println("==================================================");
        System.out.println("");
        System.out.print("Introduza o tipo de Imóvel a que deseja aceder: ");
        opcao = input.nextInt();
        
        System.out.println("==============================================");
        
        switch (opcao) {
            
            case 0:
                System.out.println("Programa terminado com sucesso");
                System.out.println("==============================================");
                    break;
            
            case 1:
                
                System.out.println("Menu Moradias Aberto.");
                
                System.out.println("Qual é o tipo de Moradia?  「 isolada 」[1] , 「 geminada 」[2] , 「 banda 」[3] , 「 gaveto 」[4] ");
                tipoMoradias = input.nextInt();
                
                System.out.println("Qual é a área Implantada?");
                areaImpla = input.nextDouble();
                
                System.out.println("Qual é a área Total Coberta?");
                areaTotalCoberta = input.nextDouble();
                
                System.out.println("Qual é a área do Terreno Envolvente?");
                areaTerrenoEnvolvente = input.nextDouble();
                
                System.out.println("Quantos quartos tem?");
                quartos = input.nextInt();
                
                System.out.println("Quantas Wc?");
                wc = input.nextInt();
                
                System.out.println("Qual é o seu endereço?");
                endereco =input.next();
                    input.nextLine();
                
                System.out.println("Qual é o numero da Porta?");
                numeroporta= input.nextInt();
                
              
                System.out.println("Situa-se na cidade?");
                cidade = input.nextBoolean();
                
                System.out.print("Introduza o valor que pretende vender este Imovel: ");
                precoMin = input.nextDouble();
                
                
                moradia = new Moradias (endereco, cidade, precoMin, tipoMoradias, areaImpla , areaTotalCoberta, areaTerrenoEnvolvente, quartos, wc, numeroporta  );
                totalAPagar = moradia.valorMoradia();
                
                
                System.out.println("\nTOTAL A PAGAR");
                System.out.println("================================================");
                System.out.printf("%.2f eur.\n\n", totalAPagar);
                
                if( totalAPagar >= ( precoMin * 0.5) + precoMin  ) {
       
                classificaImovel = "é um excelente negócio.";
                    }
                
                else {
                classificaImovel = "é um mau negocio.";
                     }
                
                System.out.println("Estivemos a avaliar e " + classificaImovel);
                
                
                
                break;
                
            case 2:
                
                System.out.println("Menu Apartamentos Aberto.");
                
                
                System.out.println("Qual é o tipo de Apartamento?  「 simples 」[1] , 「 duplex 」[2] , 「 triplex 」[3]");
                tipoApart = input.nextInt();
                
                System.out.println("Qual é a área total do Apartamento?");
                areaTotalApart = input.nextDouble();
                
                System.out.println("Quantos quartos tem?");
                quartos = input.nextInt();
                
                System.out.println("Quantos wc tem?");
                wc = input.nextInt();
                
                System.out.println("Qual é o numero da porta?");
                numeroporta = input.nextInt();
                
                System.out.println("Qual é o seu endereço?");
                endereco = input.next();
                    input.nextLine();
                
                System.out.println("Quantos andares tem?");
                andarApart = input.nextInt();
                
                System.out.println("Possui Garagem?");
                garagemApart= input.nextBoolean();
                
                System.out.println("Situa-se na cidade?");
                cidade = input.nextBoolean();
                
                System.out.print("Introduza o valor que pretende vender este Imovel: ");
                precoMin = input.nextDouble();
                
                apartamentos = new Apartamentos (endereco, cidade, precoMin, tipoApart, areaTotalApart , quartos, wc, numeroporta, andarApart, garagemApart  );
                totalAPagar = apartamentos.valorApart();
                

                
                System.out.println("\nTOTAL A PAGAR");
                System.out.println("================================================");
                System.out.printf("%.2f eur.\n\n", totalAPagar);
                
                if( totalAPagar >= ( precoMin * 0.5) + precoMin  ) {
       
                classificaImovel = "é um excelente negócio.";
                    }
                
                else {
                classificaImovel = "é um mau negocio.";
                     }
                
                System.out.println("Estivemos a avaliar e " + classificaImovel);
                System.out.println("================================================");
                
                break;
            case 3:
                
                System.out.println("Menu Lojas Comerciais Aberto.");
                
                System.out.println("Qual é a área da sua Loja Comercial (m2)?");
                area = input.nextDouble();
                
                
                System.out.println("Possui Wc?");
                wcLojas = input.nextBoolean();
                
                System.out.println("Qual é o seu endereço?");
                endereco = input.next();
                    input.nextLine();
                
                System.out.println("Qual é o numero da sua porta?");
                numeroporta = input.nextInt();
                
                System.out.println("Situa-se na cidade?");
                cidade = input.nextBoolean();
                
                System.out.print("Introduza o valor que pretende vender este Imovel: ");
                precoMin = input.nextDouble();
                
                
                lojascomerciais = new LojasComerciais (endereco, cidade, precoMin,   area,  wcLojas,  numeroporta);
                totalAPagar = lojascomerciais.valorLojasComerciais();
                
                System.out.println("\nTOTAL A PAGAR");
                System.out.println("================================================");
                System.out.printf("%.2f eur.\n\n", totalAPagar);
                
                
                if( totalAPagar >= ( precoMin * 0.5) + precoMin  ) {
       
                classificaImovel = "é um excelente negócio.";
                    }
                
                else {
                classificaImovel = "é um mau negocio.";
                     }
                
                System.out.println("Estivemos a avaliar e " + classificaImovel);
                
                break;

                
            case 4:
                
                System.out.println("Menu Terrenos Aberto.");
                
                System.out.println("Qual é a area do Terreno?");
                area = input.nextDouble();
                
                System.out.println("Pode contruir habitação?");
                construcaoHabitacao = input.nextBoolean();
                
                System.out.println("Pode contruir Armazens?");
                construcaoArmazens = input.nextBoolean();
                
                System.out.println("Quantos metros de canalizacoes?");
                canalizacoes = input.nextDouble();
                
                System.out.println("Quantos metros de rede eletrica?");
                redeEletrica = input.nextInt();
                
                System.out.println("Tem esgotos?");
                esgotos = input.nextBoolean();
                
                System.out.println("Qual é o seu endereço?");
                endereco = input.next();
                    input.nextLine();
                
                System.out.println("Situa-se na cidade?");
                cidade = input.nextBoolean();
                
                System.out.print("Introduza o valor que pretende vender este Imovel: ");
                precoMin = input.nextDouble();
                
                terrenos = new Terreno ( endereco, cidade, precoMin,  area,  construcaoHabitacao,  construcaoArmazens, canalizacoes,  redeEletrica, esgotos );
                totalAPagar = terrenos.valorTerreno();
                
                System.out.println("\nTOTAL A PAGAR");
                System.out.println("================================================");
                System.out.printf("%.2f eur.\n\n", totalAPagar);
                
                if( totalAPagar >= ( precoMin * 0.5) + precoMin  ) {
       
                classificaImovel = "é um excelente negócio.";
                    }
                
                else {
                classificaImovel = "é um mau negocio.";
                     }
                
                System.out.println("Estivemos a avaliar e " + classificaImovel);
                
                break;
            }
            } while (opcao != 0);
        
    }
    
}
