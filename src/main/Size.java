public enum Size {

    /**
     * Copo pequeno.
     */
    SMALL(32, 36, "Pequeno",'S'),
    /**
     * Copo Médio.
     */
    MEDIUM(37, 44, "Médio",'M'),
    /**
     * Copo grande.
     */
    LARGE(45, 52, "Grande",'L');

    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;

    /**
     * Recepe os parametros do enumerado.
     * @param minValue Capacidade minima do copo.
     * @param maxValue capacidade máxima do copo.
     * @param description Descrição do copo (tamanho).
     * @param code Código do copo (representado por uma letra)
     */
    private Size(int minValue, int maxValue, String description, char code){
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code;
    }

    /**
     * Descrição do copo.
     * @return Descrição do copo.
     */
    @Override
    public String toString() {
        return this.description;
    }

    /**
     * Descrição do copo.
     * @return Descrição do copo.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Capacidade minima do copo.
     * @return Capacodade minima do copo.
     */
    public int getMinValue() {
        return minValue;
    }

    /**
     * Capacidade máxima do copo.
     * @return Capacidade máxima do copo.
     */
    public int getMaxValue() {
        return maxValue;
    }

    /**
     * Código do copo.
     * @return Código do copo.
     */
    public char getCode() {
        return code;
    }

}
