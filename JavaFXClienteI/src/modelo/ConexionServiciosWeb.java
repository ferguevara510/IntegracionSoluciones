/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author kfgf1
 */
public class ConexionServiciosWeb {
  
  public static String consumirServicioGET(String url) throws Exception{
    String resultado = "";
    URL urlServicio = new URL(url);
    HttpURLConnection conexionHTTP = (HttpURLConnection) urlServicio.openConnection(); //conexion a la consulta
    conexionHTTP.setRequestMethod("GET");
    //ejecutamos la petición
    int codigoRespuesta = conexionHTTP.getResponseCode();
    System.out.println("Código de respuesta GET: " +codigoRespuesta);
    
    if(codigoRespuesta == HttpURLConnection.HTTP_OK){
      resultado = convertirStreamDatos(conexionHTTP.getInputStream());
    }
    
    return resultado;
  }
  
  public static String consumirServiciosPOST(String url, String parametros) throws Exception{
    String resultado = "";
    URL urlServicio = new URL(url);
    HttpURLConnection conexionHTTP = (HttpURLConnection) urlServicio.openConnection(); //conexion a la consulta
    conexionHTTP.setRequestMethod("POST");
    conexionHTTP.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
    conexionHTTP.setDoOutput(true);
    OutputStream salidaStream = conexionHTTP.getOutputStream(); //abrir la conexión
    salidaStream.write(parametros.getBytes());
    salidaStream.flush();
    salidaStream.close();
    int codigoRespuesta = conexionHTTP.getResponseCode();
    System.err.println("Código de respuesta POST: "+codigoRespuesta);
    
    if(codigoRespuesta == HttpURLConnection.HTTP_OK){
      resultado = convertirStreamDatos(conexionHTTP.getInputStream());
    }
    
    return resultado;
  }
  
  private static String convertirStreamDatos(InputStream infoBytes) throws IOException{
    InputStreamReader inputDatos = new InputStreamReader(infoBytes);
    BufferedReader bufferR = new BufferedReader(inputDatos);
    StringBuffer respuesta = new StringBuffer();
    String textoEntrada;
      
    while((textoEntrada = bufferR.readLine()) != null){
      respuesta.append(textoEntrada);
    }
      
    bufferR.close();
    return respuesta.toString();
  }
}