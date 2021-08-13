import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class Requerimiento1_Dao {
    Connection cnn;

    public Requerimiento1_Dao() {
        try {
            this.cnn = JDBCUtilities.getConnection();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void close() throws SQLException{
        cnn.close();
    }
    
    public ArrayList<Requerimiento_1> requerimiento1(){
        ArrayList<Requerimiento_1> res = new ArrayList<>();
        
        String consulta = "select count(l.ID_Lider) numLideres, "+
                          "l.Ciudad_Residencia"+
                          " from Lider l "+
                          "group by l.Ciudad_Residencia;";
        try {
            PreparedStatement ps = cnn.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                res.add(new Requerimiento_1(rs.getInt("numLideres"), rs.getString("Ciudad_Residencia")));
            }
        } catch (SQLException e) {
            System.err.print("Error consultando Número de lideres por ciudad: " + e);
        }
        return res;
    }
}

public class Requerimiento2_Dao {
    Connection cnn;

    public Requerimiento2_Dao() {
        try {
            this.cnn = JDBCUtilities.getConnection();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void close() throws SQLException{
        cnn.close();
    }
    
    public ArrayList<Requerimiento_2> requerimiento2(){
        ArrayList<Requerimiento_2> res = new ArrayList<>();
        
        String consulta = "select c.ID_Proyecto, c.Proveedor, c.Pagado, mc.ID_MaterialConstruccion, mc.Nombre_Material"+
             " from compra c "+
            "inner join MaterialConstruccion mc on c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion "+
            "where c.Proveedor = 'Homecenter' and c.Pagado = 'No' order by c.ID_Proyecto;";        
        try {
            PreparedStatement ps = cnn.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                res.add(
                    new Requerimiento_2(
                        rs.getInt("ID_Proyecto"), 
                        rs.getString("Proveedor"),
                        rs.getString("Pagado"),
                        rs.getInt("ID_MaterialConstruccion"),
                        rs.getString("Nombre_Material")
                    )
                );
            }
        } catch (SQLException e) {
            System.err.print("Error consultando Materiales no pagados al proveedor Homecenter: " + e);
        }
        return res;
    }
}


public class Requerimiento3_Dao {
    Connection cnn;

    public Requerimiento3_Dao() {
        try {
            this.cnn = JDBCUtilities.getConnection();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void close() throws SQLException{
        cnn.close();
    }
    
    public ArrayList<Requerimiento_3> requerimiento3(){
        ArrayList<Requerimiento_3> res = new ArrayList<>();
        
            String consulta = "select distinct l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Segundo_Apellido"+
                              " from proyecto p "+
                              "inner join lider l on p.ID_Lider = l.ID_Lider";
        try {
            PreparedStatement ps = cnn.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                res.add(
                    new Requerimiento_3(
                        rs.getInt("ID_Lider"), 
                        rs.getString("Nombre"),
                        rs.getString("Primer_Apellido"),
                        rs.getString("Segundo_Apellido")
                    )
                );
            }
        } catch (SQLException e) {
            System.err.println("Error consultando Proyectos que deben dinero por compra de materiales: " + e);
        }
        return res;
    }
}


public class Requerimiento_1 {
    private int nro_lideres;
    private String ciudad_residencia;

    public Requerimiento_1(int nro_lideres, String ciudad_residencia) {
        this.nro_lideres = nro_lideres;
        this.ciudad_residencia = ciudad_residencia;
    }

    public int getNro_lideres() {
        return nro_lideres;
    }

    public String getCiudad_residencia() {
        return ciudad_residencia;
    }
}


public class Requerimiento_2 {
    private int id_proyecto;
    private String proveedor;
    private String pagado;
    private int id_material_construccion;
    private String nombre_material;

    public Requerimiento_2(int id_proyecto, String proveedor, String pagado, int id_material_construccion, String nombre_material) {
        this.id_proyecto = id_proyecto;
        this.proveedor = proveedor;
        this.pagado = pagado;
        this.id_material_construccion = id_material_construccion;
        this.nombre_material = nombre_material;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getPagado() {
        return pagado;
    }

    public int getId_material_construccion() {
        return id_material_construccion;
    }

    public String getNombre_material() {
        return nombre_material;
    }
    
    
}


public class Requerimiento_3 {
    private int id_lider;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;

    public Requerimiento_3(int id_lider, String nombre, String primer_apellido, String segundo_apellido) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }

    public int getId_lider() {
        return id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }
}


public class JDBCUtilities {

    //Atributos de clase para gestión de conexión con la base de datos      
    private static final String UBICACION_BD = "ProyectosConstruccion.db";    

    public static Connection getConnection() {
        String url = "jdbc:sqlite:" + UBICACION_BD;        
        try {
            return DriverManager.getConnection(url);
        } catch (Exception e) {
            return null;
        }
    }
    
    public static boolean estaVacia(){
        File archivo = new File(JDBCUtilities.UBICACION_BD);        
        return archivo.length() == 0;
    }
}

public class Requerimiento1_controller {
    private Requerimiento1_Dao ctrl;

    public Requerimiento1_controller() {
        this.ctrl = new Requerimiento1_Dao();
    }
    
    public ArrayList<Requerimiento_1> requerimiento1(){
        return this.ctrl.requerimiento1();
    }
    
    public void close() throws SQLException{
        this.ctrl.close();
    }
}

public class Requerimiento2_controller {
    private Requerimiento2_Dao ctrl;

    public Requerimiento2_controller() {
        this.ctrl = new Requerimiento2_Dao();
    }
    
    public ArrayList<Requerimiento_2> requerimiento2(){
        return this.ctrl.requerimiento2();
    }
    
    public void close() throws SQLException{
        this.ctrl.close();
    }
}

public class Requerimiento3_controller {
    private Requerimiento3_Dao ctrl;

    public Requerimiento3_controller() {
        this.ctrl = new Requerimiento3_Dao();
    }
    
    public ArrayList<Requerimiento_3> requerimiento3(){
        return this.ctrl.requerimiento3();
    }
    
    public void close() throws SQLException{
        this.ctrl.close();
    }
}


public class VistaRequerimientos {
    Scanner sc;
    
    public VistaRequerimientos() {
        sc = new Scanner(System.in);
    }
    
    public void menu() {
        var opcion = 1;
        while (opcion != 0) {            
            System.out.println("============================");
            System.out.println("Asociación H&L Constructores");
            System.out.println("============================");
            System.out.println("1 - Número de líderes por ciudad.");
            System.out.println("2 - Materiales sin cancelar a Homecenter.");
            System.out.println("3 - Líder y proyectos con deuda.");
            System.out.println("0 - Finalizar");
            try {
                opcion = Integer.valueOf(sc.nextInt());
            } catch (Exception e) {
                opcion = 9;
            }
            switch (opcion) {
                case 1:
                    requerimiento1();
                    break;
                case 2:
                    requerimiento2();
                    break;
                case 3:
                    requerimiento3();
                    break;
            }
        }
        
        sc.close();
    }
 
    public static void requerimiento1() {
        try {
            Requerimiento1_controller ctrl = new Requerimiento1_controller();
            ArrayList<Requerimiento_1> resultado = ctrl.requerimiento1();
            ctrl.close();
            System.out.println("Nro_Lideres Ciudad_Residencia");
            for (Requerimiento_1 rq : resultado) {
                System.out.println(rq.getNro_lideres() + "  " + rq.getCiudad_residencia());
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
    }

    public static void requerimiento2() {
        try {
            Requerimiento2_controller ctrl = new Requerimiento2_controller();
            ArrayList<Requerimiento_2> resultado = ctrl.requerimiento2();
            ctrl.close();
            System.out.println("ID_Proyecto Proveedor Pagado  ID_MaterialConstruccion  Nombre_Material");
            for (Requerimiento_2 rq : resultado) {
                System.out.println(
                        rq.getId_proyecto() + "  " + 
                        rq.getProveedor() + "  " + 
                        rq.getPagado() + "  " + 
                        rq.getId_material_construccion() + "  " + 
                        rq.getNombre_material()
                );
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
    }

    public static void requerimiento3() {
        try {
            Requerimiento3_controller ctrl = new Requerimiento3_controller();
            ArrayList<Requerimiento_3> resultado = ctrl.requerimiento3();
            ctrl.close();
            System.out.println("ID_Lider Nombre Primer_Apellido Segundo_Apellido");
            for (Requerimiento_3 rq : resultado) {
                System.out.println(
                        rq.getId_lider() + "  " + 
                        rq.getNombre() + "  " + 
                        rq.getPrimer_apellido() + "  " + 
                        rq.getSegundo_apellido()
                );
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
    }
    
}

