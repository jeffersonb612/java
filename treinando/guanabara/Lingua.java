package treinando.guanabara;

           import java.util.Locale;

public class Lingua {
    public static void main(String[] args) {
        Locale sistemaLocale = Locale.getDefault();
        String linguagemSistema = sistemaLocale.getLanguage();
        
        System.out.println("Linguagem do sistema: " + linguagemSistema);
    }

    @Override
    public String toString() {
        return "Lingua []";
    }
}
