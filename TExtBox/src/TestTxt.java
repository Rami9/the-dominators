/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.*;

/**
 * @author radhi
 */
public class TestTxt extends MIDlet implements CommandListener{
String a,b;
    TextBox t2=new TextBox( "Votre NUMERO",null,100,TextField.PHONENUMBER);
    TextBox t=new TextBox( "Votre NOM",null,100,TextField.ANY);
     TextBox t3=new TextBox( "MSG",null,100,TextField.ANY|TextField.UNEDITABLE);
     Display disp =Display.getDisplay(this);
    Command cmdN=new Command("NEXT",Command.OK,0);
    Command cB=new Command("Back",Command.BACK,0);
Command cEx=new Command ("Exit",Command.EXIT,0);
  
 Command cmd=new Command("SHOW",Command.OK,0);
    public void startApp() {
t.addCommand(cEx);
t.addCommand(cmd);
        disp.setCurrent(t);
    t.setCommandListener(this);
    t3.setCommandListener(this);
       t2.setCommandListener(this);
    t.addCommand(cmdN);
    t2.addCommand(cmd);
t2.addCommand(cB);
t3.addCommand(cB);
disp.setCurrent(t);
List
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
if(cmdN==c&& d==t)
    disp.setCurrent(t2);
if(cmd==c&& d==t2){
a=t.getString();
b=t2.getString();

t3.setString("Nom:"+a+"\n"+"Num:"+b);

    disp.setCurrent(t3);
        }
if(cB==c&&d==t3){
    t2.setString(null);
disp.setCurrent(t2);
}

if(cB==c && d==t2){
    t.setString(null);
disp.setCurrent(t);
}
if(cEx==c)
    notifyDestroyed();
    }
}
