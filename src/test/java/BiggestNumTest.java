import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BiggestNumTest {
    @Test
    public void biggestNum() {
        Numero firstNum = new Numero();
        firstNum.setNumber(350);

        Numero secondNum = new Numero();
        secondNum.setNumber(250);

        Numero thirdNum = new Numero();
        thirdNum.setNumber(150);

        List<Numero> numeros = new ArrayList<Numero>();
        numeros.add(firstNum);
        numeros.add(secondNum);
        numeros.add(thirdNum);

        ServicoNumero servicoNumero = new ServicoNumero();
        Assert.assertEquals(firstNum.getNumber(), servicoNumero.findBiggestNum(numeros).getNumber());
    }

    @Test
    public void midNum() {
        Numero firstNum = new Numero();
        firstNum.setNumber(350);

        Numero secondNum = new Numero();
        secondNum.setNumber(250);

        Numero thirdNum = new Numero();
        thirdNum.setNumber(150);

        List<Numero> numeros = new ArrayList<Numero>();
        numeros.add(firstNum);
        numeros.add(secondNum);
        numeros.add(thirdNum);

        ServicoNumero servicoNumero = new ServicoNumero();
        Assert.assertEquals(secondNum.getNumber(), servicoNumero.findMidNum(numeros).getNumber());
    }

    @Test
    public void lowestNum() {
        Numero firstNum = new Numero();
        firstNum.setNumber(350);

        Numero secondNum = new Numero();
        secondNum.setNumber(250);

        Numero thirdNum = new Numero();
        thirdNum.setNumber(150);

        List<Numero> numeros = new ArrayList<Numero>();
        numeros.add(firstNum);
        numeros.add(secondNum);
        numeros.add(thirdNum);

        ServicoNumero servicoNumero = new ServicoNumero();
        Assert.assertEquals(thirdNum.getNumber(), servicoNumero.findLowestNum(numeros).getNumber());
    }

}
