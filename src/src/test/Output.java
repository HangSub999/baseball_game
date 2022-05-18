package test;

public class Output {

    public static void outputStrikeBall(int strike,int ball){
        System.out.println(strike+" 스트라이크 "+ball+" 볼");
   }

   public static void outputStrike(int strike){
       System.out.println(strike+" 스트라이크 ");
   }

   public static void outputBall(int ball){
       System.out.println(ball+" 볼");
   }

   public static void outputFourBall(){
       System.out.println("포볼");
   }

   public static void outputCorrectAnswer(){
       System.out.println("3개의 숫자 모두 맞히셨습니다! 게임 종료");
   }

}
