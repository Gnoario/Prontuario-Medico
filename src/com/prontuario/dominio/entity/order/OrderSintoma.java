/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.prontuario.dominio.entity.Sintoma;
import java.util.Comparator;

public class OrderSintoma implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Sintoma s1 = (Sintoma) o1;
        Sintoma s2 = (Sintoma) o2;

        return s1.getNome().compareTo(s2.getNome());

    }

}
