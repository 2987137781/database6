import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame(){
        //主窗口属性
        setTitle("商品库存管理系统");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //创建菜单
        JMenuBar menuBar =new JMenuBar();
        setJMenuBar(menuBar);
    }
}
