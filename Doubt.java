public class Doubt {
        public static int totalSalary(int basic, char grade) {
            //Write your code here

            float allowance = 0;
            float hra = basic * 0.20f;
            float da = basic  *0.50f;
            float pf = basic * 0.11f;
            System.out.println(Math.round(0.1));
            System.out.println(hra+" "+da+" "+pf);
            if (grade == 'A') {
                allowance = 1700;
            } else if (grade == 'B') {
                allowance = 1500;
            } else {
                allowance = 1300;
            }
            return Math.round(basic + hra + da + allowance-pf) ;
        }

        public static void main(String[] args) {
            System.out.println(totalSalary(10000,'A'));
        }
}
