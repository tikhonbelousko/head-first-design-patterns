package imageproxy;

import java.net.*;
import javax.swing.*;
import java.util.*;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("Album Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String, String> albums = new Hashtable<>();

    public static void main (String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
        testDrive.go();
    }

    public ImageProxyTestDrive(){
    }

    public void go() throws Exception {
        albums.put("Igor","https://upload.wikimedia.org/wikipedia/en/5/51/Igor_-_Tyler%2C_the_Creator.jpg");
        albums.put("Currents","https://upload.wikimedia.org/wikipedia/en/9/9b/Tame_Impala_-_Currents.png");
        albums.put("Hybrid Theory","https://upload.wikimedia.org/wikipedia/en/2/2a/Linkin_Park_Hybrid_Theory_Album_Cover.jpg");
        albums.put("In Colour","https://upload.wikimedia.org/wikipedia/commons/c/c2/Jamie_xx_-_In_Colour.png");

        URL initialURL = new URI(albums.get("Igor")).toURL();
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite Albums");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration<String> e = albums.keys(); e.hasMoreElements();) {
            String name = e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(event -> {
                imageComponent.setIcon(new ImageProxy(getAlbumUrl(event.getActionCommand())));
                frame.repaint();
            });
        }

        // set up frame and menus

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

    URL getAlbumUrl(String name) {
        try {
            return new URI(albums.get(name)).toURL();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
