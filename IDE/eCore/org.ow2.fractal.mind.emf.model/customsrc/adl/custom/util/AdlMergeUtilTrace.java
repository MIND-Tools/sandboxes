package adl.custom.util;

/**
 * <b>Class</b> <i>AdlMergeUtilTrace</i>
 * <p>
 * Custom trace util class for merge util. Use as static class with getInstance() method. Manage indentation and trace type.
 * 
 * @author proustr
 * @model kind="custom trace"
 * @extends
 */
public class AdlMergeUtilTrace {
	private static final String INDENT = " ";
	private int _indCount = 0;
	private String _currentIndent = "";
	private final int LINE_SIZE = 100;
	private final int MAX_IND = 15;
	private static final String _separators = "_-~^.:,*¨°'\"";

	public enum MessageTypes {
		INFO, SUCCESS, ERROR, BUFFER, NOBUFFER, DETAILS, SUBS, CLEAN, LOADER
	};

	private AdlMergeUtilTrace() {
	}

	/**
	 * <b>Method</b> <i>log</i>
	 * <p>
	 * Log a trace in developer console
	 * 
	 * @param objectName
	 *            : Specify current object under treatment.
	 * @param message
	 *            : Log message
	 * @param type
	 *            : Message predefined type
	 * @param bErr
	 *            : If true, message color is red
	 * @param bNewInd
	 *            : if true, add a new indent before message
	 * @param bEndInd
	 *            : if true, remove an indent after message
	 * @param bResetInd
	 *            : if true, reset indent to 0 before message
	 * 
	 * @author proustr
	 */
	public void log(String objectName, String message, MessageTypes type, boolean bErr, boolean bNewInd,
			boolean bEndInd, boolean bResetInd) {
		if (bNewInd) {
			_currentIndent += INDENT;
			_indCount++;
			separator();
		}
		if (bResetInd) {
			_indCount = 0;
			_currentIndent = "";
		}
		if (bErr) {
			System.err.println(formatString(objectName, type, message));
		}
		else {
			System.out.println(formatString(objectName, type, message));
		}
		if (bEndInd && _indCount > 0) {
			separator();
			_indCount--;
			_currentIndent = _currentIndent.subSequence(0, _currentIndent.length() - INDENT.length()).toString();
		}
		if (bResetInd) {
			separator();
		}
	}

/**
	 * <b>Method</b> <i>formatString</i><p>
	 * Format message display with pattern >indent< '[MessageType | ObjectName ] Message'
	 * @param objectName : Name of object concerned by message
	 * @param type : Message predefined type
	 * @param message : Message to display
	 * @return formatted string
	 * 
	 * @author proustr
	 */
	private String formatString(String objectName, MessageTypes type, String message) {
		return _currentIndent + "[" + type.name() + " | " + objectName + "] " + message;
	}

	/**
	 * <b>Method</b> <i>init</i>
	 * <p>
	 * Init logger by reseting private variables.
	 * 
	 * @author proustr
	 */
	public void init() {
		_currentIndent = "";
		_indCount = 0;
	}

	/**
	 * <b>Method</b> <i>separator</i>
	 * <p>
	 * This method writes a separator in a line. character used depends on indentation size.
	 * 
	 * @author proustr
	 */
	private void separator() {
		int index = (_indCount % _separators.length());
		String buff = "";
		int i = 0;
		while (i < LINE_SIZE) {
			buff += _separators.toCharArray()[index];
			i++;
		}
		System.out.println(_currentIndent + buff);
	}

	/**
	 * <b>Class</b> <i>SingletonHolder</i>
	 * <p>
	 * Provides static access on class.
	 * 
	 * @author proustr
	 * @model kind="sub class"
	 */
	private static class SingletonHolder {
		private static AdlMergeUtilTrace instance = new AdlMergeUtilTrace();
	}

	public static AdlMergeUtilTrace getInstance() {
		return SingletonHolder.instance;
	}
}
