public class CseTeacher extends Teacher{
    String mainSub="programming";
    public static void main(String args []){
        CseTeacher t1= new CseTeacher();
        System.out.println(t1.Uniname + t1.mainSub );
        t1.job();
    }
}
