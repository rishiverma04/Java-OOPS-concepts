 /*class LogMessage{
      public void log(String message){
            System.out.println("Log:"+message);
      }
}
public class Logger{
public static void main(String[] args){
      LogMessage logger=new  LogMessage();
      logger.log("App started");
}
}*/

// Better Approach
// only one logger instance inside whole application

  /*  class LogMessage{
      private static LogMessage logmessage=null;
      private LogMessage(){}

      public static LogMessage  getMessage(){
     if(logmessage==null){
      logmessage=new LogMessage();

     }
     return logmessage;
      }
      public void log(String message){
            System.out.println("Log:"+message);
      }
}
public class Logger{
      public static void main(String[] args){
            LogMessage logger= LogMessage.getMessage();
            logger.log("App started");
      }
}
*/
class LoggingMessage{
      private static volatile LoggingMessage instance;

      private LoggingMessage(){}

      public static LoggingMessage getInstance(){
            if(instance==null){
                  synchronized(LoggingMessage.class){
                        if(instance==null){
                              instance=new LoggingMessage();
                        }
                  }
            }
            return instance;
      }
            public void log(String message){
                  System.out.println("Log:"+message);
            }
}
      public class Logger{
            public static void main(String[] args) {
                  LoggingMessage logger= LoggingMessage.getInstance();
                 logger.log("App started");
            }
      }

