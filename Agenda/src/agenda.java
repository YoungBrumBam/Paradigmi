import java.util.ArrayList;

public class agenda {
    public ArrayList<appuntamento>appuntamenti;
    String nome;
    public agenda(String nome){
        this.nome=nome;
        appuntamenti=new ArrayList<appuntamento>();
    }

    
    public void aggiungiAppuntamento(appuntamento a){
        appuntamenti.add(a);
    }


}
