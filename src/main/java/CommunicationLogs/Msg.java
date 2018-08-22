package CommunicationLogs;

public class Msg {

    private int timestamp;

    private int origin;

    private int destination ;

    private String message;

    private MsgStatusCode msgStatusCode;

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MsgStatusCode getMsgStatusCode() {
        return msgStatusCode;
    }

    public void setMsgStatusCode(MsgStatusCode msgStatusCode) {
        this.msgStatusCode = msgStatusCode;
    }
}
