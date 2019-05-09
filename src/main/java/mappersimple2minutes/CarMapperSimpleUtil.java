package mappersimple2minutes;

public class CarMapperSimpleUtil {

	public static <T> T getCarMapperSimple(Class<T> clazz) throws InstantiationException, IllegalAccessException {

		return clazz.newInstance();
	}
}
