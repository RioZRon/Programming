package net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Describe:
 * @Date: 2017/10/28
 * @Modifiedby:
 */
public class ClientTest1 {
    public static void main(String[] args){
        Socket socket = null;
        BufferedWriter bufferedWriterout = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      try {
          socket = new Socket("127.0.0.1", 8088);
          System.out.println("客户端连接服务器...");
          System.out.println("客户端输入的信息是");

          String string = "今天星期六";
            try {
                bufferedWriterout.write(string);
                bufferedWriterout.flush();
            }finally {
                if (bufferedWriterout != null)
                    bufferedWriterout.close();
                if (socket != null)
                    socket.close();

            }
      }
      catch (UnknownHostException e){
          e.printStackTrace();
      }
      catch (IOException e){
            e.printStackTrace();
      }

      }
    }
}
