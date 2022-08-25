package avaliaçãounid2;

import javax.swing.JOptionPane;

public class CodeForca {
    void forca (JogoForca Tela) {
        
        String palavras[]={"batata","ninja","pente","bola","polvo","jogo","carro","quadro","forca","rainha"};
        String dicas[]={"Planta tubérculo", "Anda pelas sombras", "Arruma os cabelos","Serve para jogar","Tentáculos","Diversão","Transporta","Enfeita com imagens","O jogo que estás jogando","Elizabeth Imortal"};
        int tentativas = 6;
        int j = 0; //tentativa extra
        
        int index=(int) (Math.random()*palavras.length); //escolhe um número aleatório
        String wordselecionada = palavras[index]; //escolhe a palavra referente ao número
        int wordlength = wordselecionada.length();
        char traço[]=new char[wordlength];
        char letrasUtilizadas[] = new char[26];
        
        String letrasrepetidas = " ";// letras utilizadas impressas na interface
               
        for(int i = 0; i < wordlength; i++){ //preenche o array "traço" com traços no tamanho da palavra
            traço[i] = '_';
        }
        
        while(wordlength > 0 && tentativas > 0){
            if(tentativas==1){
                if(j == 0){
                JOptionPane.showMessageDialog(null, "Se liga na dica! ;)");
                Tela.setLabelDicas(dicas[index]);
                JOptionPane.showMessageDialog(null, "Agora tá fácil, né? Toma essa tentativa extra só por precaução.");
                tentativas++;
                }
                j = 1;
            }
            
            System.out.println("Você possui " + tentativas + " tentativas");
            System.out.println("Ainda faltam " + wordlength + " letras");
            System.out.println("Digite uma letra: ");
            
            for (int i = 0; i < wordselecionada.length(); i++) { //printa no terminal os traços da palavra
                System.out.print(" " + traço[i] + " ");
            }
            System.out.println();//pular uma linha
            System.out.println();//pular uma linha
            System.out.println();//pular uma linha
            
            String letrainf=JOptionPane.showInputDialog(null,"Você possui "+tentativas+" tentativas.\n"
                    + "Ainda faltam "+wordlength+" letras.\n"
                    + "Digite uma letra: ");
                       
            char letra = letrainf.toUpperCase().charAt(0); //atribuir a "letra" apenas o primeiro elemento da String letrainf
            
            for(int z = 0; z < letrasUtilizadas.length; z++){
                
                if(letrasUtilizadas[z] == letra){
                    JOptionPane.showMessageDialog(null, "Você já utilizou essa letra, escolha outra.");
                    break;
                }else{
                    letrasUtilizadas[z] = letra;
                }
                letrasrepetidas += letrasUtilizadas[z] + " ";
                Tela.setLabelLetter(letrasrepetidas);
                break;
            }
            
            boolean letracerta = false; //definido como false pois ainda não sei se a letra é correta
            for (int i = 0; i < wordselecionada.length(); i++) { //for para analisar se a letra informada condiz com alguma letra da palavra

                if (wordselecionada.toUpperCase().charAt(i) == letra) {
                    traço[i] = letra; //substitui a letra no traço correspondente
                    wordlength--;
                    letracerta = true;
                }
            }
               
            if(!letracerta){
                tentativas--;
            }
        } //fim do while
        
        Tela.setLabelWord("A palavra é: " + wordselecionada.toUpperCase()); //manda pro Jlabel para exibir a palavra
        System.out.println("A palavra é: " + wordselecionada.toUpperCase()); //manda pro terminal exibir
        
        if(wordlength<=0){
            JOptionPane.showMessageDialog(null,"Aí sim, hein!? Tá manjando bem.");
        }else{
            JOptionPane.showMessageDialog(null, "Infelizmente tu ficou sem tentativas, e ainda tentei te ajudar.  ;(\nA palavra era '"+wordselecionada+"'.");
        }
        Tela.setLabelDicas("---");
        Tela.setLabelWord("Observe o TERMINAL para acompanhar seu progresso!");
        Tela.setLabelLetter("Nenhuma até agora.");
  }
}