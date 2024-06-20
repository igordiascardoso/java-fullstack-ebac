package br.com.idias.utils;

/**
 * @author idias
 */
public class ReplaceUtils {

	public static String replace(String value, String ...patterns) {
		String retorno = value;
		for (String pattern : patterns) {
			retorno = retorno.replace(pattern, "");
		}
		return retorno;
	}
}
