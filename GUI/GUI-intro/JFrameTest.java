import javax.swing.*;

/**
 * <h1>JFrame Testing Object</h1>
 * 
 * <p> This class is a sub class of {@link javax.swing.JFrame},
 * to work with Java GUI. This program mostly works with
 * the javax.swing package. The expected output is a 
 * 400px by 400px JFrame that contains a menubar at the
 * top, with two sections, File and Help, which both
 * have drop down menus. If the user hovers over File,
 * a quit button appears, and if the user hovers over
 * the Help, a help button appears. The dropdowns are
 * not yet functional, and will be fixed in future versions
 * of this program.</p>
 * 
 * <p>This JFrame is disposed when closed.</p>
 * 
 * @author Feng Xiong
 * @version 1.1
 */
public class JFrameTest extends JFrame {

    /**
     * <p>This constructor begins by making a 
     * call to the super class constructor</p>
     * <code> super ("JFrame Test"); </code>
     * <p>To create the menu, we need to use
     * the JMenuItem, JMenu, and JMenuBar classes 
     * from the {@link javax.swing swing} class. 
     * The JMenuItem holds the dropdown menu options.
     * To organize these menu items, JMenu is used 
     * as a container for the JMenuItem objects, 
     * allowing us to organise the menus into tabs. 
     * The JMenuBar is the container for the whole menu, 
     * and creates a blueprint for which we can map the JMenu</p>
     * 
     * <p> Nothing occurs during clicks on the menu</p>
     * 
     * @see javax.swing.JFrame#constructor(String title) For the usage of this superclass constructor
     */
    public JFrameTest() { 
        super ("JFrame Test");
        setSize (400, 400);
        setVisible (true);
        setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
    }
}
