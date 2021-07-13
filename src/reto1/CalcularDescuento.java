public class CalcularDescuento {
    
    private int monto;
    private int descuento;
    private double total;


    public CalcularDescuento() {}

    public CalcularDescuento(int monto){
        this.monto = monto;
    }

    public Integer descuento(Integer pMonto) {
        if (monto > 100000) {
            this.descuento = pMonto * 10 / 100;
        } else {
            this.descuento = pMonto * 2 / 100;
        }
        return this.descuento;
    }

    public Integer descuento() {
        if (this.monto > 100000) {
            this.descuento = this.monto * 10 / 100;
        } else {
            this.descuento = this.monto * 2 / 100;
        }
        return this.descuento;
    }

    public Double total(){
        descuento();
        this.total = this.monto - this.descuento;
        return this.total;
    }

    public Double total(Integer pMonto){
        this.monto = pMonto;
        descuento();
        this.total = pMonto - this.descuento;
        return this.total;
    }

    public static void main(String[] args) {
        CalcularDescuento descuento1 = new CalcularDescuento(50000);
        System.out.println(descuento1.total());

        CalcularDescuento descuento2 = new CalcularDescuento();
        System.out.println(descuento2.total(90000));
    }

}