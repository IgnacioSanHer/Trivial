


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collections;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class BaseDatos {
    static Vector v =new Vector();
    private static String pregunta_BD;
    public static void CrearTablaPreguntas(){
        Connection c = null;
        Statement stmt = null;      
        try {
          c = DriverManager.getConnection("jdbc:sqlite:test.db");
          stmt = c.createStatement();
          String sql = "CREATE TABLE IF NOT EXISTS TRIVIAL "+
                       "(IDPREGUNTA     INTEGER     PRIMARY KEY      AUTOINCREMENT," +
                       " IDTIPO           INTEGER    NOT NULL, " +
                       " PREGUNTA           TEXT    NOT NULL, " + 
                       " RESPUESTA            TEXT     NOT NULL) ";          
          stmt.executeUpdate(sql);
          /*String sql1="INSERT INTO TRIVIAL(IDTIPO,PREGUNTA,RESPUESTA)"+"VALUES('2','¿QUE ELEMENTO ES EL UUP?','UNUMPENTIO')";
          stmt.executeUpdate(sql1);*/
          String sql2="SELECT MAX (IDPREGUNTA) FROM TRIVIAL";
          ResultSet rs = stmt.executeQuery(sql2);
          int max = rs.getInt(1);
          for ( int  i=1; i<=max; i++ ) { 
          v.add(i);        
          }
          Collections.shuffle(v);
          stmt.close();
          c.close(); 
        }
          catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
            
        }
    }
    public static Vector CrearTablaTipo(){
        Connection c = null;
        Statement stmt = null;
        Vector opciones = new Vector();
        try {
          c = DriverManager.getConnection("jdbc:sqlite:test.db");
          stmt = c.createStatement();
          String sql = "CREATE TABLE IF NOT EXISTS TIPO "+
                       "(IDTIPO     INTEGER     PRIMARY KEY      AUTOINCREMENT," +                      
                       " TIPO            TEXT     NOT NULL) ";          
          stmt.executeUpdate(sql);
          /*String sql1="INSERT INTO TIPO(TIPO)"+"VALUES('LITERATURA')";
          stmt.executeUpdate(sql1);*/
          String sql2="SELECT MAX (IDTIPO) FROM TIPO";
          ResultSet rs = stmt.executeQuery(sql2);
          int max = rs.getInt(1);
          for ( int  i=1; i<=max; i++ ) { 
          v.add(i);        
          }
          String sql3="SELECT TIPO FROM TIPO";
          ResultSet opcion = stmt.executeQuery(sql3);
          while(opcion.next()){
              String tipo= opcion.getString(1);              
              opciones.add(tipo);
          }
          Collections.shuffle(v);
          stmt.close();
          c.close(); 
        }
          catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
            
        }
    return opciones;    
    }
    public static Vector obtenerPreguntasPorTipo(int tipoPregunta2)
    {
        //lanzo query .... WHERE IDPREGUNTA=tipo
        //Recorro ResultSet y voy creando objetos Pregunta
        Vector preguntasTipo = new Vector();
        Connection c = null;
        Statement stmt = null;
        try{
                c = DriverManager.getConnection("jdbc:sqlite:test.db");
                stmt = c.createStatement();    
                String pregunta;
                pregunta="SELECT * FROM TRIVIAL WHERE IDTIPO='"+tipoPregunta2+"';";
                ResultSet rsPregunta = stmt.executeQuery(pregunta);
                while(rsPregunta.next()){
                    String txt_pregunta=rsPregunta.getString("PREGUNTA");
                    String txt_respuesta=rsPregunta.getString("RESPUESTA");
                    Pregunta p=new Pregunta(txt_pregunta, txt_respuesta, tipoPregunta2);
                    
                    preguntasTipo.add(p);
                }                
                stmt.close();
                c.close();
                }
        catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
        return preguntasTipo;
    }
    
    public static void crearPregunta(String preguntaCreadaUsuario,String respuestaCreadaUsuario,int tipoPregunta){
        Connection c = null;
        Statement stmt = null;      
        try {
          c = DriverManager.getConnection("jdbc:sqlite:test.db");
          stmt = c.createStatement();
          String sql1="INSERT INTO TRIVIAL(IDTIPO,PREGUNTA,RESPUESTA)"+"VALUES('"+tipoPregunta+"','"+preguntaCreadaUsuario+"','"+respuestaCreadaUsuario+"');";
          stmt.executeUpdate(sql1);
          String sql2="SELECT MAX (IDPREGUNTA) FROM TRIVIAL";
          ResultSet rs = stmt.executeQuery(sql2);
          stmt.close();
          c.close();
        }
        catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
            
        }
    }
}    
