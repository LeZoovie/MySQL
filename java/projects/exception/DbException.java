/**
 * 
 */
package projects.exception;

/**
 * @author Zoovie
 *
 */
@SuppressWarnings("serial")
public class DbException extends RuntimeException {
	/**
	 * @param message
	 */
	public DbException() {
	}
	
	public DbException(String message) {
		super(message);
	}

	public DbException(Throwable cause) {
		super(cause);
	}

	public DbException(String message, Throwable cause) {
		super(message, cause);
	}
}
