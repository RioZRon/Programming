package net;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Describe:
 * @Date: 2017/10/28
 * @Modifiedby:
 */
public class ServerTset {
    public static void main(String[] args){
        ServerSocket server = null;
        BufferedReader bufferedReaderout = null;
        bufferedReaderout = new BufferedReader()
        try {
            server = new ServerSocket(8088);
            System.out.println("����������");
            Socket socket = server.accept();
            System.out.println("�ͻ��˽�������");
            bufferedReaderout
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
