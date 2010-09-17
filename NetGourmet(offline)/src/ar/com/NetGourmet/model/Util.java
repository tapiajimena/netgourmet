package ar.com.NetGourmet.model;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Util {

	public static NumberFormat myNumberFormat() {
		NumberFormat nf = NumberFormat.getInstance(Locale.US);
		nf.setGroupingUsed(false);
		nf.setMinimumFractionDigits(1);
		nf.setMaximumFractionDigits(2);
		return nf;
	}

	public static void out(String string) {
		System.out.println(string);
		
	}

	public static boolean esNumeroValido(String Num) {
		boolean esNumero;
		int XNumber;
		
		try {
			XNumber=Integer.valueOf(Num);
			if (XNumber <= 0) esNumero = false;
			else esNumero=true;
		}
		catch(NumberFormatException e) {
			esNumero=false;
		}
		
		return esNumero;
	}
}