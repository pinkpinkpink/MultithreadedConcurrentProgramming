package src.main.java.org.thread.com;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.Buffer;

/**
 * 描述:
 * Thread
 *
 * @author wangyifan
 * @create 2019-01-10 02:43
 */
public class ReaderThread extends Thread {
    private static Socket socket ;
    private InputStream inputStream;
    public void ReaderThread(Socket socket)throws IOException {
        this.socket = socket;
        this.inputStream = socket.getInputStream();
    }


    @Override
    public void interrupt(){
        try{
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            super.interrupt();
    }}
        @Override
        public void run(new Runnable() {
            /**
             * When an object implementing interface <code>Runnable</code> is used
             * to create a thread, starting the thread causes the object's
             * <code>run</code> method to be called in that separately executing
             * thread.
             * <p>
             * The general contract of the method <code>run</code> is that it may
             * take any action whatsoever.
             *
             * @see Thread#run()
             */
                try{
                    byte[] buffer = new byte[];
                    while(true){
                        int count = inputStream(buffer);
                        if(count < 0){
                            break;
                        }else if (count > 0) {
                            //processBuffer(buffer, count);
                            ReaderThread(buffer ,count);

                        }
                    }

                }catch (IOException e){
                    e.getStackTrace();
                }

            }

}





