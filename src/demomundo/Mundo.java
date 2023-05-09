/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demomundo;


import java.util.ArrayList;
import java.util.Random;



/**
 *
 * @author João Vitor
 */
public class Mundo {
    private ArrayList<Pessoa> pessoasmundo = new ArrayList<>();

    

    MeioComunicacaoConfiavel meio = new MeioComunicacaoConfiavel();
    IADestruidoraFakeNews iADestruidora = new IADestruidoraFakeNews();
    IAGeradoraFakeNews iaGeradoraFake = new IAGeradoraFakeNews();
    
    private int [][] mapa;


    
    public Mundo(){
        refazMapa();
    }

    //Getters e Setters
    public ArrayList<Pessoa> getPessoasmundo() {
        return pessoasmundo;
    }

    public void setPessoasmundo(ArrayList<Pessoa> pessoasmundo) {
        this.pessoasmundo = pessoasmundo;
    }


    
    
    public void refazMapa(){ 
        mapa = new int [][]
    {
         
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},//1
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//2
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//3
        {1,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,0,1},//4
        {1,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,0,1},//5
        {1,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,0,1},//6
        {1,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,0,1},//7
        {1,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,0,1},//8
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//9
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//10
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//11
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//12
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//13
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//14
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//15
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//16
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//17
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//18
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//19
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//20
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//21
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//22
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//23
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//24
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//25
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//26
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//27
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//28
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//29
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},//30
        
    };
}   

    public void desenhaMundo(){ //Colorir o mapa
        for(int i = 0 ; i < mapa.length;i++){
            for(int j = 0 ; j < mapa[i].length;j++){
                switch (mapa[i][j]){
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("\033[47m \033[0m");//Parede
                        break;
                    case 2:
                        System.out.print("\033[45m \033[0m"); //Ia Disseminadora de Fake News
                        break;
                    case 3:
                        System.out.print("\033[44m \033[0m"); // Ia destruidora de Fake News
                        break;
                    case 4:
                        //System.out.print("\033[46m \033[0m"); //Meio de Comunicação confiável
                        System.out.print("\033[47m \033[0m");
                        break;

                    case 5:
                        System.out.print("\033[43m \033[0m"); //Pessoa Bem Informada
                        break;
                    case 6:
                        System.out.print("\033[41m \033[0m"); //Pessoa Infectada!
                        break;
                    case 7:
                        System.out.print("\033[42m \033[0m"); //Pessoa Imune
                        break;
                    default:
                        break;
                }
            }
            System.out.println();
        } 
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    public void GerarPessoasMundo(ArrayList<Pessoa>pessoa){ 
        Random rand = new Random();
        for(int i = 0; i < 100; i++){
            pessoa.add(new PessoaBemInformada());
            pessoa.get(i).setX(rand.nextInt(1,28)); //Desconsidera-se as paredes de ambos os lados
            pessoa.get(i).setY(rand.nextInt(1,58)); 
            pessoa.get(i).setID(i); //Aki cada pessoa receberá um ID
            //System.out.println("Id = "+ pessoa.get(i).getID());


        }
    }
    
    public void DesenharPessoa(ArrayList<Pessoa>pessoa){
        int xAtual,yAtual;
        
        for(int i = 0 ; i < pessoa.size() ;i++){
            xAtual = pessoa.get(i).getX();
            yAtual = pessoa.get(i).getY();
           mapa[xAtual][yAtual] = pessoa.get(i).getCor(); //Coloca as pessoas pegando a cor padrao 5
        }
        
    }

    public void encontrarVizinhosDeUmaPessoa(Pessoa p){
        int posX = p.getX(); 
        int posY = p.getY();
     
        for(int i = posX-1; i <= posX + 1; i++){ //i representa a coordenada x e j a y, os loops percorrem todas as posições vizinhas apartir de (-1,-1) até (1,1)
            for(int j = posY-1; j <= posY + 1; j++){
                
                if(mapa[i][j] == 5 && (i != posX || j != posY)){ // verifica se a posição atual tem valor igual a 5 na matriz e se não é a mesma pessoa 
                    Pessoa pessoaEncontrada =  encontrarPessoasPorCoordenada(i, j); //verificação novamente 
                    if(pessoaEncontrada == null){ // se não houver apenas ignora e continua 
                        continue;
                    }
                    if(!p.pessoaExisteEmAgendaContatos(pessoaEncontrada.getID())){ //Verifica se o ID não sera o mesmo para não adicionar repetida vezes as mesmas pessoas
                        p.AdicionaAgendaContatos(pessoaEncontrada.getID()); 
                        pessoaEncontrada.AdicionaAgendaContatos(p.getID());
                        //System.out.println(p.getAgendaContatos() +" "+ pessoaEncontrada.getAgendaContatos());
                        
                    }
                }
            }
        }  
    }

    public Pessoa encontrarPessoasPorCoordenada(int posX, int posY){ 
        for (Pessoa pessoa : pessoasmundo) {
            if(pessoa.getX() == posX && pessoa.getY() == posY){ //Verifica se as pessoas tem as mesmas coordenadas, se sim retorna as pessoas encontradas
                return pessoa;    
            }
        }
        return null; //Se não encontrar ninguem retorna nada.
    }

 
    

    public void infectarPessoas(){
        for (Pessoa p : pessoasmundo) {

            //Verifica se a pessoa esta dentro da estrutura da IA de Fake News
            if(!p.isImune() && iaGeradoraFake.isDentroGeracaoFake(p.getX(), p.getY())){
                PessoaMalInformada pessoaInfectada = new PessoaMalInformada(p);
                for (int contato : pessoaInfectada.getAgendaContatos()) { //passa o contato como uma instancia do arrayList de agenda de contatos
                    if(!pessoasmundo.get(contato).isInfectado() && !pessoasmundo.get(contato).isImune()){ //Verifica se o arrayList de pessoas mundo esta infectado e se não esta imune
                        pessoasmundo.set(contato, new PessoaMalInformada(pessoasmundo.get(contato))); //se não estiver infectado e nem imune, a pessoa e a agenda é infectada
                        
                    }   
                }

                pessoaInfectada.setInfectado(true); //apos infecção marcada como infectada
                pessoasmundo.set(pessoaInfectada.getID(),pessoaInfectada); //Atualiza a pessoa infectada com os dados da infectada

            }
        }
    }    

    public void desinfectarPessoasMalInformadas(){
        for(Pessoa p : pessoasmundo){

            if(!p.isImune() && iADestruidora.isDentro(p.getX(), p.getY())){
                PessoaBemInformada pessoaDesinfectada = new PessoaBemInformada(p); // cria uma nova instância da classe PessoaBemInformada, que é uma subclasse da classe Pessoa
                for(int contato: pessoaDesinfectada.getAgendaContatos()){
                    if(pessoasmundo.get(contato).isInfectado() && !pessoasmundo.get(contato).isImune()){ //Verificação se o contato esta infectado e para isso acessa-se a lista de Pessoas e a função é chamada
                        pessoasmundo.set(contato, new PessoaBemInformada(pessoasmundo.get(contato)));
                        //Se o contato estiver infectado uma nova instancia da classe PessoaBemInformada é criada . Em seguida, a nova instância substitui a pessoa original na lista usando o set.
                    }
                }
                pessoaDesinfectada.setInfectado(false); //Apos desinfecção de todos os contatos, a pessoa é marcada como não infectada
                pessoasmundo.set(pessoaDesinfectada.getID(), pessoaDesinfectada); //A pessoa original é atualizada com os dados da pessoa desinfectada, usando novamente o set.
            }
        }
    }

    public void imunizarPessoas(){
        for(Pessoa p : pessoasmundo){
            

            if(meio.isDentroMeio(p.getX(), p.getY())){ //Verifica se a pessoa esta dentro da estrutura do meioComunicaçãoConfiavel
                if(p instanceof PessoaMalInformada){ //instance of retornara true caso a pessoa seje MalInformada 
                    p = new PessoaBemInformada(p); //Se a pessoa for uma instancia de MalInformada ela criara uma nova instancia de PessoaBemInformada que sera usada 30 segundos depois
                    pessoasmundo.set(p.getID(), p); //Substituição dos dados antigos pelos novos especificados nesse caso pelo p que é a nova instancia de PessoaBemInformada
                    
                }
                p.setImune(meio.getTempoImunizacao()); //Se a pessoa nn é uma instancia de nenhuma das outras classes então ela será imunizada
                p.setCor(meio.getCor()); //E aki apenas sera atualizada para a cor definida no  meio de comunicação confiavel

                
                
            }
        }
    }

    //Funções para retornar o numero de pessoas infectadas, bem informadas, mal informadas e imunes

    public int numerosdePessoasInfectadas(){
        int contador = 0;
        for (Pessoa p : pessoasmundo) {
            if(p.isInfectado()){
                contador++;
            }
        }
        return contador;
    }

    public int numerosdePessoasBemInformadas(){
        int contador = 0;

        for (Pessoa p : pessoasmundo) {
            if(!p.isMalInformado() && !p.isImune()){ //Verifica se a pessoa não é mal informada e nem imune
                contador++;
            }
        }
        return contador;
    }

    public int numerosdePessoasMalInformadas(){
        int contador = 0;

        for(Pessoa p : pessoasmundo){
            if(p.isMalInformado() && !p.isImune()){ //Verifica se a pessoa é mal informada e não é imune
                contador++;
            }
        }
        return contador;
    }

    public int numerodePessoasImunes(){
        int contador = 0;

        for(Pessoa p : pessoasmundo){
            if(p.isImune()){
                contador++;
            }
        }
        return contador;
    }
}