import org.w3c.dom.CDATASection;

public class appuntamento {
    private String data,orario,nome,luogo;
    private int durata;

    public appuntamento(String data,String orario,int durata,String nome,String luogo){
        if (data.length() == 10) {
            if(orario.length()==5) {
                int gg = Integer.parseInt(data.substring(0, 2));
                int mm = Integer.parseInt(data.substring(3, 5));
                int aaaa = Integer.parseInt(data.substring(6));
                int hh = Integer.parseInt(orario.substring(0, 2));
                int min = Integer.parseInt(orario.substring(3));
                if (gg > 0 && gg <= 31) {
                    if (mm > 0 && mm <= 12) {
                        if (aaaa >= 2023) {
                            if (hh >= 00 && hh <= 23) {
                                if (min >= 0 && min <= 59) {
                                    this.data = data;
                                    this.orario = orario;
                                    this.durata = durata;
                                    this.nome = nome;
                                    this.luogo = luogo;
                                } else throw new IllegalArgumentException("minuti non validi ");
                            } else throw new IllegalArgumentException("ore non valide ");
                        } else throw new IllegalArgumentException("anno non valido ");
                    } else throw new IllegalArgumentException("mese non valido  ");
                } else throw new IllegalArgumentException("giorno non valido ");
            } else throw new IllegalArgumentException ("orario non valido ");
        } else throw new IllegalArgumentException ("data non valida ");
    }

    public String getData() {
        return data;
    }

    public String getOrario() {
        return orario;
    }

    public String getNome() {
        return nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public int getDurata() {
        return durata;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOrario(String orario) {
        this.orario = orario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
