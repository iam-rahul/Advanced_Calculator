public class InvalidInputException extends Exception {
//======================================================================
// [FUNC] Primary class constructor with no parameters.
public InvalidInputException() {
	super();
}

//======================================================================
// [FUNC] Constructor accepting exception message as parameter.
public InvalidInputException(String msg) {
	super(msg);
}
}
