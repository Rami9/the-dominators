/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.midlet.*;

/**
 * @author radhi
 */
public class hello extends MIDlet implements CommandListener {
    Display disp =Display.getDisplay(this);
   Form form =new Form("1er APP");
   Form form2 =new Form("2app");
Form form3 =new Form("3rd");

   Command cmd =new Command ("mrigel",Command.OK,0);
   Command cm=new Command("arja3 ",Command.BACK,0);
   public void startApp() {

       form.append("HELLO WORLD");
        form.addCommand(cmd);
        form.setCommandListener(this);
       form3.append("isid");
       form3.setCommandListener(this);
       form2.setCommandListener(this);
       form3.addCommand(cm);
        form2.append("CIAO");
       form2.addCommand(cm);
       form2.addCommand(cmd);
     disp.setCurrent(form);

    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {

        if (cmd ==c&&d==form )
    disp.setCurrent(form2);
if(cm==c&&d==form2)
    disp.setCurrent(form);
        if (cmd ==c&&d==form2 )
    disp.setCurrent(form3);
if(cm==c&&d==form3)
    disp.setCurrent(form2);
       
    }
}
