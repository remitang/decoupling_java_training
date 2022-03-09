package fr.lernejo.logger;

public class CompositeLogger implements Logger{
    private Logger firstLog;
    private Logger secondLog;

    public CompositeLogger(Logger first, Logger second){
        firstLog = first;
        secondLog = second;
    }

    @Override
    public void log(String message) {
        firstLog.log(message);
        secondLog.log(message);
    }
}
