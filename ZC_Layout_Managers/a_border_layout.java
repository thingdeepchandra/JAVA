package ZC_Layout_Managers;

import javax.swing.JButton;
import javax.swing.JFrame;

public class a_border_layout {
    JFrame frame;
    a_border_layout()
    {
        frame=new JFrame();
        JButton b1=new JButton("NORTH");
        JButton b2=new JButton("SOUTH");
        JButton b3=new JButton("EAST");
        JButton b4=new JButton("WEST");
        JButton b5=new JButton("CENTER");
        
        frame.add(b1, BoarderLayout.NORTH);
        frame.add(b2,BoarderLayout.SOUTH);
        frame.add(b4, BoarderLayout.WEST);
        frame.add(b5, BoarderLayout.CENTER);
        frame.add(b3, BoarderLayout.EAST)
                BU

                


    }
    
}
