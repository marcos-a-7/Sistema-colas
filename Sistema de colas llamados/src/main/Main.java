package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import controlador.ControladorEmpleado;

public class Main
{

	public static void main(String[] args)
	{
		int box;
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("config.cfg"), "UTF-8"));
			box = Integer.parseInt(reader.readLine().replaceAll("box ", ""));
			reader.close();

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
