import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Everyone","welcome");
		logininfo.put("Akshay","callofduty");
		logininfo.put("abcd","1234");
		logininfo.put("java","code");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}

