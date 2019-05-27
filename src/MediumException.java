public class MediumException extends Exception {

    private String exMessage;

    @Override
    public String getMessage() {
        return exMessage;
    }

    public void setMessage(String message) {
        this.exMessage = message;
    }


}
