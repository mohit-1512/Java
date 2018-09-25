package com.mohit.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ClientTest {

	public static void main(String[] args) throws FileNotFoundException, NoSuchMethodException {
		// TODO Auto-generated method stub
		
		ScriptEngineManager engineManager = new ScriptEngineManager();
		ScriptEngine engineByName = engineManager.getEngineByName("nashorn");
		try {
//			engineByName.eval("print('Hello')");
//			engineByName.eval(new FileReader("demo.js"));
			engineByName.eval(new FileReader("funcdemo.js"));
			Invocable invocable = (Invocable)engineByName;
			Object res = invocable.invokeFunction("func", "args");
			System.out.println(res);
			
			
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
