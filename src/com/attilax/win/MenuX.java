package com.attilax.win;

 
import java.util.Iterator;

import org.codehaus.jackson.JsonNode;

import net.sf.json.JSONObject;

import com.attilax.Closure2;
import com.attilax.io.filex;
import com.attilax.json.JsonUtil4jackjson;

public class MenuX {

	public static void main(String[] args) throws Exception {
	//	geneMenu();
//		JsonNode jn2=rootNode.path(1);
//	    Iterator<JsonNode> ite = rootNode.getElements();  
//	    
//	    
//        while (ite.hasNext()) {  
//        	JsonNode temp = ite.next(); 
//        //	temp.get
//        	System.out.println();
//          //  System.out.println(temp.getTextValue());  
//
//        }  
//		//jn.forEach(action);
//		rootNode.size();//==8
//		JsonNode n2=rootNode.get(1);
//	//	jo.
//		System.out.println(txt);
//		 System.out.println(MenuX.class.getResource(".").getPath());

	}

	public    void geneMenu( Closure2 clsr) throws Exception {
		String menuf=MenuX.class.getResource(".").getPath()+"menu.json";
		String txt=filex.read(menuf);
	//	JSONObject jo=JSONObject.fromObject(txt);    cant solu key order ..cause inner sh hashmap
		JsonNode rootNode=	JsonUtil4jackjson.buildNormalBinder().toJsonFromStr(txt);
		  Iterator<String> flds_Ittr= 	rootNode.getFieldNames();
		  while (flds_Ittr.hasNext()) {  
			  String fld=flds_Ittr.next();
			//  System.out.println(fld);
			  clsr.execute(fld);
		  }
	}

}
