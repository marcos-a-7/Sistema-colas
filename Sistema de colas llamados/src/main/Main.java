package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import controlador.ControladorEmpleado;

public class Main
{

	public static void main(String[] args)
	{
		Properties properties = new Properties();
		int box;
		try
		{
			properties.load(new FileInputStream(new File("config.cfg")));
			box = Integer.parseInt(properties.getProperty("box"));

			new ControladorEmpleado(box);
		} catch (UnsupportedEncodingException | FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
