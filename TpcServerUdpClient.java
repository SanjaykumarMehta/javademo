
/**
*The Gateway server reads messages on TPC Socket and send the same messages on UDP multicast socket. 
*
* Implementation using DatagramSocket
**/
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.CompletableFuture;
 
public class TpcServerUdpClient
{
    final static int serverPort = 1234;
    
     /*
      * TPC socket server. 
      *
      *@param message
     */
    public static void tpcSocketServer(String message){
        // Step 1:Create the socket object for carrying the data.
        try(DatagramSocket datagramSocket = new DatagramSocket())
        {
            byte buf[] = null;
            InetAddress ip = InetAddress.getLocalHost();
            // convert the String input into the byte array.
            buf = message.getBytes();
            // Step 2 : Create the datagramPacket for sending the data.
            DatagramPacket dpSend =  new DatagramPacket(buf, buf.length, ip, serverPort);
            // Step 3 : invoke the send call to actually send the data.
            datagramSocket.send(dpSend);
        }catch(IOException ex){
             System.out.println("Exception in tpcSocketServer:"+e.printStackTrace());
        }

    }
    
     /*
      * UDP multicast socket client. 
     */
     public static void udpMultiCastClient(){
        // Step 1 : Create a socket to listen at port 1234
        try(DatagramSocket datagramSocket = new DatagramSocket(serverPort))
        {
            byte[] receive = new byte[65535];
            DatagramPacket dpReceive = null;
            while (true)
            {
                // Step 2 : create a DatgramPacket to receive the data.
                dpReceive = new DatagramPacket(receive, receive.length);
     
                // Step 3 : revieve the data in byte buffer.
                datagramSocket.receive(dpReceive);
     
                System.out.println("Client:-" + data(receive));
     
                // Exit the server if the client sends "bye"
                if (data(receive).toString().equals("bye"))
                {
                    System.out.println("Client sent bye.....EXITING");
                    break;
                }
                // Clear the buffer after every message.
                receive = new byte[65535];
            }
        }catch(IOException ex){
             System.out.println("Exception in udpMultiCastClient:"+e.printStackTrace());
        }
        
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any message");
        String inputMessage = sc.nextLine();
         
         // Using CompletableFuture call tpcSocketServer method asynchronously.
         CompletableFuture.runAsync(() -> {
                  tpcSocketServer(inputMessage);
         });
         
         // Using CompletableFuture call udpMultiCastClient method asynchronously.
         CompletableFuture.runAsync(() -> {
                  udpMultiCastClient();
         });
    }
    
    // A utility method to convert the byte array
    // data into a string representation.
    public static StringBuilder data(byte[] a)
    {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0)
        {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}
