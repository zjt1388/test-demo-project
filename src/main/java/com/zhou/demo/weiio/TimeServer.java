package com.zhou.demo.weiio;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zhouj on 2016/8/2.
 */
public class TimeServer {
    public static void main(String[] args) throws Exception{
        int port = 8080;
        if(args != null && args.length > 0){
            port = Integer.valueOf(args[0]);
        }
        ServerSocket server = null;
        try{
            server = new ServerSocket(port);
            System.out.println("The time server is start in port : " + port);
            Socket socket = null;
            TimeServerHandlerExecutePool singleExecutor = new TimeServerHandlerExecutePool(50,10000);//创建I/O任务线程池
            while (true){
                socket = server.accept();
                singleExecutor.execute(new TimeServerHandler(socket));
            }
        }catch(Exception e){
        } finally {
            if(server != null){
                System.out.println("The time server colse");
                server.close();
                server = null;
            }
        }
    }
}
