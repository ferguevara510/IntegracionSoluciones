/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
      InputStreamReader inputDatos = new InputStreamReader(conexionHTTP.getInputStream());
      BufferedReader bufferR = new BufferedReader(inputDatos);
      StringBuffer respuesta = new StringBuffer();
      String textoEntrada;
      
      while((textoEntrada = bufferR.readLine()) != null){
        respuesta.append(textoEntrada);
      }
      
      bufferR.close();
      resultado = respuesta.toString();
    }
    
    return resultado;
  }
  
}