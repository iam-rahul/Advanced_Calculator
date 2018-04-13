public class SyntaxErrorException extends Exception {
//======================================================================
// [FUNC] Primary class constructor with no parameters.
public SyntaxErrorException() {
	super();
}

//======================================================================
// [FUNC] Constructor accepting exception message as parameter.
public SyntaxErrorException(String msg) {
	super(msg);
}
}
