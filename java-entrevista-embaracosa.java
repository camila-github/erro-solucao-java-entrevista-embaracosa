//O
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class entrevista {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String palavra;

        while((palavra = br.readLine()) != null) {
            boolean verificarRepeticao = false;
            for(int i=0; i <= palavra.length() - 1; i++) {
                if( palavra.substring(0, i).endsWith(palavra.substring(i)) ) {
                    System.out.println(palavra.substring(0, i));
                    verificarRepeticao = true;
                }
            }
            if(!verificarRepeticao) System.out.println(palavra);
        }
    }
}