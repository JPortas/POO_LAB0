public class AppStart {

    public static void main(String [] args) {
        System.out.printf(
                "Name:            " + Size.MEDIUM.name()
              + "\ntoString():      " + Size.MEDIUM.toString()
              + "\nOrdem:           " + Size.MEDIUM.ordinal()
              + "\nValor minimo:    " + Size.MEDIUM.getMinValue()
              + "\nValor máximo:    " + Size.MEDIUM.getMaxValue()
              + "\nCódigo:          " + Size.MEDIUM.getCode());
    }

}
