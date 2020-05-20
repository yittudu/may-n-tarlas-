package mayintarlasi;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import sun.awt.RepaintArea;


public class anaEkran extends mayinTarlasiOyunu{
    protected int kareSayisi=10;
    protected int mayin=12;
    JFrame frm=new JFrame("Oyun");
    public static void main(String [] args){
       
        anaEkran al=new anaEkran();
        al.ilkFrame();        
        
   }
   public void ilkFrame(){
    
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.getContentPane().add(new mayinYerlestirme(10,12).getContent());
      frm.setSize(550,450);
      frm.setLocation(300,100);
      frm.setVisible(true);
      JMenuBar menuBar=new JMenuBar();
      menuBar.setSize(550,100);
      oyunMenubar(menuBar);
      frm.setJMenuBar(menuBar);
      frm.repaint();
      frm.revalidate();
   }
   

  public void oyunMenubar(JMenuBar menuBar){
   
        JMenu dosya=new JMenu("Oyun");
        menuBar.add(dosya);
        JMenuItem yeniOyun=new JMenuItem("Yeni oyun");
        dosya.add(yeniOyun);
        JMenuItem baslangic=new JMenuItem("Baslangic");
        dosya.add(baslangic);
        JMenuItem orta=new JMenuItem("Orta");
        dosya.add(orta);
        JMenuItem zor=new JMenuItem("Zor");
        dosya.add(zor);
        JMenuItem cikis=new JMenuItem("Cıkıs");
        dosya.add(cikis);
        
        cikis.addActionListener(new ActionListener() {
          
            @Override
             public void actionPerformed(ActionEvent e) {
               System.exit(0);                      
                  }
            }); 
        
        yeniOyun.addActionListener(new ActionListener() {
            
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                 
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(10,12).getContent());
                frm.setSize(550,450);
                frm.setLocation(300,100); 
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);
                al.frm=frm;
                  }
            }); 
            
        
        baslangic.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(10,12).getContent());
                frm.setSize(550,450);
                frm.setLocation(300,100);
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar); 
                al.frm=frm;
                  }
            }); 
        
        orta.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(15,25).getContent());
                frm.setSize(800,600);
                frm.setLocation(300,50);
                frm.setVisible(true);  
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);  
                al.frm=frm;
                  }
            }); 
        
        zor.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(20,60).getContent());
                frm.setSize(1070,650);
                frm.setLocation(200,30);
                frm.setVisible(true);  
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);   
                al.frm=frm;
                  }
            }); 
  }
    
  
  
}