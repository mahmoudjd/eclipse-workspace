package oop.interfaces.game;

class BadInputException extends Exception
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public BadInputException(String message)
    {
        super(message);
    }
}