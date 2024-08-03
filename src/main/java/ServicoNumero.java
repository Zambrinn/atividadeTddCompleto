import java.util.List;

public class ServicoNumero {
    public Numero findBiggestNum(List<Numero> numeros) {
        Numero biggestNum = new Numero();
        for (int i = 0; i < numeros.size(); i++) {
            if ( numeros.get(i).getNumber() > biggestNum.getNumber() ) {
                biggestNum = numeros.get(i);
            }
            
        }
        return biggestNum;
    }

    public Numero findMidNum(List<Numero> numeros) {
        Numero midNum = null;
        for (int i = 0; i < numeros.size(); i++) {
                if ( midNum == null ) {
                    midNum = numeros.get(i);
                } else if ( numeros.get(i).getNumber() < findBiggestNum(numeros).getNumber() && numeros.get(i).getNumber() > findLowestNum(numeros).getNumber() ) {
                    midNum = numeros.get(i);
                }
        }
        return midNum;
    }

    public Numero findLowestNum(List<Numero> numeros) {
        Numero lowestNum = null;
        for (int i = 0; i < numeros.size(); i++) {
            if ( lowestNum == null ) {
                lowestNum = numeros.get(i);
            } else if ( numeros.get(i).getNumber() < lowestNum.getNumber() ) {
                lowestNum = numeros.get(i);
            }
        }
        return lowestNum;
    }
}
