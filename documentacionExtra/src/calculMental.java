public class calculMental {
    private String operacion;

    public calculMental(String operacion) throws Exception {
        setOperacion(operacion);
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) throws Exception {
        if(operacion.isEmpty()) throw new Exception("la operacion no puede ser vacia o nula");
        this.operacion = operacion;
    }
}
