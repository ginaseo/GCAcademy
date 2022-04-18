package p02_inheritance;
interface Movie{
   void title();
   void openDate();
   void actor();
}
//상영관
interface Theater{
   void theaterName(); //상영관명
   void theaterRoom(); //관
}
//호러물
class MovieA implements Movie, Theater{
   private String name;
   private String odate;
   private String actorname;
   MovieA(String name, String odate, String actorname){
      this.name = name;
      this.odate = odate;
      this.actorname = actorname;
   }
   
   @Override
   public void openDate() {
      System.out.println("오픈일자:" + odate);
      
   }
   @Override
   public void actor() {
      System.out.println("주연:" + actorname);
   }

   @Override
   public void title() {
      System.out.println("-----------------");
      System.out.println("제목:" + name);
      openDate();
      actor();
      System.out.println("-----------------");
   }

   @Override
   public void theaterName() {
      System.out.println("영화관:CGV");
   }

   @Override
   public void theaterRoom() {
      System.out.println("상영관:1관");
   }
   
}
//코믹물
class MovieB implements Movie{
   private String name;
   private String odate;
   private String actorname;
   MovieB(String name, String odate, String actorname){
      this.name = name;
      this.odate = odate;
      this.actorname = actorname;
   }
   @Override
   public void title() {
      System.out.println("******************");
      System.out.println("(´▽`ʃ♡ƪ):" + name);
      openDate();
      actor();
      System.out.println("******************");
   }
   
   @Override
   public void openDate() {
      System.out.println("φ(*￣0￣) : " +  odate);
   }
   @Override
   public void actor() {
      System.out.println("나오는이:" + actorname );
   }
   
}

//영화정보
class MovieInfo{
   //영화정보,상영관 정보
   void infoPrint(Movie movie, Theater theater) {
      movie.title();
      theater.theaterName();
      theater.theaterRoom();
      System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★");
   }

}
public class j201217_05_Movie {
   public static void main(String[] args) {
      MovieA movieA1 = new MovieA("런", "2020-11-20","사라폴슨");
      MovieA movieA2 = new MovieA("전설의고향", "2020-12-20","처녀귀신");
      MovieB movieB = new MovieB("이웃사촌", "2020-11-25","오달수");
      
      MovieInfo info = new MovieInfo();
      info.infoPrint(movieA1,movieA1 );
      info.infoPrint(movieA2,movieA2);
//      info.infoPrint(movieB);
      
      
      
      

   }

}