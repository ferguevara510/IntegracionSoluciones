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
 * @author heand
 */
public class ConexionServiciosWeb {
    public static String consumirServicioGet(String url) throws Exception{
        String resultado = "";
        URL urlServicio = new URL(url);
        HttpURLConnection conexionHTTP = (HttpURLConnection) urlServicio.openConnection(); //poder abrir la conexion que yo estoy abriendo, httpurlconnection esa es la que espera en el casteo
        
        conexionHTTP.setRequestMethod("GET");
        //ejecutamos la petición
        int codigoRespuesta = conexionHTTP.getResponseCode();
        System.out.println("Codigo de respuesta GET: " + codigoRespuesta);
        
        if(codigoRespuesta == HttpURLConnection.HTTP_OK){
            resultado = convertirStreamDatos(conexionHTTP.getInputStream());
        }
        return resultado;
    }
    public static String consumirServicioPOST(String url, String parametros) throws Exception{
        String resultado = "";
        URL urlServicio = new URL(url);
        //poder abrir la conexion que yo estoy abriendo, httpurlconnection esa es la que espera en el casteo
        HttpURLConnection conexionHTTP = (HttpURLConnection) urlServicio.openConnection();
        conexionHTTP.setRequestMethod("POST");
        conexionHTTP.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conexionHTTP.setDoOutput(true);//permitir escribir en el body
        OutputStream salidaStream = conexionHTTP.getOutputStream();
        salidaStream.write(parametros.getBytes());
        salidaStream.flush();
        salidaStream.close();
        int codigoRespuesta = conexionHTTP.getResponseCode();//Obtener codigo de respuesta
        System.out.println("Codigo de respuesta POST: "+ codigoRespuesta);
        if(codigoRespuesta == HttpURLConnection.HTTP_OK){
            resultado = convertirStreamDatos(conexionHTTP.getInputStream());
        }
        return resultado;
    }
    
    public static String consumirServicioPUT(String url, String parametros) throws Exception{
        String resultado = "";
        URL urlServicio = new URL(url);
        //poder abrir la conexion que yo estoy abriendo, httpurlconnection esa es la que espera en el casteo
        HttpURLConnection conexionHTTP = (HttpURLConnection) urlServicio.openConnection();
        conexionHTTP.setRequestMethod("PUT");
        conexionHTTP.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conexionHTTP.setDoOutput(true);//permitir escribir en el body
        OutputStream salidaStream = conexionHTTP.getOutputStream();
        salidaStream.write(parametros.getBytes());
        salidaStream.flush();
        salidaStream.close();
        int codigoRespuesta = conexionHTTP.getResponseCode();//Obtener codigo de respuesta
        System.out.println("Codigo de respuesta PUT: "+ codigoRespuesta);
        if(codigoRespuesta == HttpURLConnection.HTTP_OK){
            resultado = convertirStreamDatos(conexionHTTP.getInputStream());
        }
        return resultado;
    }
    
    public static String consumirServicioDELETE(String url, String parametros) throws Exception{
        String resultado = "";
        URL urlServicio = new URL(url);
        //poder abrir la conexion que yo estoy abriendo, httpurlconnection esa es la que espera en el casteo
        HttpURLConnection conexionHTTP = (HttpURLConnection) urlServicio.openConnection();
        conexionHTTP.setRequestMethod("DELETE");
        conexionHTTP.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conexionHTTP.setDoOutput(true);//permitir escribir en el body
        OutputStream salidaStream = conexionHTTP.getOutputStream();
        salidaStream.write(parametros.getBytes());
        salidaStream.flush();
        salidaStream.close();
        int codigoRespuesta = conexionHTTP.getResponseCode();//Obtener codigo de respuesta
        System.out.println("Codigo de respuesta DELETE: "+ codigoRespuesta);
        if(codigoRespuesta == HttpURLConnection.HTTP_OK){
            resultado = convertirStreamDatos(conexionHTTP.getInputStream());
        }
        return resultado;
    }
    private static String convertirStreamDatos(InputStream conexionHTTP) throws IOException{
        InputStreamReader inputDatos = new InputStreamReader(conexionHTTP);
        BufferedReader bufferR = new BufferedReader(inputDatos);
            
        StringBuffer respuesta = new StringBuffer();
            
        String textoEntrada;
        while(  (textoEntrada = bufferR.readLine()) != null ){
            respuesta.append(textoEntrada);
        }
        bufferR.close();
        return respuesta.toString();
    }
}
