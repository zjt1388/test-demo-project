package com.zhou.demo;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by zhouj on 2016/7/25.
 */
public class NioMain {
    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("e:\\ccc.txt");
        FileChannel channel = is.getChannel();
        ByteBuffer bb = ByteBuffer.allocate(1024);
        channel.read(bb);
        System.out.println(new String(bb.array()));
        channel.close();
        is.close();
    }
}
