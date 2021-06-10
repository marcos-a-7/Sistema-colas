package evento;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author marco
 *
 */
public class Evento implements Serializable
{
	private String date;

	public Evento()
	{
		super();
		this.date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
	}

	/**
	 * @return the date
	 */
	public String getDate()
	{
		return date;
	}

	@Override
	public String toString()
	{
		return "fecha=" + date + " ";
	}

}
