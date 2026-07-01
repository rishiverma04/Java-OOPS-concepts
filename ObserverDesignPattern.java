import java.util.*;
interface Subscriber{
      void update(String video);
}
 class YoutubeSubscriber implements Subscriber{
      private String name;
      public YoutubeSubscriber(String name){
      this.name=name;
      }
 
 @Override
 public void update(String video){
      System.out.println(name+" is watching:"+video);
 }
}
class EmailSubscriber implements Subscriber{
      private String email;
      public EmailSubscriber(String email ){
            this.email=email;
      }
      @Override
      public void update(String video){
            System.out.println("Email sent to:"+email+"new video uploaded"+video);
      }
}
 class PushNotifications implements Subscriber{
      private String userDevice;

      public PushNotifications(String userDevice){
          this.userDevice=userDevice;  
      }
      @Override
      public void update(String video){
            System.out.println("push notifications to:"+userDevice+
      "new video uploaded"+video);
      }
 }
interface YoutubeChannel{
      void addSubscriber(Subscriber subscriber);     
       void removeSubscriber(Subscriber subscriber);
      void notifySubscribers();
}
      class YoutubeChannelImp implements YoutubeChannel{
  private List<Subscriber> subscribers=new ArrayList<>();
  private String video;
  @Override
  public void addSubscriber(Subscriber subscriber){
      subscribers.add(subscriber);
  }
  @Override
  public void removeSubscriber(Subscriber subscriber){
      subscribers.remove(subscriber);
  }
  @Override
  public void notifySubscribers(){
      for(Subscriber s:subscribers){
            s.update(video);
      }
  }
  public void uploadvideo(String video){
      this.video=video;
      notifySubscribers();
  }
 }

 public class ObserverDesignPattern{
      public static void main(String[] args) {
            YoutubeChannelImp channel=new YoutubeChannelImp();

            YoutubeSubscriber alice=new YoutubeSubscriber("Alice ");
            channel.addSubscriber(alice);

            channel.uploadvideo(" c++ tutorial");


      }
 }


