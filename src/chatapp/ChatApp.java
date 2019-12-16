/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author egypt2
 */
public class ChatApp extends JFrame {
  // static DatagramSocket s;
    static ArrayList<String> connectors = new ArrayList<String>();
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
           
            chatFrame chat = new chatFrame();
            chat.setTitle(InetAddress.getLocalHost().getHostAddress());
            chat.start();
            chat.setVisible(true);
      
    }
}

