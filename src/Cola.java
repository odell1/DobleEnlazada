public class Cola {
    
    private Nodo principio;
    private Nodo ultimo;

    public Cola(){
        principio=null;
        ultimo=null;
    }//cola

    //Método para ver si la cola está vacía
    public boolean esVacia(){
        if(principio==null && ultimo==null) return true;

        return false;
    }//esVacia

    public void encolar(char dato){
        //1º Me creo el nuevo nodo 
        Nodo nuevo=new Nodo(dato);

        if(esVacia()) {
            principio=nuevo;
            ultimo=nuevo;
        }else{
            Nodo esRepetido=buscaRepetido(nuevo.getDato());
            if(esRepetido!=null){
                esRepetido.setRepetido(nuevo);

            }else{
                nuevo.setAnterior(ultimo);
                ultimo.setSiguiente(nuevo);
                ultimo=nuevo;
            }

        }//if

    }//encolar



    void imprimeCola(){
        Nodo auxiliar=principio;
        while(auxiliar!=null){
            System.out.println("-- "+ auxiliar.getDato());
            if(auxiliar.getRepetido()!=null){
                Nodo recorre=auxiliar;
                while(recorre!=null){
                    System.out.println(("Repetido: "+ recorre.getDato()));
                    recorre=recorre.getRepetido();
                }//while

            }
            auxiliar=auxiliar.getSiguiente();
        }//while
        System.out.println("Cola imprimida!!!!");
    }//imprimeCola



    void imprimeColaFinal(){
        Nodo auxiliar=ultimo;
        while(auxiliar!=null){
            System.out.println("-- "+ auxiliar.getDato());
            auxiliar=auxiliar.getAnterior();
            
        }//while

        System.out.println("Cola imprimida hacia atrás!!!!");
    }//imprimeCola del revés

    //// BuscaRepetido 
    /// 
    private Nodo buscaRepetido(char dato) {
        
        Nodo auxiliar=principio;
        while(auxiliar!=null){//Para recorrer la cola
            if(auxiliar.getDato()==dato){ 
                Nodo ultimoRepetido=auxiliar;
                while(ultimoRepetido.getRepetido()!=null){ // para recorrer los desbordes
                    ultimoRepetido=ultimoRepetido.getRepetido();
                }//while
                return ultimoRepetido;
                
            }else{
                auxiliar=auxiliar.getSiguiente();
            }
                        
        }//while
        return auxiliar; //Devolvemos null 
    }//buscaRepetido




}//Cola
