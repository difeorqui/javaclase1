public class App { 
    public static void main(String[] args) { 
        // Prueba 1 
        Electrodomestico electrodomesticos[]=new Electrodomestico[5]; 
        electrodomesticos[0]=new Electrodomestico(200.0, 60, 'C'); 
        electrodomesticos[1]=new Lavadora(150.0, 30); 
        electrodomesticos[2]=new Television(500.0, 80, 'E', 42, false); 
        electrodomesticos[3]=new Electrodomestico(); 
        electrodomesticos[4]=new Electrodomestico(600.0, 20, 'D'); 
        PrecioTotal solucion1 = new PrecioTotal(electrodomesticos); 
        solucion1.mostrarTotales(); 
        System.out.println("\n"); 
        // Prueba 2
        Electrodomestico electrodomesticos2[]=new Electrodomestico[10]; 
        electrodomesticos2[0]=new Electrodomestico(200.0, 60, 'C'); 
        electrodomesticos2[1]=new Lavadora(150.0, 30); 
        electrodomesticos2[2]=new Television(500.0, 80, 'E', 42, false); 
        electrodomesticos2[3]=new Electrodomestico(); 
        electrodomesticos2[4]=new Electrodomestico(600.0, 20, 'D'); 
        electrodomesticos2[5]=new Lavadora(300.0, 40, 'Z', 40); 
        electrodomesticos2[6]=new Television(250.0, 70); 
        electrodomesticos2[7]=new Lavadora(400.0, 100, 'A', 15); 
        electrodomesticos2[8]=new Television(200.0, 60, 'C', 30, true); 
        electrodomesticos2[9]=new Electrodomestico(50.0, 10); 
        PrecioTotal solucion2 = new PrecioTotal(electrodomesticos2); 
        solucion2.mostrarTotales();
    } 
}